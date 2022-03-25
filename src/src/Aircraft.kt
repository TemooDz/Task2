interface Aircraft {
    fun afterburner()
}


class `su-25` : Aircraft {
    companion object Factory : AircraftFactory(){
        fun create() = `su-25`()
    }
    override fun afterburner() {
        println("Fly Faster")
    }
}

abstract class AircraftFactory {
     fun create(type: String): Aircraft? {
        return when (type) {

            "Su-25" -> `su-25`()
            else -> null
        }
    }

}