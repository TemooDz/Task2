import kotlin.test.assertNotNull


fun main() {
    var Point1 = Point(x = 50, y = 9
    )
    var Point2 = Point(x = 12, y = 1
    )
    var Point3 = Point(x = 1, y = 1
    )
    //Task1
    println(Point1.equals(Point2))

    println(Point2.equals(Point2))

    println(Point2.distance(Point3))


    println(Point3.toString())

    Point1.setToCenter()

    println(Point2.toString())

//   Task2
    val factory : AircraftFactory = `su-25`.Factory
    val `su-25` = factory.create("su-25")
    assertNotNull(`su-25`)
    `su-25`.afterburner()


    val carFactory1 : CarZavod = `Nissan Silvia`.Factory
    val `Nissan silvia` = carFactory1.create("Nissan Silvia")
    assertNotNull(`Nissan silvia`)
    `Nissan silvia`.Drift()

    val carFactory2 : CarZavod = `Nissan Silvia`.Factory
    val Chaser = carFactory2.create("Chaser")
    assertNotNull(`Nissan silvia`)
    `Nissan silvia`.Drift()

}