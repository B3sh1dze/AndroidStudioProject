import java.lang.Double.parseDouble

fun main() {

    println("დაწყება")
    print("შეიყვანეთ X ცვლადის მნიშვნელობა: ")
    var x: String? = readLine()
    print("შეიყვანეთ Y ცვლადის მნიშვნელობა: ")
    var y: String? = readLine()

    var z: Double
    var resultOfX: String = ""
    var resultOfY: String = ""

    for(char in x!!) {                          // Checking each character of x and taking only numbers
        if(char.isDigit()) {
            resultOfX += char
        }
    }
    for(char in y!!) {                             // Checking each character of y and taking only numbers
        if(char.isDigit()) {
            resultOfY += char
        }
    }
asdasd

    println(resultOfX)                              // string of taken numbers from x
    println(resultOfY)                              // string of taken numbers from y



    val numOfX = resultOfX.toInt()
    val numOfY = resultOfY.toInt()
    z = (numOfX / numOfY).toDouble()
    println(z)





/*    var resultOfX: String? = null
    var resultOfY: String? = null
    var isXNumeric = true
    var numOfX: Int?
    try {
         numOfX = x?.toIntOrNull()
        println(numOfX)
    } catch (e: NumberFormatException) {
        isXNumeric = false
    }
    *//*if(isXNumeric) {
        resultOfX = x?.filter { it.isDigit() }
    }

    var isYNumeric = true
    try {
        val numOfY = y?.toIntOrNull()
    } catch (e: NumberFormatException) {
        isYNumeric = false
    }
    if(isYNumeric) {
        resultOfY = y?.filter { it.isDigit() }
    }*/




}