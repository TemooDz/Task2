import kotlin.math.sqrt

class Point  (x: Int , y: Int) {
    private var x = 0
    private var y = 0
    init {
        this.x = x
        this.y = y
    }

    fun setToCenter(){
        x *= -1
        y *= -1
    }
    fun distance(p2: Point): Double {
        val dx = x - p2.x
        val dy = y - p2.y
        return sqrt((dx * dx + dy * dy).toDouble())
    }
    fun equals(other: Point): Boolean {
        if (other == null) return false
        if (other === this) return true
        val p2 = other
        return x == p2.x && y == p2.y
    }
    override fun toString(): String {
        return "(" + x + "," + y + ")"
    }
}
