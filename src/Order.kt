class Order(
    private val cliente: Cliente,
    private val producto: Producto,
    private val Address: String,
) {
    fun getorderdata(): String {
        return "Nombre del cliente${cliente.getcustomerdata()}"+
                "Producto${producto.getproductdata()}"
                "Direccion del cliente:$Address"
    }
}

