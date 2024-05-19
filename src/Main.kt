fun main() {
    println("Hello World!")

    val mercy = Banker("Mercy", 45)
    mercy.talk("Hello there")
    mercy.eat()
    mercy.introduction()
    val amt = mercy.countMoney(arrayOf(100,100,200,1000,50,100,50))
    println(amt)

    val rehema = Doctor("Rehema", 38)
    rehema.talk("Hi")
    rehema.sleep()
    rehema.introduction()
    rehema.treatPatient("Wato", "Malaria")

    val wanjiku = Farmer("Wanjiku", 47)
    wanjiku.cultivateLand()
    wanjiku.talk("")
    wanjiku.eat()
    wanjiku.sleep()
    wanjiku.introduction()

}

open class Person(var name: String, var age: Int){
    fun talk(words: String){
        println(words)
    }

    open fun eat(){
        println("yum")
    }

    fun sleep(){
        println("zzzzzz")
    }

    fun introduction(){
        println("Hi, I am $name")
    }
}

class Banker(name: String, age: Int): Person(name, age){

    fun countMoney(notes: Array<Int>): Int{
        var sum = 0
        notes.forEach { note-> sum+=note }
        return sum
    }

    override fun eat() {
        println("chop money")
    }
}

class Doctor(name: String, age: Int): Person(name, age){
    fun treatPatient(patient: String, disease: String){
        println("Treat $patient for $disease")
    }


}

class Farmer(name: String, age: Int): Person(name, age){
    fun cultivateLand(){
        println("dig dig dig")
    }

    override fun eat() {
        println("I am eating the food that I've grown")
    }
}