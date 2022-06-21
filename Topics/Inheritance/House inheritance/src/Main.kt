fun main() {
    val rooms = readln().toInt()
    val price = readln().toInt()
    val house = House(rooms, price)
    println(totalPrice(house).toInt())
}

class House(val rooms: Int, var price: Int) {


}


fun totalPrice(house: House): Float {
    if(house.price<0){
        house.price=0
    }else if(house.price>1_000_000){
        house.price=1_000_000
    }
    if(house.rooms <= 1){
        return house.price.toFloat()
    }else if(house.rooms in 2..3){
        return (house.price*1.2).toFloat()
    }else if(house.rooms==4){
        return (house.price*1.25).toFloat()
    }else if(house.rooms in 5..7){
        return (house.price*1.4).toFloat()
    }else if(house.rooms in 8..10){
        return (house.price*1.6).toFloat()
    }else{
        return (house.price*1.6).toFloat()
    }
}