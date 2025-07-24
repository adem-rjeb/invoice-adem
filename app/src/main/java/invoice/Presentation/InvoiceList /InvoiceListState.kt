package invoice.presentation
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import  invoice.data.Invoice


@Composable
fun InvoiceListScreen(
    invoices: List<Invoice>,
    onAction: (InvoiceListAction) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(invoices) { invoice ->
            InvoiceItem(invoice, onClick = { onAction(invoice)})
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}
sealed class InvoiceListAction {
    data class OnInvoiceClick(val invoice: Invoice) : InvoiceListAction()
}

