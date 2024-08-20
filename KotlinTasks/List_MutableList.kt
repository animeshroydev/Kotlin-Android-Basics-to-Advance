fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size) 
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
     
    for (planet in solarSystem) {
    println(planet)
   }
    println()
    
    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem2.add("Pluto")
   
    solarSystem2.add(3, "Theia")
    solarSystem2[3] = "Future Moon"
    solarSystem2.remove("Future Moon")
    
    solarSystem2.removeAt(8)
 
   
        
    for (planet in solarSystem2) {
    println(planet)
   }
    
    println(solarSystem2.contains("Pluto"))
       println("Mercury" in solarSystem2)
}