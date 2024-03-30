class OrderController {
    private val printer = Printer()
    private val dataread = DataReader()
    private val orderlist = mutableListOf<Order>()

    fun createorder(cliente: Cliente, producto: Producto) {
        printer.apply {
            printmsg("Inserte su direccion")
            val address = readln()
            val neworder = Order(cliente, producto, address)
            orderlist.add(neworder)
            cliente.addorder(neworder)
        }
    }

    fun showorders() {
        var counter = 1
        for (order in orderlist) {
            printer.printmsg(order.getorderdata())
            counter++
            if (orderlist.isEmpty()) {
                printer.printmsg("No hay productos registrados")

            } else {
                var counter = 1
                for (order in orderlist) {
                    printer.printmsg("$counter" + order.getorderdata())
                    counter++
                }
            }
        }
    }
}
