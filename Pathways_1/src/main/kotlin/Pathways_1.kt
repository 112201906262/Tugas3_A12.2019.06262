fun main()
{
    // write first program
    printText()
    printlnText()

    // create birthday message
    val age = 21
    val layers = 5
    message()
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printText(){
    print("Happy Birthday!\n")
    print("Wisnu\n")
    print("You are 21!")
    print("\n")
}
fun printlnText(){
    println("Happy Birthday!")
    println("Wisnu")
    println("You are 21!")
    println("")
}

//

fun message() {
    val name = "Wisnu"
    println("Happy Birthday, ${name}")
}

fun printCakeCandles(age: Int) {
    print (" ")
    repeat(age) {
        print(",")
    }
    println() // Print an empty line

    print(" ") // Print the inset of the candles on the cake
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}



