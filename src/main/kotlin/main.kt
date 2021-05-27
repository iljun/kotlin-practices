// 전역 변수 선언이 가능
var globalNumber = 0

fun main(args: Array<String>) {
    println("Hello World!")
    println(sum(3, 5))
    println(sumExpression(3, 5))
    printSum(3, 5)
    printSumVoid(3, 5)

    // val keyword는 readOnly 속성을 가진다.
    val a:Int = 1   // 즉시 할당
    val b = 2       // dataType 유추
    val c:Int
    c = 3

    // var keyword는 read/write가 가능한 변수이다.
    var x = 5
    println(x)
    x += 1
    println(x)

    println(globalNumber)
    increase()
    increase()
    println(globalNumber)

}

fun sum(a:Int, b:Int): Int {
    return a + b
}

fun sumExpression(a: Int, b:Int): Int = a + b

fun printSum(a: Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSumVoid(a: Int, b:Int) {
    println("sum of $a and $b is ${a + b}")
}

fun increase() {
    globalNumber += 1
}
