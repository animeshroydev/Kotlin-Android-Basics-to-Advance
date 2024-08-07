// Mobile Notification:

fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    
    var message: String
    
    if(numberOfMessages < 100){
        message = "You have $numberOfMessages notification"
    } 
    else {
        message = "Your phone is blowing up! You have $numberOfMessages notifications."
    }
    println(message)
}

// Movie Ticket Price:

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    val price: Int = when {
        age <= 12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        age in 61..100 -> 20
        else -> -1
    }
    return price;
}

// Temperature Converter: 

fun main() {

   val celToFar = 27.0
    val kelToCel = 350.0
    val farToKel = 10.0

    printFinalTemperature(celToFar, "Celsius",
        "Fahrenheit") {
        9.0 / 5.0 * it + 32
    }

    printFinalTemperature(kelToCel, "Kelvin",
        "Celsius", ::kelvinToCelsius)

    printFinalTemperature(farToKel, "Fahrenheit",
        "Kelvin", ::fahrenheitToKelvin)


}

fun kelvinToCelsius(a: Double): Double {
    return a - 273.15
}
fun fahrenheitToKelvin(a: Double): Double {
    return 5.0 / 9.0 * (a - 32) + 273.15
}



fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

// Song Catalog:

fun main() {

   val song1 = Song("Game", "Sidhu Moose Wala", 2022, 350000)
    println("Is it Popular? ${song1.isPopular}")
    println(song1.songDetails())

    val song2 = Song("Tum Hi Ho", "Arijit Singh", 2017, 300)
    println("Is it Popular? ${song2.isPopular}")
    println(song2.songDetails())

}

class Song(private val title: String, private val artist: String,
           private val yearPublished: Int, playCount: Int) {

    val isPopular: String = if (playCount > 1000) "Yes, It is Popular" else "No, It's Unpopular"

    fun songDetails(): String {
        return "$title, performed by $artist, was released in $yearPublished"
    }
}

// Internet Profile:

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    println()
    atiqah.showProfile()
}


class Person(private val name: String, private val age: Int, val hobby: String?, private val referrer: Person?) {
    fun showProfile() {
        println("Name: $name\nAge: $age")
        println("Likes to $hobby.")
        if (referrer != null) {
            println("Has a referred name ${this.name} who likes to ${this.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }

    }
}

// Foldable Phone:

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(private val isFolded: Boolean) : Phone() {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isScreenLightOn = false
    }

    fun unFold() {
        isScreenLightOn = true
    }

}

fun main() {
    val foldablePhone = FoldablePhone(true)
    foldablePhone.unFold()
    foldablePhone.checkPhoneScreenLight()

    val foldablePhone2 = FoldablePhone(true)
    foldablePhone2.fold()
    foldablePhone2.checkPhoneScreenLight()

    val parentClass = Phone()
    parentClass.switchOn()
    parentClass.checkPhoneScreenLight()

    val parentClass2 = Phone()
    parentClass2.switchOff()
    parentClass2.checkPhoneScreenLight()
}

// Special Auction:

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {

    val winningBid: Int

   if (bid != null) {
       if (bid.amount > minimumPrice) {
           winningBid = bid.amount
       }
       else {
           winningBid = minimumPrice
       }
   } else {
       winningBid = minimumPrice
   }
    return winningBid
}





