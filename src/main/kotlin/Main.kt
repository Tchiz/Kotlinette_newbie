fun main(args: Array<String>) {
    exo1SimulatingNetworkCall()
}

fun exo1SimulatingNetworkCall() {
    val transactionDetail = TransactionDetail()
    transactionDetail.initUiState()
    println(transactionDetail.transactionDetailUiState)
    println(transactionDetail.getTransactionSuccess())
    println(transactionDetail.getTransactionError() ?: "Une erreur est survenue")
}