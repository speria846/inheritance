fun main(){
var m=Car("diana","wargon","blue",6)
    var ca=Bus("RA3","sport","green",34)
    m.identity("red","toyota","wagon")
var v=m.calculateparkingfees(5)
    println(v)
    println(ca.maxtripfare(34.3))
    ca.carry(5)

}

open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var b = people - capacity
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("over capacity by $b people")
        }
    }

    fun identity(color: String, make: String, model: String) {
        println("i am a $color $make $model")
    }

    open fun calculateparkingfees(hours: Int): Int {

        val can = hours * 20

        return can
    }
}
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity) {

    fun maxtripfare(fare: Double): Double {
        var maxFare = fare * capacity
        println(maxFare)
        return maxFare

    }
}