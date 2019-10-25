package variable

/**
 * Groovy闭包学习
 * https://www.jianshu.com/p/6dc2074480b8
 */
def clouser = {println  "Hello ${it}！"}
def result = clouser("caonima")
println result

/******************************基本类型与闭包的结合使用****************/
//用来求指定numer的阶乘
int fab(int number) {
    int result = 1
    1.upto(number, { num -> result *= num })
    return result
}
println fab(5)

/**
 * 阶乘
 */
int fab2(int number) {
    int result = 1
    number.downto(1) {
        num -> result *= num
    }
    return result
}
println fab2(5)

/**
 * 累加
 */
int cal(int number) {
    int result = 0
    number.times {int num-> result+=num}
    return result
}
println cal(101)

/*************************************String与闭包的结合使用 https://www.jianshu.com/p/9459f8c13aff **************************/
String str = 'the 2 and 3 is 5'
str.each { String charSingle-> println charSingle}

println("-----------------")
//find来 查找符合条件的第一个
println str.find{

   it->it.isNumber()

}

println str.findAll{String s->s.isNumber()}.toListString()

//any方法,只要有符合条件的,就返回true
println str.any {
    String s -> s.isNumber()
}
//every方法,判断每一个是否符合条件
println str.every {
    String s->s.isNumber()
}
//collect方法:对字符串的每一个字符进行操作,并返回一个list
println str.collect {
    it.toUpperCase()
}.toString()
println("-----------------")

/***********************************闭包的三个重要变量：this，owner，delegate************/
// 这里未完成，查看https://github.com/superzhangbao/GroovySpecification/blob/master/src/variable/clouserstudy.groovy
def clouserVar = {
    println "clouser this:" + this//代表闭包定义处的类
    println "clouser owner:" + owner//代表闭包定义处的类或者对象
    println "clouser delegate:" + delegate//任意一个第三方对象，默认与owner一致
}
