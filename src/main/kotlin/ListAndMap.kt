import java.util.*

fun main(args: Array<String>) {
    println("\n\n*** Exercices Kotlin : List & Map *** \n\n")
    println("EXERCICE 1 \n" + exo1(listOf(
        "Cibee",
        "Jonathan",
        "Sora",
    )))

    println("EXERCICE 2 \n" + exo2(listOf(
        Person("Sora", 6),
        Person("Mélina", 6),
        Person("Léo", 3),
        Person("Louis", 28),
        Person("Marion", 28),
        Person("Cibee", 34),
    )))

    println("EXERCICE 3 \n" + exo3(listOf(
        "Sora",
        "Mélina",
        "Alicia",
        "Axel",
        "Ama",
        "Cibee",
        "Tchi",
        "Lou",
        "Louis",
        "Aria",
        "aria",
        "ama",
        "alicia"
    )))

    println("EXERCICE 4 \n" + exo4(listOf(
        Book("La Croisée des Mondes", "Philip Pullman", 19.75, "romans"),
        Book("Les fourmis", "Bernard Werber", 30.0, "romans"),
        Book("Les 5 Mondes", "5 auteurs réalisateurs", 29.75, "BD"),
        Book("Rouge Karma", "Jean-Christophe Grangé", 10.40, "policiers"),
        Book("Armes", "Alicia Rapine", 15.40, "policiers"),
    )))

    println("EXERCICE 5 \n" + exo5(mapOf(
        "John" to 80,
        "Mary" to 75,
        "David" to 90,
        "Alice" to 85
    )))

    println("EXERCICE 6 \n" + exo6(mapOf(
        "John" to 50,
        "Mary" to 120,
        "David" to 80,
        "Alice" to 200
    )))
}

fun exo1(list: List<String>): List<String> {
    return list.map {
        it.uppercase()
    }
}

fun exo2(listOfPerson: List<Person>): List<String> {
    return listOfPerson.filter {
        it.age > 18
    }.map {
        it.name.uppercase(Locale.FRANCE)
    }
}

fun exo3(listOfString: List<String>): List<String> {
    return listOfString.filter {
        it.first() == 'a' && it.length > 3
    }.map {
        it.uppercase()
    }
}

fun exo4(listOfBooks: List<Book>) : List<String> {
    return listOfBooks.filter {
        (it.category == "romans" || it.category == "policiers") && (it.price in 10.0..20.0)
    }.map {
        it.title.uppercase()
    }.sorted()
}

fun exo5(mapOfNotes: Map<String, Int>): Double {
    var total = 0.0
    mapOfNotes.values.forEach {
        total += it
    }
    var totalOfPerson = 0
    mapOfNotes.keys.forEach {
        totalOfPerson++
    }
    return total / totalOfPerson
}

fun exo5Bis(mapOfNotes: Map<String, Int>): Double {
    //retour de l'exo 5 par Louis CAD
    var total = 0.0
    for (it in mapOfNotes.values) total += it
    return total / mapOfNotes.size
}

fun exo6(mapOfAmounts: Map<String, Int>): Map<String, Int> {
    val newMap: MutableMap<String, Int> = mutableMapOf()
    mapOfAmounts.filter {
        it.value > 100
    }.map {
        newMap[it.key] = it.value * 2
    }
    return newMap
}

fun exo6Bis(mapOfAmounts: Map<String, Int>): Map<String, Int> {
    //retour de l'exo 6 par Louis CAD
    return mapOfAmounts.filter {
        it.value > 100
    }.mapValues { (_, amount) ->
        amount * 2
    }
}
class Book(
    val title: String,
    val author: String,
    val price: Double,
    val category: String
)

class Person(val name: String, val age: Int)