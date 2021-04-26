fun main(args: Array<String>) {
    var option: String = "0"

    do{
        showMenu()
        option = readLine().toString()
        when(option){
            "1" -> makeRecipe()
            "2" -> getRecipes()
            "3" -> exit()
        }
    }while(option!="3")

}

fun showMenu(){
    println("::Welcome To Recipes Maker::")
    println("::by Mao::")
    println("What do you want to do?")
    println("1. Make a recipe")
    println("2. Get my recipes")
    println("3. Exit")
}

fun makeRecipe(){
    println("::You're going to make a recipe::")
    println("::::")
    println()
}

fun getRecipes(){
    println("::You're going to get your recipes::")
    println("::::")
    println()
}

fun exit(){
    println("::Thanks of lot::")
}