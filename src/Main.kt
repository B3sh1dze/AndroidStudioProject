import java.lang.Double.parseDouble

fun main() {

    var userInput: Char = '0'
    while (userInput != 'N') {
        println("დაწყება")
        print("შეიყვანეთ X ცვლადის მნიშვნელობა: ")
        var x: String? = readLine()
        print("შეიყვანეთ Y ცვლადის მნიშვნელობა: ")
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

        if (!resultOfX.any { it.isDigit() }) {
            resultOfX = "0"
        }
        if (!resultOfY.any { it.isDigit() }) {
            resultOfY = "0"
        }

        val finalNumOfX = resultOfX.toInt()
        val finalNumOfY = resultOfY.toInt()
        z = (finalNumOfX.toDouble() / finalNumOfY.toDouble())
        println("X და Y განაყოფი არის: $z")

        print("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        var answer = readLine()
        if (answer != null && answer.length == 1) {
            userInput = answer.single().uppercaseChar()
            if (userInput == 'N') {
                println("დასასრული")
                break
            }
        }
    }
}