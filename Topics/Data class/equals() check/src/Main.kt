data class Client(val name: String, val age: Int, val balance: Int)

fun main() {
    //implement your code here
    var client1: Client? =null
    var client2: Client? = null
    for(i in 1..2){
        val name = readln()
        val age = readln().toInt()
        val balance = readln().toInt()
        if(i == 1){
            client1=Client(name,age,balance)
        }else if(i == 2){
            client2= Client(name,age,balance)
        }
    }
    if(client1?.name==client2?.name&&client1?.age==client2?.age){
        println(true)
    }else{
        println(false)
    }
}