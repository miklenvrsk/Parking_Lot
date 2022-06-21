fun main() {
    val a = readLine()
    if(a==""){
       throw IllegalAccessException()
    }else{
        println("Elvis says: $a")
    }

}