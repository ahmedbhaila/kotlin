import java.util.*

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun rgb() = (r * 256 + g) * 256 + b
}

data class Person(val name: String, val age: Int? = null)

class Rectangle(val height: Int, val width: Int) {
    val isSquare : Boolean get(){
        return height == width
    }

    val isRectangle : Boolean get() =  height != width
}


fun max(a: Int, b: Int) = if (a > b) a else b

fun getMnemonic(color: Color) =
    when(color) {
        Color.BLUE -> "Bee"
        Color.GREEN -> "Golf"
        Color.RED -> "Roses"
    }


fun fizzBuzz(i: Int) =
    when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }
fun main(args: Array<String>) {
    val  persons = listOf(Person("Alice"), Person("Bob", age = 29), Person("Mark", 39))
    val oldest = persons.maxBy { it.age ?: 0 }

    val message = "I am a message"
    val num = 42

    // val is final
    val answer: Int = 42

    val names = arrayListOf("Bob", "Alice")
    names.add("John")

    println("The oldest is $oldest" )
    println("Max is " + max(1, 2))

    // greetings
    val greeting = if (args.size > 0) args[0] else "Default"
    println("Greetings, ${greeting}")


    println("More Greetings ${if (args.size > 0) args[0] else "Default2"}")

    val rect1 = Rectangle(1, 2)
    println("Is rect1 a square ${rect1.isSquare}")

    val rect2 = Rectangle(1, 1)
    println("Is rect1 a square ${rect2.isSquare}")


    println("Mnemonic is " + getMnemonic(Color.RED))

    for(i in 1 .. 100) {
        print(fizzBuzz(i))
    }
    println("Next")
    for(i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    // maps and stuff
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A' .. 'Z') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for( (letter, binary) in binaryReps) {
        println("${letter} ${binary}")
    }

    // iterate over numbers
    val numList = listOf(1, 2, 3)
    for( (index, element) in numList.withIndex()) {
        println("${index} ${element}")
    }
}