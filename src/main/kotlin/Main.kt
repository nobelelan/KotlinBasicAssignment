
var number = 1234567890
var largestOdd = 0

var oddNumbers = ArrayList<Int>()
var evenNumbers = ArrayList<Int>()

fun main(args: Array<String>) {
    separatingOddEven()

    largestOdd = oddNumbers.max()
    println("Largest odd digit is: $largestOdd")

    printFactorialOfLargestOdd(largestOdd = largestOdd.toLong())
    printFibonacciOfLargestOdd(largestOdd = largestOdd)

    printIndexTwoFromEvenList()
    printEvenListDeleteIndexThree()

}

fun printEvenListDeleteIndexThree() {
    evenNumbers.removeAt(3)
    println("Even list after deleting third index value: \n$evenNumbers")
}

fun printIndexTwoFromEvenList() {
    println("Second position value from even list is ${evenNumbers[1]}")
}

fun separatingOddEven() {
    number.toString().forEach { char ->

        val digit = char.digitToInt()

        if (digit % 2 == 0){
            evenNumbers.add(digit)
        }
        else{
            oddNumbers.add(digit)
        }
    }
}

fun printFactorialOfLargestOdd(largestOdd: Long) {
    var factorial: Long = 1
    for (i in 1..largestOdd) {
        factorial *= i
    }
    println("Factorial of largest odd($largestOdd) = $factorial")
}

fun printFibonacciOfLargestOdd(largestOdd: Int) {
    var term1 = 0
    var term2 = 1

    println("Fibonacci series for the first $largestOdd terms are: ")

    for (i in 1..largestOdd) {
        print("$term1 + ")

        val sum = term1 + term2
        term1 = term2
        term2 = sum
    }
    println()
    println()
}
