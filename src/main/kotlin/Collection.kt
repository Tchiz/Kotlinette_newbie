val map = mapOf(ColorBis.BLUE to "blue", ColorBis.GREEN to "green", ColorBis.RED to "red")
fun main(args: Array<String>) {
    //exoList1()
    //exoList2()
    //exoMap1()
    //exoMap2()
    //exoMap3()
    //exoFilter() // ce que je garde
    exoMapOperator()
    /* exemple
    val randoms = List(size = 50) {
        println("$it")
    }

    val randomBis: List<Int> = (10..100).toList()
    randomBis.forEach {
        println("$it")
    }
     */
}

fun exoList1() {
    val list = listOf("one", "two", "three", "four")
    println(list.size)
    println(list[1])
    println(list.get(1))
}
fun exoList2() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.removeAt(0)
    list[1] = 1
    println(list)
}
fun exoMap1() {
    val map = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    map.keys.forEach{
        println(it)
    }
    map.values.forEach{
        println(it)
    }
    if(map.containsKey("key2")) println(map["key2"])
}
fun exoMap2() {
    val map = mutableMapOf("one" to 1, "two" to 2)
    map["three"] = 3
    map["one"] = 15
    map.entries.forEach{
        println(it)
    }
}
fun exoMap3() {
    val colors = List(10){
        map.keys.shuffled().first()
    }
    for(color in colors) {
        println("$color ${map[color]}")
    }
}
fun exoFilter() {
    val list = (0..50).toList()
    list.filter {
        it % 2 == 0
    }.forEach {
        println(it)
    }
}

fun exoMapOperator() {
    val list = (1..10).toList()
    list.map {
        it * 10
    }.forEach {
        println(it)
    }
}
fun getStringColorBis(color: Color) {
    when (color) {
        Color.RED -> println("red")
        Color.BLUE -> println("blue")
        Color.GREEN -> println("green")
    }
}
enum class ColorBis {
    RED,
    GREEN,
    BLUE
}
