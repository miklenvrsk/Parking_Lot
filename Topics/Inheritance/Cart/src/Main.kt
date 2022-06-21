import kotlin.math.roundToInt

fun main() {


}
fun getFurnitureInfo(furniture: Furniture): String {
    return "furniture info: " + furniture.getFullInfo()
}

open class Furniture(val cost: Int) {
    open fun getFullInfo(): String = "$$cost cost"

    override fun getTax(): String = "$${(cost * 0.25).roundToInt()} tax"
}

override fun getFullFurnitureInfo(furniture: Furniture): String {
    return "furniture info: " + furniture.getFullInfo() + furniture.getTax()
}