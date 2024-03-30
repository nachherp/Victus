class ClienteController {
    class ClienteControllerr {
        private val printer = Printer()
        private val dataReader = DataReader()
        private val customerlist = mutableListOf<Cliente>()

        fun registercustomer() {

            printer.printmsg("Nombre del cliente")
            val Fullname = readln()
            printer.printmsg("Inserte su correo")
            val email = readln()
            printer.printmsg("Inserte su numero de celular")
            val phnumber = readln().toLong()
            val addcustomer = Cliente(Fullname, email, phnumber)
            customerlist.add(addcustomer)
            printer.printmsg("Cliente registrado")

        }

        fun getcustomer(index: Int): Cliente {
            return customerlist[index]


        }

        fun showcustomer() {
            var counter = 1
            for (customer in customerlist) {
                printer.printmsg("$counter" + customer.getcustomerdata())
                counter++

                if (customerlist.isEmpty()) {
                    printer.printmsg("No hay productos registrados")
                } else {
                    var counter = 1
                    for (customer in customerlist) {
                        printer.printmsg("$counter" + customer.getcustomerdata())
                        counter++
                    }
                }
            }
        }
    }
}
