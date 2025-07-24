package com.msjtech.invoice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.msjtech.invoice.ui.theme.InvoiceTheme

import invoice.data.Invoice

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*

import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InvoiceTheme {
                Column {
                val invoice = Invoice(
                    id = "Invoice-2025-001",
                    company = "MsjRide",
                    fromPlace = "Place 1",
                    toPlace = "Place 2",
                    date = "14/07/2025",
                    totalHt = 10.0,
                    taxRate = 0.1,
                    customer = "adem",
                    nbKilometre = 5.3,
                    paymentMethod = "CB"

                )


                }
            }
        }
    }
}




@Composable
fun InvoiceItem(invoice: Invoice, modifier: Modifier = Modifier) {


    Card(
        modifier = modifier
            .padding(top = 30.dp)


            .fillMaxWidth(),
         RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray
        )
    ){
    Column(
        modifier = modifier
            .padding(12.dp)


    ) {
        Text(
            text = "Invoice ID: ${invoice.id}",
            modifier = Modifier.padding(bottom = 4.dp)

        )
        Text(
            text = "Customer: ${invoice.customer}",
            modifier = Modifier.padding(bottom = 4.dp)

        )
        Text(
            text = "date: ${invoice.date}",
            modifier = Modifier.padding(bottom = 4.dp)

            )

        Text(
            text = "total: ${invoice.totalHt}  TND / paymentMethod: ${invoice.paymentMethod} ",
            modifier = Modifier.padding(bottom = 4.dp)


            )
        Text(
            text = "from: ${invoice.fromPlace}  ➔  to : ${invoice.toPlace}  ",
            modifier = Modifier.padding(bottom = 4.dp)

        )
        Text(
            text = "nbKilometre: ${invoice.nbKilometre} KM",
            modifier = Modifier.padding(bottom = 4.dp)

            )



}
    }
}


