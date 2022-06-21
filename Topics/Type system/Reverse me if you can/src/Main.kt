fun reverse(input: Int?): Int {
    var a:String
    var b = ""
    if(input!=null){
        a = input.toString()
        for(i in a.indices){
           b+=a[a.length-1-i]
        }
        return b.toInt()
    }else{
        return -1
    }
}