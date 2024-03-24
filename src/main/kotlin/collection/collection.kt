package collection

fun main(){
    val weekSales: List<Int> = listOf(45,87,45,77,1,38)
    val weekSales2: MutableList<Int> = mutableListOf(1,2,3)

    weekSales2.add(23)

    var counter = 0
    for(sale in weekSales){
        if (sale > 10)
            counter
    }
    println(counter)
}