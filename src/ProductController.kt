class ProductController {
    private val printer = Printer()
    private val datareader = DataReader()
    private val productlist = mutableListOf<Producto>()

fun registerproduct(){
    printer.apply {
        printmsg("Ingrese el nombre del producto")
        val name= readln()
        printmsg("Inserte el precio del producto")
        val Precio= datareader.readdouble()
        printmsg("Inserte el tamaño del producto")
        val Tamaño= readln()
        printmsg("Inserte el color del producto")
        val Color= readln()
        printmsg("Disponibilidad del producto")
        val isAvailable= true
        val addproduct= Producto(name, Precio, Tamaño, Color, isAvailable)
        productlist.add(addproduct)
        printmsg("Producto registrado")
    }
}
fun getproduct(index:Int):Producto{
    return productlist[index]

}
    fun showproducts() {
        var counter = 1
        for (product in productlist) {
            printer.printmsg("$counter" + product.getproductdata())
            counter++
            if (productlist.isEmpty()) {
                printer.printmsg("No hay productos registrados")
            } else {
                var counter = 1
                for (product in productlist) {
                    printer.printmsg("$counter" + product.getproductdata())
                    counter++

                }
            }
        }
    }
    fun noproducts(): Boolean= productlist.isEmpty()
}
