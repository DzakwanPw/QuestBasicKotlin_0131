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

fun main() {
    helloWorld()
    variables()
    collection()
}
