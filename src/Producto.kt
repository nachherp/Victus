class Producto(
    private val name: String,
    private val Precio: Double,
    private val Tamaño: String,
    private val Color: String,
    private val IsAvailable: Boolean
) {
    fun getproductdata(): String {
        return "Nombre del producto:$name Precio del producto:$Precio Tamaño del producto:$Tamaño Color del producto:$Color Disponible: ${if (IsAvailable) "Si" else "No"} "

    }
}
