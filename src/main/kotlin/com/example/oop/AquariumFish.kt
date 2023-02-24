package com.example.oop


class Aquarium(/*=> The main constructor */ with: Int =100,height: Int =50,length: Int =20) { /* You can write constructor after name the class */


    var with: Int = with
    var height: Int = height
    var length: Int = length
    var volume: Int
        get() = with* height * length /1000 /* get variable */
        /*private*/ set(value) { /* set variable */
            height = (value*1000)/ (with* length)
        }


    constructor(numberOfFish: Int) :this() { /* Second constructor  */
        val tank =numberOfFish * 2000 *1.1
        height= (tank / (length* with)).toInt()
    }

    init {/* initialization is like function you can use for change The main constructor  */
        println("aquarium initializing")
    }

    init {
        println("volume ${with * height * length / 1000} l")
    }

    fun printsize(){
        println("With: $with cm Height: $height cm Length $length cm")
    }
}

fun buildAquarium(){
    /* test */
    val myaquarium = Aquarium()
    myaquarium.printsize()
    myaquarium.height=70
    myaquarium.printsize()
    val myaquarium1 = Aquarium()
    myaquarium1.printsize()
    val myaquarium2 = Aquarium(with = 25)
    myaquarium2.printsize()
    val myaquarium3 = Aquarium(with = 42, height = 50)
    myaquarium3.printsize()
    val myaquarium4 = Aquarium(with = 62, height = 5, length = 89)
    myaquarium4.printsize()

    val myaquarium6 = Aquarium(numberOfFish = 29)
    myaquarium6.printsize()
    myaquarium6.volume= 70
    myaquarium6.printsize()
    println("volume ${myaquarium6.with * myaquarium6.height * myaquarium6.length / 1000} l")
}
fun main(){
    buildAquarium()
}