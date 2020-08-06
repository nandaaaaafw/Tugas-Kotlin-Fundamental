package main.kotlin

fun main(){
    val user = setUser("Nanda Fadillah ", "Listening Music and Playing Futsal", 16)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby, and I'm $age years old"