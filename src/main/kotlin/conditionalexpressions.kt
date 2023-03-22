fun main(args: Array<String>) {
    var marks = 90
    var grade = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else {
        "A"
    }
    println(grade)

    var bettingNumber = 0
    var bettingResult = when(bettingNumber){
        1->{
            "You Lost"
        }
        2->{
            "You Won"
        }
        3->{
            "You Lost"
        }
        else ->{
            "Enter a number 1 - 3 to bet"
        }
    }
    println(bettingNumber)
}