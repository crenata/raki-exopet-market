package com.example.tokoonline.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tokoonline.R
import com.example.tokoonline.adapter.AdapterProduct
import com.example.tokoonline.model.Product

class HomeFragment : Fragment() {
    private lateinit var rvProduct: RecyclerView
    private lateinit var rvProductTerlaris: RecyclerView
    private lateinit var rvElektronik: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        rvProduct = view.findViewById(R.id.rv_produk)
        rvProductTerlaris = view.findViewById(R.id.rv_produkTerlaris)
        rvElektronik = view.findViewById(R.id.rv_elektronik)

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager3 = LinearLayoutManager(activity)
        layoutManager3.orientation = LinearLayoutManager.HORIZONTAL

        rvProduct.adapter = AdapterProduct(arrProduct, requireContext())
        rvProduct.layoutManager = layoutManager

        rvProductTerlaris.adapter = AdapterProduct(arrProductTerlarises, requireContext())
        rvProductTerlaris.layoutManager = layoutManager2

        rvElektronik.adapter = AdapterProduct(arrElektronik, requireContext())
        rvElektronik.layoutManager = layoutManager3

        return view
    }

    private val arrProduct: ArrayList<Product>
        get() {
            val arr = ArrayList<Product>()
            val p1 = Product()
            p1.nama = "Nhandu chromatus"
            p1.harga = "Rp 200,000"
            p1.venom = "New World"
            p1.size = "8 Cm"
            p1.sex = "Female"
            p1.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p1.gambar = R.drawable.img

            val p2 = Product()
            p2.nama = "Nhandu tripepii"
            p2.harga = "Rp 150,000"
            p2.venom = "New World"
            p2.size = "5 Cm"
            p2.sex = "Male"
            p2.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p2.gambar = R.drawable.img_1

            val p3 = Product()
            p3.nama = "Phormingochilus sp.Rufus"
            p3.harga = "Rp 300,000"
            p3.venom = "Old World"
            p3.size = "9 Cm"
            p3.sex = "Female"
            p3.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p3.gambar = R.drawable.img_2

            val p4 = Product()
            p4.nama = "Ceratogyrus darlingi"
            p4.harga = "Rp 200,000"
            p4.venom = "Old World"
            p4.size = "9 Cm"
            p4.sex = "Female"
            p4.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p4.gambar = R.drawable.img_3

            arr.add(p1)
            arr.add(p2)
            arr.add(p3)
            arr.add(p4)

            return arr
        }

    private val arrProductTerlarises: ArrayList<Product>
        get() {
            val arr1 = ArrayList<Product>()
            val p5 = Product()
            p5.nama = "Rhopalurus junceus"
            p5.harga = "Rp 150,000"
            p5.venom = "Medium"
            p5.size = "4 Inch"
            p5.sex = "Male & Female"
            p5.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p5.gambar = R.drawable.img_4

            val p6 = Product()
            p6.nama = "Hottentotta hottentotta"
            p6.harga = "Rp 80,000"
            p6.venom = "Medium"
            p6.size = "5 Inch"
            p6.sex = "Male & Female"
            p6.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p6.gambar = R.drawable.img_11

            val p7 = Product()
            p7.nama = "Parabuthus transvaalicus"
            p7.harga = "Rp 150,000"
            p7.venom = "High"
            p7.size = "6 Inch"
            p7.sex = "Male"
            p7.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p7.gambar = R.drawable.img_5

            val p8 = Product()
            p8.nama = "Centruroides gracilis"
            p8.harga = "Rp 150,000"
            p8.venom = "Medium"
            p8.size = "4 Inch"
            p8.sex = "Male"
            p8.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p8.gambar = R.drawable.img_6

            arr1.add(p5)
            arr1.add(p6)
            arr1.add(p7)
            arr1.add(p8)

            return arr1
        }

    private val arrElektronik: ArrayList<Product>
        get() {
            val arr = ArrayList<Product>()
            val p9 = Product()
            p9.nama = "Scolopendra sp. Toraja"
            p9.harga = "Rp 200,000"
            p9.venom = "High"
            p9.size = "15 Cm"
            p9.sex = "Female"
            p9.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p9.gambar = R.drawable.img_7

            val p10 = Product()
            p10.nama = "Amblypygi"
            p10.harga = "Rp 100,000"
            p10.venom = "-"
            p10.size = "9 Cm"
            p10.sex = "Unsex"
            p10.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p10.gambar = R.drawable.img_8

            val p11 = Product()
            p11.nama = "Solifugae solpugidae"
            p11.harga = "Rp 100,000"
            p11.venom = "-"
            p11.size = "7 Cm"
            p11.sex = "Unsex"
            p11.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p11.gambar = R.drawable.img_9

            val p12 = Product()
            p12.nama = "Anadenobolus monilicornis"
            p12.harga = "Rp 100,000"
            p12.venom = "-"
            p12.size = "13 Cm"
            p12.sex = "Unsex"
            p12.desc = "Untuk detail klaim garansi  DOA dapat ditanyakan langsung kepada seller sebelum melakukan transaksi.Terima Kasih :)"
            p12.gambar = R.drawable.img_10

            arr.add(p9)
            arr.add(p10)
            arr.add(p11)
            arr.add(p12)

            return arr
        }
}