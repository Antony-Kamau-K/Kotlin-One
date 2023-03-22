fun main(args: Array<String>){
    var names = arrayListOf("Phoebe", "Joseph", "Antony")
    println(names[1])
    names.add("Attuti")
    names.add("Faith")

    //You can print using a For Loop
    for (i in 0 until(names.size - 1)){
        println(names[i])
    }
    //You can use a foreach loop as well
    names.forEach{
        println(it)
    }
}



