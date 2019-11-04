package variable

class Test{
     var str :String?=null
           ;

    fun demo() {
//        val indexes = arrayOf(1, 2, 3, 4, 5, 6, 7)
//        indexes.forEach {
//            if (it > 5) {
//                return@forEach
//            }
//            println(it)
//        }
//        if(this::str.isInitialized){
//            println("End")
//        }
        println(str!!.length)

    }
}
 fun main(args: Array<String>){
     var test = Test()
    test.demo()

//     var name: String? = ""
//     var people: String = name!!
//     println(people.length)
//     println("person="+people)
 }