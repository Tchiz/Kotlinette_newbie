class TransactionDetail {
    lateinit var transactionDetailUiState : TransactionDetailUiState
    fun initUiState() {
        transactionDetailUiState = TransactionDetailUiState.Loading
    }
    fun getTransactionSuccess() : TransactionDetailUiState.Success {
        return TransactionDetailUiState.Success(numberOfTransaction = 12)
    }
    fun getTransactionError() : TransactionDetailException.Technical? {
        return TransactionDetailException.Technical(null)
    }
}