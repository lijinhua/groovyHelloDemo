package objectortention

// Trait可以被看作是具有方法实现和状态的接口
/**
 * 在scala中 traits的出现是为了代替java中的interface，与interface不同的是，
 * interface只可以声明抽象方法，而traits可以声明抽象/具体属性，抽象/具体方法。可以这么说，
 * trait内部的写法可以与一个普通的类没什么区别。并且trait可以被多重继承。
 *
 * https://www.cnblogs.com/jsersudo/p/10155899.html
 *
 * https://blog.csdn.net/weixin_34240520/article/details/91874255
 */
trait DefaultAction{
    abstract void eat()

    void play(){
        println 'i can play'
    }

}

