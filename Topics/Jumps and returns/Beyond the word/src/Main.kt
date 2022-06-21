fun main() {
    // put your code here
    val a = readln()
    val abc = "abcdefghijklmnopqrstuvwxyz"
    var p = ""
    loop@ for(i in abc) {
        for (j in a) {
            if (j == i) {
                continue@loop
            }
        }
        p += i

    }
    println(p)
}