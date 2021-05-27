import org.graalvm.compiler.graph.Graph
import sun.security.provider.certpath.Vertex

// kotlin function은 fun keyword를 통해 정의한다.
fun double(x:Int): Int {
    return 2 * x
}

// func의 parameter는 여러개가 될 수 있으며 ,를 통해 구분한다.
fun powerOf(number: Int, exponent: Int): Int {
    return number * exponent
}

// parameter는 trailing comma을 이용해 선언도 가능하다.
fun trailingComma(
    number: Int,
    exponent: Int
): Int {
    return number * exponent
}

// parameter는 default값을 가질수 있고 = 로 표현한다.
// default값 parameter는 함수 호출 시 값을 넣어주지 않아도 호출이 가능하다.
fun read (
    b: ByteArray,
    off: Int = 0,
    len: Int = b.size
) {

}

fun test() {
    read(ByteArray(3))
}

// 함수를 override할 경우 default value를 정의할 수 없다.
open class A {
    open fun foo(i: Int = 10) {}
}

class B: A() {
    override fun foo(i: Int) {}
}

// parameter가 lambda로 정의 된 경우 parameter로 lambda식을 넘길 수 있다.
fun foo(
    bar: Int = 0,
    baz: Int = 1,
    qux: () -> Unit
) {

}

fun test2() {
    foo (1) { print("lambda test") }
    foo (1,2) { print("lambda test")}
    foo { print("lambda test") }
}

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) { /*...*/ }

// parameter의 매겨변수의 이름을 지정하여 호출 할 수 있다.
// parameter의 이름은 선택적으로 지정할 수 있다.
// 그러나 처음 default parameter 다음에 있는 parameter는 이름을 꼭 지정해야한다.
fun reformatTest() {
    reformat(
        "String!",
        false,
        upperCaseFirstLetter = false,
        divideByCamelHumps = false,
        wordSeparator = '_'
    )
}


// 함수의 가변인자는 vararg로 선언 가능하다.
fun foo2(vararg strings: String) {

}

// 함수가 단순한 표현식을 return하는 경우 중괄호를 생략할 수 있다.
fun double2(x: Int): Int = x *2

// 컴파일러가 타입을 추론 할 수 있는 경우 반환 타입을 생략 가능하다.
fun double3(x: Int) = x *2

// 함수 내부에도 함수 선언이 가능하다.
// 또한 내부의 함수에서 외부의 변수 접근도 가능하다.
fun odd(number: Int) {
    val i = 2
    fun odd(number: Int) {
        if (number % i == 0) return
        odd(number / i)
    }

    odd(number)
}

//Tail recursive functions
// kotlin에서 재귀함수를 지원한다.
// tailrec keyword를 이용해 쉽게 구현할 수 있다.
val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))
