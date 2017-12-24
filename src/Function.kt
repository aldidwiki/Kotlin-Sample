fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2() {
    println("sum of 3 and 5 is ${sum(3, 5)}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) return a else return b
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

// Function with default values
fun foo(a: Int = 0, b: String = "") {

}

// Extending Class Function
fun String.convertToInt() = toIntOrNull()

fun main(args: Array<String>) {

    println(sum(3, 3))
    println(sum2(2, 3))
    printSum(4, 5)
    printSum2()

    println(maxOf2(8, 6))

    println("123".convertToInt())
}