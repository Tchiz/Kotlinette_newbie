fun main(args: Array<String>) {
    val listOfColor = listOf(Color.RED, Color.BLUE, Color.GREEN)
    for (color in listOfColor) {
        getStringColor(color)
    }

    loop@ for (i in 1..2) {
        for (j in 1..5) {
            if (i > 1 && j > 3) break@loop
            println(j)
        }
    }
}

fun getStringColor(color: Color) {
    when (color) {
        Color.RED -> println("red")
        Color.BLUE -> println("blue")
        Color.GREEN -> println("green")
    }
}
enum class Color {
    RED,
    GREEN,
    BLUE
}
