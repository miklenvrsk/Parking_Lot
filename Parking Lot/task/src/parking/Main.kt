package parking

fun main() {
    var carspos = MutableList<Car>(20){Car(null,null)}
    var creat = false
    var con = 0
    var contcolor = ""
    var con2 = 0

    while (true){
        val date = readln().split(" ").toMutableList()
        if(date[0] == "exit"){
            break
        }
        if(date[0] == "create"){
            carspos = MutableList(date[1].toInt()){Car(null,null)}
            println("Created a parking lot with ${date[1]} spots.")
            creat = true
            con = 0
        }else if(!creat){
            println("Sorry, a parking lot has not been created.")
            continue
        }
        if(date[0] == "park"){
            if(con == carspos.size){
                println("Sorry, the parking lot is full.")
                continue
            }
            for(i in carspos.indices){
                if(carspos[i].number == null){
                    carspos[i] = Car(date[1],date[2])
                    println("${date[2]} car parked in spot ${i+1}.")
                    con++
                    break
                }
            }



        }else if(date[0] == "leave"){
            carspos[date[1].toInt()-1]=Car("null","null")
            println("Spot ${date[1]} is free.")
            con--
        }else if(date[0] == "status"){
            for(i in carspos.indices){
                if(carspos[i].number != null){
                    println("${i+1} ${carspos[i].number} ${carspos[i].color}")

                }
            }
            if(con == 0){
                println("Parking lot is empty.")

            }
        }else if(date[0] == "reg_by_color"){
            for( i in carspos.indices){
                if(carspos[i].color?.toLowerCase() == date[1].toLowerCase()){
                    if(con2 == 0){
                        contcolor = carspos[i].number.toString()
                    }else{
                        contcolor = contcolor+", " + carspos[i].number
                    }

                    con2++


                }
            }
            con2=0

            if(contcolor != ""){
                println(contcolor)
                contcolor = ""
            }else{
                println("No cars with color ${date[1]} were found.")
            }


        }else if(date[0] == "spot_by_color"){
            for(i in carspos.indices){
                if(carspos[i].color?.toLowerCase() == date[1].toLowerCase()){

                    if(con2 == 0){
                        contcolor = (i+1).toString()
                    }else{
                        contcolor = contcolor+", "+(i + 1)
                    }
                    con2++

                }

            }
            con2=0
            if(contcolor != ""){

                println(contcolor)
                contcolor = ""
            }else{
                println("No cars with color ${date[1]} were found.")
            }
        }else if(date[0] == "spot_by_reg"){
            for(i in carspos.indices){
                if(date[1] == carspos[i].number){
                    contcolor = (i+1).toString()
                }

            }
            if(contcolor != ""){
                println(contcolor)
                contcolor = ""
            }else{
                println("No cars with registration number ${date[1]} were found.")
            }

        }

    }


}

data class Car( val number:String?, val color:String?)


