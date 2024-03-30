class Cliente (
    private val Fullname: String,
    private val Email: String,
    private val phnumber: Long,
    val orderlist:MutableList<Order> = mutableListOf()
    ) {
    fun getcustomerdata(): String {
        return "$Fullname$Email$phnumber"
    }
    fun addorder(order: Order){
        orderlist.add(order)
    }

}
