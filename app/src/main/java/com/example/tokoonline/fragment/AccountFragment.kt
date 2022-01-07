package com.example.tokoonline.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.tokoonline.activities.LoginActivity
import com.example.tokoonline.data.Constants
import com.example.tokoonline.databinding.FragmentAccountBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class AccountFragment : Fragment() {
    private var auth: FirebaseAuth = Firebase.auth
    private var db: FirebaseFirestore = FirebaseFirestore.getInstance()

    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var logout: Button
    private lateinit var nameTextView: TextView
    private lateinit var phoneTextView: TextView
    private lateinit var emailTextView: TextView

    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAccountBinding.inflate(inflater, container, false)

        swipeRefreshLayout = binding.swipeRefreshLayout
        swipeRefreshLayout.setOnRefreshListener {
            getData()
        }

        logout = binding.logout
        logout.setOnClickListener {
            Firebase.auth.signOut()
            startActivity(Intent(context, LoginActivity::class.java))
            activity?.finish()
        }

        nameTextView = binding.name
        phoneTextView = binding.phone
        emailTextView = binding.email

        getData()

        return binding.root
    }

    private fun getData() {
        swipeRefreshLayout.isRefreshing = true
        db.document("${Constants.userCollectionKey()}/${auth.currentUser?.uid}").get().addOnSuccessListener { snapshot ->
            val userData = snapshot.data
            nameTextView.text = userData?.get("name").toString()
            phoneTextView.text = userData?.get("phone").toString()
            emailTextView.text = userData?.get("email").toString()
        }.addOnFailureListener { error ->
            Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
        }
        swipeRefreshLayout.isRefreshing = false
    }
}