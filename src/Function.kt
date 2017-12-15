fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2() {
    println("sum of 3 and 5 is ${sum(3,5)}")
}

fun main(args: Array<String>) {
    println(sum(3,3))
    printSum2()
}