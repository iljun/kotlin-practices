enum class Color(
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 +b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun mix(color1: Color, color2: Color) =
    when (setOf(color1, color2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

fun mixOptimized(color1: Color, color2: Color) =
    when {
        (color1 == Color.RED && color2 == Color.YELLOW) ||
                (color1 == Color.YELLOW && color2 == Color.RED) -> Color.ORANGE
        (color1 == Color.YELLOW && color2 == Color.BLUE) ||
                (color1 == Color.BLUE && color2 == Color.YELLOW) -> Color.GREEN
        (color1 == Color.BLUE && color2 == Color.VIOLET) ||
                (color1 == Color.VIOLET && color2 == Color.BLUE) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }
