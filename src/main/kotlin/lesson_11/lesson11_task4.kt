package lesson_11

fun main() {

}

class Category(
    val image: String,
    val title: String,
) {

    private val listOfRecipe = mutableListOf<Recipe>()

    fun addRecipe(recipe: Recipe) = listOfRecipe.add(recipe)

    fun removeRecipe(recipeNumb: Int) = listOfRecipe.removeAt(recipeNumb)

}

class Recipe(
    val number: Int,
    val image: String,
    val tittle: String,
    var favourite: Boolean,
) {

    private val listOfIngredients = mutableListOf<Ingredient>()

    fun addIngredient(ingredient: Ingredient) = listOfIngredients.add(ingredient)

    fun deleteIngredient(ingredientNum: Int) = listOfIngredients.removeAt(ingredientNum)

}

class Ingredient(
    val number: Int,
    val title: String,
    val quantity: Int,
)