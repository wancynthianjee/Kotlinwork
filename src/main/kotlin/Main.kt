fun main() {
    val txt="AkiraChix"
    print(txt[0]) // first element/character
    print(txt[2]) // second element/character
    print(txt[3]) //third element/character
    println()
    val stmt = details("Cynthia", "20")
    println(stmt)
    println(textStrings())
    var  mine  = ("Cynthia")
    stat("Cynthia Wanjiru")

}



fun details(name: String, age:String):String{
    val stmt= "Hi, my name is $name and i am $age years old  "
    return stmt
}
fun textStrings():Int{
    val text = "Celeste"
    text.length
    return text.length
}





fun stat(name: String ) {
    var mine = "Cynthia Wanjiru"
    if (mine.equals("Cynthia Wanjiru"))
        println("That's me")
    else{
        println("I don't know who that is ")
    }
}




