fun convertStringToDouble(input: String): Double {
    try{
        return input.toDouble()
    }catch (e:Exception){
        return 0.0
    }

}