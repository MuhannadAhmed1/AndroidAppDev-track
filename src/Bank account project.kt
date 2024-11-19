//enum class AccountType {
//    Debit,
//    Credit,
//    Checking
//}
//var isSystemOpen = true
//var option: Int = 0
//var accountType: AccountType? = null
//var accountBalance: Int = (0..1000).random()
//
//fun transfer(mode: String){
//    println("what is the amount?")
//    var transferAmount: Int = readln().toInt()
//    when(mode){
//        "withdraw" -> {
//            if(accountType == AccountType.Debit) accountBalance = debitWithdraw(transferAmount)
//            else accountBalance = withdraw(transferAmount)
//        }
//        "deposit" -> {
//            if(accountType == AccountType.Debit) accountBalance = deposit(transferAmount)
//            else accountBalance = creditDeposit(transferAmount)
//        }
//        else -> return
//    }
//}
//
//fun debitWithdraw(amount: Int): Int {
//    if (accountBalance == 0) {
//        println("Can't withdraw, no money on this account!")
//        return accountBalance
//    } else if (amount > accountBalance) {
//        println("Not enough money on this account! The current balance is $accountBalance")
//        println("The amount you withdrew is 0 dollars")
//        return accountBalance
//    } else {
//        return withdraw(amount)
//    }
//}
//
//fun withdraw(amount: Int): Int {
//    println("You successfully withdrew $amount dollars")
//    println("The current balance is ${accountBalance - amount} dollars")
//    return accountBalance - amount
//}
//
//fun deposit(amount: Int): Int{
//    println("You successfully deposited $amount dollars")
//    println("the current balance is ${accountBalance + amount} dollars")
//    return accountBalance + amount
//}
//
//fun creditDeposit(amount: Int): Int {
//    if (accountBalance == 0) {
//        println("You don't need to deposit anything in order to pay off the account since it has already been paid off")
//        return accountBalance
//    } else if (accountBalance + amount > 0) {
//        println("Deposit failed, you tried to pay off an amount greater than the credit balance. The checking balance is $accountBalance dollars.")
//        return 0
//
//    } else if (accountBalance == -amount) {
//        println("you have paid off this account!")
//        accountBalance = 0
//        return 0
//    } else {
//        return deposit(amount)
//    }
//}
//fun main() {
//    println(
//        """Welcome to your banking systemWhat type of banking account would you like to create?
//What type of account would you like to create?
//1. Debit account
//2. Credit account
//3. Checking account
//Choose an option (1,2 or 3)
//"""
//    )
//    var userChoice: Int = readln().toInt()
//    while (userChoice !in 1..3) {
//        userChoice = readln().toInt()
//        println("Choose an option (1,2 or 3")
//    }
//
//    println("the selected option is $userChoice")
//    when (userChoice) {
//        1 -> accountType = AccountType.Debit
//        2 -> accountType = AccountType.Credit
//        3 -> accountType = AccountType.Checking
//    }
//    println("You have created a $accountType account")
//    println("The current balance is $accountBalance")
//
//
//    while(isSystemOpen){
//        println("")
//        println("""What would you like to do?
//        1.Check account balance
//        2.Withdraw money
//        3.Deposit money
//        4.Close the app
//        Which option do you choose (1,2,3 or 4)
//    """.trimMargin())
//        option = readln().toInt()
//        when(option) {
//            1 -> println("The current balance is $accountBalance dollars")
//            2 -> transfer("withdraw")
//            3 -> transfer("deposit")
//            4 -> {
//                isSystemOpen = false
//                println("The system is closed")
//            }
//
//        }
//    }
//}