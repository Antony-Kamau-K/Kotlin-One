package oop

fun main(args: Array<String>){
    //inheritance and polymorphism
    var std1 = Student("Delphine", "delphine@gmail.com", "35446")
    std1.login()
    std1.register()

    var t1 = Teacher("King","king@gmail.com", "745787" )

    t1.suspendStudent()
    t1.login()
    t1.register()


    var h2 = HeadTeacher("Ken", "ken@gmail.com", "ji")
    
}

 open class Student(open var name:String,open var email:String, open var password:String){


     fun register(){
        println("You registered with email $email and password $password")
    }

    fun login(){
        println("You logged in with email $email and password $password")
    }
}

 open class Teacher(name: String,email: String, password: String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}

class HeadTeacher(name: String,email: String,password: String): Teacher(name,email,password){
    fun approvedFunds(){
        println("Yeah, I can approve funds")
    }
}
