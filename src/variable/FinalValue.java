package variable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FinalValue {

   public static void setFinalStatic(Field field, Object newValue) throws Exception {
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
//        field.set(null, newValue);
    }

    public static void main(String[] args) throws Exception {
//        System.out.println("name="+Bean.class.toString());
//        System.out.println(Bean.INT_VALUE);
//        setFinalStatic(Bean.class.getField("openMap"), 200);
//        System.out.println(Bean.INT_VALUE);

//        System.out.println("------------------");
//        System.out.println(Bean.STRING_VALUE);
//        setFinalStatic(Bean.class.getField("STRING_VALUE"), "String_2");
//        System.out.println(Bean.STRING_VALUE);
//
//        System.out.println("------------------");
//        System.out.println(Bean.BOOLEAN_VALUE);
//        setFinalStatic(Bean.class.getField("BOOLEAN_VALUE"), true);
//        System.out.println(Bean.BOOLEAN_VALUE);
//
//        System.out.println("------------------");
//        System.out.println(Bean.OBJECT_VALUE);
//        setFinalStatic(Bean.class.getField("OBJECT_VALUE"), new Date());
//        System.out.println(Bean.OBJECT_VALUE);

        Class c = AccountCache.class;


        //调用私有构造
        Constructor c0=c.getDeclaredConstructor();
        c0.setAccessible(true);
        AccountCache po=(AccountCache)c0.newInstance();


        //访问私有属性
        Field f= c.getDeclaredField("map");
        f.setAccessible(true);
        Object value=f.get(po);


        HashMap<String,String> map=( HashMap<String,String> )value;

        //打印一下    System.out.println(value);
    }

    static class Bean{

        private static final Map<Integer, Integer> openMap = new HashMap<Integer, Integer>();
        public static final int INT_VALUE = 100;
        public static final Boolean BOOLEAN_VALUE = false;
        public static final String STRING_VALUE = "String_1";
        public static final Object OBJECT_VALUE = "234";
    }

    public static class AccountCache {

        private AccountCache() {
        }

        private static final HashMap<String,String> map=new HashMap<String, String>();

    }
}
