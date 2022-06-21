fun isNumber(input: String):Any{
    val a = input.toIntOrNull()
    if(a!=null){
        return a
    }else{
        return input
    }
}