sealed class TransactionDetailUiState {
    object Loading : TransactionDetailUiState()
    data class Success(val numberOfTransaction: Int): TransactionDetailUiState()
    class Error(val transactionDetailException: TransactionDetailException): TransactionDetailUiState ()
}