fun parseInt(string: String): Int? {
    return string.toIntOrNull()
}

fun mul(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)

    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun getStringLength(any: Any): Int? {
    if (any is String)
    //any autocast to `String`
        return any.length
    else
    //any is still type `Any`
        return null
}

fun main(args: Array<String>) {
    mul("3", "2")

    val kata = "Strrr"
    println("Length of $kata is ${getStringLength(kata)}")

    var nullable: Int?
    nullable = 1
    nullable?.let {
        println("not null")
    }
}