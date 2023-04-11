fun main()
{
    var person =Human("Esther",21,50.0)
    println(person.name)
    println(person.age)
    println(person.weight)

    person.eat(1)
    person.speak("Strive for excellence")
    person.birthday()
 var client=User("Teni","Uyomeyo","teniuyomeyo@gamail.com","756496760","LMAZX87")

    println(client.firstName)
    println(client.lastName)
    println (client.email)
    println(client.phoneNumber)
println(client.passWord)
}

//Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
// eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
class Human ( var name:String, var age:Int, var weight:Double) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }


    //speak(speech: String) :Prints the string passed to it
    fun speak(speech: String) {
        println("$speech")
    }

    //birthday( ) :Increments the human’s age by 1
    fun birthday() {
        age++
        println(age)
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var passWord:String)