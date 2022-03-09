fun main() {
      birds(arrayOf("hen","duck","turkey","owl"))

      cities()
    numbers()
       var x =majina(arrayOf("Wanjiru","Njeri","Kamau"))
    println(x)

}
fun birds(names:Array<String>){
    println(names.contentToString())
}
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { cities->
        println(cities.capitalize())
    }
}
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbers[1].plus(numbers[4])
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    var sort=numbers.sortedArray()
    println(sort.contentToString())

}
fun majina(name:Array<String>):String{
   var virginia= name.contentToString()
    return virginia


}


