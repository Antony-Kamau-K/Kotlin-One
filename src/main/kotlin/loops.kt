fun main(args: Array<String>) {
    // 1. While loops
        // while loop
    var countOne = 0
    while (countOne <= 5) {
        println(countOne)
        countOne++
    }
        //do while
    var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    }while (countTwo <= 15)
    //2. For loops
    // for in loop
     for(num in 20 .. 25) {
         println(num)
     }

    for (num2 in 50 .. 45){
        println(num2)
    }

    // for each loop
    var names = listOf("June", "Chris", "Berur", "Amal", "Shi")
    names.forEach {
        println(it)
    }
    //3. Repeat Loop

    repeat(times = 5){
        println("Hello World")
    }

}





