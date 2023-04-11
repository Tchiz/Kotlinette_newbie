sealed class TransactionDetailException {
    class BadRequest (val errorMessage : String?)
    class InternalServerError (val errorMessage : String?)
    class Network (val errorMessage : String?)
    class Technical (val errorMessage : String?)
}