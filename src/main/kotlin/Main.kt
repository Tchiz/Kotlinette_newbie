fun main() {
    println("LES EXERCICES DE MORAD")
    exo1SimulatingNetworkCall()
    exo2HowManyDaysIn20thCentury()
}
fun exo1SimulatingNetworkCall() {
    println("EXO 1")
    val transactionDetail = TransactionDetail()
    transactionDetail.initUiState()
    println(transactionDetail.transactionDetailUiState)
    println(transactionDetail.getTransactionSuccess())
    println(transactionDetail.getTransactionError() ?: "Une erreur est survenue")
}

// EXO 2 ------------------------------

fun exo2HowManyDaysIn20thCentury() {
    println("EXO 2")
    for(year in 1900..2000) {
        getNumberOfDaysInThisYear(year)
    }
}

fun getNumberOfDaysInThisYear(year: Int) {
    var total = 0
    val monthsOfAYear = listOf<Month>(
        Month.JANUARY,
        Month.FEBRUARY,
        Month.MARCH,
        Month.APRIL,
        Month.MAY,
        Month.JUNE,
        Month.JULY,
        Month.AUGUST,
        Month.SEPTEMBER,
        Month.OCTOBER,
        Month.NOVEMBER,
        Month.DECEMBER
    )
    for(month in monthsOfAYear) {
        val leapYear = if(year == 1900 || year == 2000) year.toDouble() % 400 == 0.0 else year.toDouble() % 4 == 0.0
        total += getNumberOfDaysInThisMonth(month, leapYear)
    }
    println("$year -> $total")
}
fun getNumberOfDaysInThisMonth(month: Month, leapYear: Boolean): Int {
    val numberOfDays = when(month) {
        Month.SEPTEMBER, Month.APRIL, Month.JUNE, Month.NOVEMBER -> 30
        Month.FEBRUARY -> {
            if(leapYear) 29 else 28
        }
        else -> 31
    }
    return numberOfDays
}
enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}


// FIN EXO 2 ------------------------------