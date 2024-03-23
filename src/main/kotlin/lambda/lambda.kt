package lambda

fun main() {
    var lambda = {a:Int, b: Int ->
        var result = if (a>b)
            a
        else
            b
        result
    }

    var result = lambda (6,3)
    println(result)

}