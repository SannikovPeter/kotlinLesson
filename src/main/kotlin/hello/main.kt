package hello

import org.joda.time.LocalTime

fun main() {
    var localTime = LocalTime()
    println("The current local time is: $localTime")

    var greeter = Greeter()
    println(greeter.sayHello())
}