package objectortention

/**
 * 2.无论你是直接.还是调用get/set最终都是调用get/set
 *
 * groovyf运行时的一个强大
 * groovy中的运行时，代码ppt的的图从下往上看
 */
def person = new Person(name: 'andorid',age: 26)
// 注意这个+必须写在第一行，不能写在下一行
println "the name is ${person.getName()},"+
        "the age is ${person.getAge()}"

// 1、调用类里面不存在的方法的时候，如果没有重写invokeMethod方法的时候会报错，如果重写了就会调用这个invokeMethod方法
// 2、第二种情况就是，重写了person的methodMission方法的时候，如果这个方法不存在的时候，会执行这个methodMission方法，不会执行invokeMethod方法，查看图

//person.cry();

// 为类中动态添加一个属性
Person.metaClass.sex = 'male'
def  perosn1 = new Person(name: 'android',age: 26)
println perosn1.sex

perosn1.sex = 'female'
println "the new sex is:"+perosn1.sex

// 为类动态的添加方法
Person.metaClass.sexUpperCase = {->sex.toUpperCase()}
// 为类动态的添加静态方法
Person.metaClass.static.createPerson={
    String name,int age->new Person(name:name,age:age)
}