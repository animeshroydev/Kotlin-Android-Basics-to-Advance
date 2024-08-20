fun main() {
   val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
   println(solarSystem.size)
   
   solarSystem.add("Pluto")
   println(solarSystem.size)
   println(solarSystem.contains("Pluto"))

   
   for(planet in solarSystem) {
       println(planet)
   }
   
      println()
   solarSystem.add("Pluto")
   println(solarSystem.size)
   solarSystem.remove("Pluto")
    println(solarSystem.size)
}