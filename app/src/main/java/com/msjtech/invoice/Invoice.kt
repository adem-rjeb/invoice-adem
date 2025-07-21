package com.msjtech.invoice

data class Invoice(
    val id: String,
    val totalHt: Double,
    val taxRate: Double,
    val date: String,
    val fromPlace : String,
    val toPlace: String,
    val nbKilometre: Double,
    val company : String,
    val customer : String,
    val paymentMethod: String,
)
