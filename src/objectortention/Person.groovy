package objectortention

/**
 * 1、groovy中默认都是public
 *
 * groovy中的运行时，代码ppt的的图从下往上看
 */
class Person {

    String name;
    Integer age;

    def increaseAge(Integer years){
        this.age = years;
    }

    /**
     * 一个方法找不到时候，就会找他替代
     * @param s
     * @param o
     * @return
     */
    @Override
    Object invokeMethod(String s, Object o) {
        return "the method is ${name},the param is${age}"
    }

    def methodMissing(String s, Object o){
        return  "this method ${name} is missing"
    }
}
