import java.time.temporal.TemporalAmount

fun main(){
    multiples()
    var equity=CurrentAccount(1234567, "Maria",100.0)
    equity.deposit(200.0)
    equity.withdraw(200.0)
    equity.details()
    var savings= SavingsAccount(3456789,"Simiyu",400.0,3)
    savings.withdraw(100.0)
    savings.withdraw(100.0)
    savings.withdraw(100.0)

}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
class name(var first: Char,var lastChar: Char,var length:Int,) {
    fun random(word: String) {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var first = word.first()
       var lastChar = word.last()
      var    length=word.count()


    }
    }
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun input(password:String):Boolean{
    var pas= password.count()
    if (pas in  8..16 ){
        return true
    }
    else if(password ==="password"){
        return false
    }





//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples() {
    var limit = 1..1000
    for (l in limit) {
        if (l % 6 == 0 && l % 8 == 0) {
            println("Bingo")
        } else if (l % 6 == 0) {
            println(l)
        } else if (l % 8 == 0) {
            println(l)
        }
    }

}


//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
    fun deposit(amount: Double){
        val deposit=amount+balance
        println(deposit)
    }
    open fun withdraw(amount: Double){
        val withdrawal= balance-amount
        println(withdrawal)
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountNumber:Int, accountName:String,balance:Double,var  withdrawals:Int):CurrentAccount(accountNumber,accountName,balance) {
    override fun withdraw(amount: Double) {
        if (withdrawals < 4) {
            withdrawals++
            println(balance - amount)
        } else {
            println(null)
        }
    }

}