// class를 상속하려면 open keywork가 필요하다.
open class Shape

// 생성자는 class keyword에 붙여서 사용가능하며, 상속받을 class는 : 로 작성한다.
class Rectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}
