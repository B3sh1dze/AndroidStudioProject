import java.lang.Double.parseDouble

fun main() {

    var userInput: Char = '0'
    while (userInput != 'N') {
        println("Start")
        print("Enter the meaning of X: ")
        var x: String? = readLine()
        print("Enter the meaning of Y: ")
        var y: String? = readLine()

        var z: Double
        var resultOfX: String = ""
        var resultOfY: String = ""

        for (char in x!!) {
            if (char.isDigit()) {
                resultOfX += char
            }
        }

        for (char in y!!) {
            if (char.isDigit()) {
                resultOfY += char
            }
        }

        if(!resultOfX.any { it.isDigit()}) {
            resultOfX = "0"
        }

        if(!resultOfY.any { it.isDigit()}) {
            resultOfY = "0"
        }

        val finalNumOfX = resultOfX.toInt()
        val finalNumOfY = resultOfY.toInt()

        if (finalNumOfY == 0) {
            println("You can't divide by zero.")
        } else {
            z = (finalNumOfX.toDouble() / finalNumOfY.toDouble())
            println("$finalNumOfX divided by $finalNumOfY is: $z")
        }

        print("Do you want to restart the program? <Y/N>")

        var userChoice = readLine()
        if (userChoice != null && userChoice.length == 1) {
            userInput = userChoice.single().uppercaseChar()
            if (userInput == 'N') {
                println("The end")
                break
            }
        }
    }
}