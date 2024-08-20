fun main() {
   val solarSystem = mutableMapOf(
    "Mercury" to 0,
    "Venus" to 0,
    "Earth" to 1,
    "Mars" to 2,
    "Jupiter" to 79,
    "Saturn" to 82,
    "Uranus" to 27,
    "Neptune" to 14
)
   
   println(solarSystem.size)
   solarSystem["Pluto"] = 5
   println(solarSystem.size)
   println(solarSystem["Pluto"])
   println(solarSystem.get("Theia"))
   solarSystem.remove("Pluto")
   println(solarSystem.size)
   
   solarSystem["Jupiter"] = 78
   println(solarSystem["Jupiter"])
   
   /*
    * Summary
    * Arrays store ordered data of the same type, and have a fixed size.
    *  Arrays are used to implement many of the other collection types.
    * Lists are a resizable, ordered collection.
    * Sets are unordered collections and cannot contain duplicates.
    * Maps work similarly to sets and store pairs of keys and values of the specified type.
    * 
    * */
}