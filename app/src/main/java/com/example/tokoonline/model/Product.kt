package com.example.tokoonline.model

import java.io.Serializable

class Product : Serializable {
    lateinit var nama: String
    lateinit var harga: String
    lateinit var venom: String
    lateinit var size: String
    lateinit var sex: String
    lateinit var desc: String
    var gambar: Int = 0
}