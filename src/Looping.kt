fun main(args: Array<String>) {

    val items = listOf("apple", "banana", "kiwi")

    // Using for loop
    for (x in 1..5) {
        print(x)
    }
    println()

    for (i in 5 downTo 1 step 2) {
        print(i)
    }
    println()

    for (item in items) {
        println(item)
    }

    // Using for loop
    for (index in items.indices) {
        println("Items at $index is ${items[index]}")
    }

    // Using while loop
    var index = 0
    while (index < items.size) {
        println("Items at $index is ${items[index]}")
        index++
    }

}