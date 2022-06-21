fun main() {
    // put your code here
    val a = readln()
    var numer = ""
    for(i in a){
        if(i.isDigit()){
            numer = i.toString()
            break
        }
    }
    println(numer)
}