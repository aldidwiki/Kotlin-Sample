fun describe(any: Any): String {
    return when (any) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unknown"
    }
}

fun isString(any: Any): Boolean {
    if (any is String) return true else return false
}

fun main(args: Array<String>) {
    println(describe("Hello"))
    println(isString(111))

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
        println(list.lastIndex) //2
        println(list.size) //3
    }

    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("x fits in range")
    }

    val items = setOf("orange", "apple")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "apple", "avocado", "kiwi")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }

}