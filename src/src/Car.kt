interface Car {
    fun Drift();
}

class `Nissan Silvia` : Car {
    companion object Factory : CarZavod() {
        fun create() = `Nissan Silvia`()
    }
    override fun Drift() {
        println("drift!!!!")
    }
}

class Chaser : Car {
    companion object Factory : CarZavod() {
        fun create() = Chaser()
    }
    override fun Drift() {
        println("Drift")
    }
}

abstract class CarZavod {
    fun create(type: String): Car? {
        return when (type) {
            "Nissan" -> `Nissan Silvia`()
            "Chaser" -> Chaser()
            else -> null
        }
    }
}
