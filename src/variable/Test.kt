package variable

class Test{
   lateinit  var str :String;

    fun demo() {
        val indexes = arrayOf(1, 2, 3, 4, 5, 6, 7)
        indexes.forEach {
            if (it > 5) {
                return@forEach
            }
            println(it)
        }
        println("End")
    }
}
 fun main(args: Array<String>){
     var test = Test()
    test.demo()
 }