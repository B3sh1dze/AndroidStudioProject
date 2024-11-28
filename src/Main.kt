import java.lang.Double.parseDouble

fun main() {

    var continueProgram: Char = '0'
    while (continueProgram != 'N') {
        println("დაწყება")
        print("შეიყვანეთ X ცვლადის მნიშვნელობა: ")
        var x: String? = readLine()
        print("შეიყვანეთ Y ცვლადის მნიშვნელობა: ")
        var y: String? = readLine()

        var z: Double
        var numericPartOfX: String = ""
        var numericPartOfY: String = ""

        for (char in x!!) {
            if (char.isDigit()) {
                numericPartOfX += char
            }
        }
        for (char in y!!) {
            if (char.isDigit()) {
                numericPartOfY += char
            }
        }
        if (!numericPartOfX.any { it.isDigit() }) {
            numericPartOfX = "0"
        }
        if (!numericPartOfY.any { it.isDigit() }) {
            numericPartOfY = "0"
        }

        val numberX = numericPartOfX.toInt()
        val numberY = numericPartOfY.toInt()
        z = (numberX.toDouble() / numberY.toDouble())
        println("X და Y განაყოფი არის: $z")

        print("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        var answer = readLine()
        if (answer != null && answer.length == 1) {
            continueProgram = answer.single().uppercaseChar()
            if (continueProgram == 'N') {
                println("დასასრული")
                break
            }
        }
    }
}