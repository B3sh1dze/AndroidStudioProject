import java.lang.Double.parseDouble

fun main() {

    var userInput: Char = '0'
    while (userInput != 'N') {
        println("Start")
        print("Enter the meaning of X: ")
        var x: String? = readLine()
        print("Enter the meaning of Y: ")
        var y: String? = readLine()

        // declared to show taken numbers from x and y
        var z: Double
        var resultOfX: String = ""
        var resultOfY: String = ""

        // Checking each character of x and taking only numbers
        for (char in x!!) {
            if (char.isDigit()) {
                resultOfX += char
            }
        }

        // Checking each character of y and taking only numbers
        for (char in y!!) {
            if (char.isDigit()) {
                resultOfY += char
            }
        }

        // Checking if X contains numbers or not
        if(!resultOfX.any { it.isDigit()}) {
            resultOfX = "0"
        }

        // Checking if Y contains numbers or not
        if(!resultOfY.any { it.isDigit()}) {
            resultOfY = "0"
        }

        // converting taken numbers string to integer
        val finalNumOfX = resultOfX.toInt()
        val finalNumOfY = resultOfY.toInt()

        // Checking if divisor is equal to zero and making division if it;s not zero
        if (finalNumOfY == 0) {
            println("You can't divide by zero.")
        } else {
            z = (finalNumOfX.toDouble() / finalNumOfY.toDouble())
            println("$finalNumOfX divided by $finalNumOfY is: $z")
        }

        // Asking user to restart or terminate program
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