fun main() {
    val shoppingList = mutableListOf<String>()
    println("Welcome to the Shopping List App!")
    while (true) {
        println("What do you want to do?")
        println("1. Add item to the list")
        println("2. Remove item from the list")
        println("3. Display shopping list")
        println("4. Exit")

        val choice = readlnOrNull()?.toIntOrNull() ?: continue

        when (choice) {
            1 -> {
                println("Enter the item you want to add:")
                val newItem = readlnOrNull()?.trim()
                if (!newItem.isNullOrEmpty()) {
                    shoppingList.add(newItem)
                    println("$newItem has been added to the shopping list.")
                } else {
                    println("Invalid input. Please enter a valid item name.")
                }
            }
            2 -> {
                println("Enter the item you want to remove:")
                val itemToRemove = readlnOrNull()?.trim()
                if (itemToRemove != null) {
                    if (shoppingList.remove(itemToRemove)) {
                        println("$itemToRemove has been removed from the shopping list.")
                    } else {
                        println("$itemToRemove is not in the shopping list.")
                    }
                } else {
                    println("Invalid input. Please enter a valid item name.")
                }
            }
           3 -> {
               if(shoppingList.isNotEmpty()) {
                   println("Your shopping list:")
                    for(item in shoppingList) {
                        println("- $item")
                    }
               } else {
                   println("Your shopping list is empty.")
               }
           }
            4 -> {
                println("Exiting the Shopping List App. Goodbye!")
                return
            }
            else -> {
                println("invalid choice. Please select a valid option.")
            }
        }
    }
}