fun helloWorld() {
    println("Hello, world!")
}

fun variables() {
    val customers = 10
    var nama = "Budi"
    nama = "Andi"
    println("There are $customers customers, nama: $nama")
}

fun collection() {
    val shapes = mutableListOf("triangle", "square", "circle")
    shapes.add("star")
    println(shapes)
    val fruit = setOf("apple", "banana", "cherry", "cherry")
    println(fruit)
    val juice = mapOf("apple" to 100, "kiwi" to 190)
    println("Harga apple: ${juice["apple"]}")
}

fun conditional() {
    val check = true
    val d = if (check) 1 else 2
    val result = when ("Hello") {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println("$d $result")
}

fun loops() {
    for (number in 1..5) print(number)
    println()
    var i = 0
    while (i < 3) { println("while $i"); i++ }
}

fun main() {
    helloWorld()
    variables()
    collection()
    conditional()
    loops()
}
