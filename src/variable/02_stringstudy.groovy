package variable

/**
 * Groovy字符串学习
 * https://blog.csdn.net/dora_310/article/details/52895835
 *
 * https://www.jianshu.com/p/8127742e0569
 */
// \是输出特殊字符
def name = 'a single \'a\' string'

//println name

def name1 = '''three single string'''
println name1

// 三个单引号的作用就是格式化输出
def thupleName = '''
line one
line two
line three
'''
//println thupleName

def doubleName = "this a common String"
//println doubleName.class

// 双引号 可以进行变量的引用写表达式，单引号不行
def nameStr = "Qndroid"
def sayHello = "Hello: ${nameStr}"
//println sayHello
//println sayHello.class

def sum = "the sum of 2 and 3 equals ${2 + 3}" //可扩展做任意的表达式
//println sum
def result = echo(sum)
//println result.class

String echo(String message) {
    return message
}

/* ==================字符串的方法=================== */
// center(Number numberOfChars,CharSequence padding) ,将字符串作为中心进行填充
def str = "groovy"
println str.center(5,"a") //结果：groovy
println str.center(6,"a") //结果：groovy
println str.center(7,"a") //结果：groovya
println str.center(8,"a") //结果：agroovya
println str.center(9,"a") //结果：agroovyaa
println str.center(8)     //结果： groovy ，不传padding代表以空格填充

//PS:当numberOfChars小于或等于str本身的长度时，不进行填充操作，大于则用pandding扩展至长度numberOfChars，从字符串的右边（尾）进行填充，再到左边（头）

//padLeft(Number numberOfChars,CharSequence padding) ,在字符串的左边进行填充

//c. padRight(Number numberOfChars,CharSequence padding),在字符串的右边进行填充
//println str.padLeft(8, 'a')


def str2 = 'Hello'
//println str == str2
println str2[0]
println str2[0..3]
println str - str2
println str2.reverse()//反转
println str2.capitalize()//首字母大写
println str2.isNumber()//判断是不是数字型字符串

