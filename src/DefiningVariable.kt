fun main(args: Array<String>) {

    /**************************************************
     * Val tidak bisa diinisialisasi ulang (ReadOnly)
     * Var bisa diinisialisasi ulang
     **************************************************/

    //Inisialisasi lengkap
    val aInt: Int = 1
    val aString: String = "lol"
    val aDouble: Double = 12.4

    // Langsung otomatis jadi Integer
    val b = 2

    //Inisialisasi jadi Integer lalu diisi 1
    val c: Int; c = 1

    //Inisialisasi otomatis jadi variabel Integer
    var x = 5
    x += 2

    var map = mapOf("a" to 1, "b" to 2)
    println(map["a"])
}