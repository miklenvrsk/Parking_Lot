fun main() {
    // put your code here
    val a = readln().first()
    val abc = "abcdefghijklmnopqrstuvwxyz"
    var p = ""

    for(i in abc){
        if(i == a) {
            break
        }
        p += i
    }
    println(p)
}