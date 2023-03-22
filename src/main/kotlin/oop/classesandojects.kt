package oop

fun main(args: Array<String>){
    var f1 = Fruit("mango","Yellow", "280g",30.0)
    var f2 = Fruit("Apple","Pink", "250g",50.0)


    var c1 = Car("Toyota", "KDJ 456F", 2000000.0)
    var c2 = Car("Mercedes", "KDg 456F", 3000000.0)


}

class Fruit(name: String, colour: String, size:String, price:Double){
    //declare the properties to be initialised
    var name:String
    var colour:String
    var size:String
    var price:Double
    // Initialised the properties
    init{
        this.name = name
        this.colour = colour
        this.size = size
        this.price = price
    }

}
class Car(model:String,reg_no:String, price:Double){
    var model:String
    var reg_no:String
    var price:Double

    init{
        this.model = model
        this.reg_no = reg_no
        this.price = price
    }
    fun accellerate(){
        println("Yeah, I can accelerate")
    }

    fun brake(){
        println("I am a $model and i can bake")
    }

}
    // These are class function

