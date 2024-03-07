package machine

class CoffeeMachine(private var waterCurrent: Int = 400,
                    private var milkCurrent: Int = 540,
                    private var beansCurrent: Int = 120,
                    private var cupsCurrent: Int = 9,
                    private var moneyCurrent: Int = 550) {

    private val espresso = CoffeeType(water = 250, milk = 0, beans = 16, cost = 4)
    private val latte = CoffeeType(water = 350, milk = 75, beans = 20, cost = 7)
    private val cappuccino = CoffeeType(water = 200, milk = 100, beans = 12, cost = 6)


    fun processAction(action: String) {
        when(action) {
            "buy" -> buyCoffee()
            "fill" -> fillResources()
            "take" -> takeMoney()
            "remaining" -> printRemaining()
        }
    }

    private fun buyCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        val choice = readln()
        val selectedCoffee = when (choice) {
            "1" -> espresso
            "2" -> latte
            "3" -> cappuccino
            "back" -> return
            else -> null
        }

        selectedCoffee?.let {
            // Check if there are enough ingredients to make the selected coffee
            if (waterCurrent >= it.water && milkCurrent >= it.milk && beansCurrent >= it.beans && cupsCurrent != 0) {
                println("I have enough resources, making you a coffee!\n")
                waterCurrent -= it.water
                milkCurrent -= it.milk
                beansCurrent -= it.beans
                cupsCurrent -= 1
                moneyCurrent += it.cost
            } else {
                println("Sorry, not enough resources!\n")
            }
        }
    }

    private fun fillResources() {
        println("Write how many ml of water you want to add: ")
        waterCurrent += readln().toInt()
        println("Write how many ml of milk you want to add: ")
        milkCurrent += readln().toInt()
        println("Write how many grams of coffee beans you want to add: ")
        beansCurrent += readln().toInt()
        println("Write how many disposable cups you want to add: ")
        cupsCurrent += readln().toInt()
    }

    private fun takeMoney() {
        println("I gave you $$moneyCurrent")
        moneyCurrent = 0
    }

    private fun printRemaining() {
        println("\nThe coffee machine has:")
        println("$waterCurrent ml of water")
        println("$milkCurrent ml of milk")
        println("$beansCurrent g of coffee beans")
        println("$cupsCurrent disposable cups")
        println("$$moneyCurrent of money\n")
    }
}

data class CoffeeType(val water: Int, val milk: Int, val beans: Int, val cost: Int)

fun main() {
    val coffeeMachine = CoffeeMachine()

    do {
        println("Write action (buy, fill, take, remaining, exit):")
        val action = readln()
        if (action != "exit") {
            coffeeMachine.processAction(action)
        }
    } while (action != "exit")
}
