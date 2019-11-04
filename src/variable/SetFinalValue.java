package variable;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class SetFinalValue {

    private static final Map<Integer, Integer> openMap = new HashMap<Integer, Integer>();

 public static void setFinalStatic(Field field, Object newValue) throws Exception {
  field.setAccessible(true);
  Field modifiersField = Field.class.getDeclaredField("modifiers");
  modifiersField.setAccessible(true);
  modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
//  field.set(null, newValue);
 }

    public static void main(String[] args) throws Exception {
         Field target = SetFinalValue.class.getField("openMap");
      setFinalStatic(target,"");

         int modify = target.getModifiers();
        SetFinalValue.checkModifier(modify);
        SetFinalValue.checkModifier(modify);
         Map<Integer, Object> openMap2 = new HashMap<Integer, Object>();
        openMap2.put(2, "abcde");
         try {
            //取消 Java 语言访问检查，详细查看 API（这里可以不写）
            target.setAccessible(true);

            //获得修饰符Field对象，通过这个对象可以对另外一个Field对象的操作符进行修改,源码见图-1
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);

            //关于Modefier常量的定义见图-2
            modify = target.getModifiers() & ~Modifier.FINAL;
            System.out.println("处理后的 modify : " + modify);
                         //更改目标对象的修饰符
             modifiersField.setInt(target, modify);
            modify = target.getModifiers();

            System.out.println("#####更改修饰符后的结果######");
            SetFinalValue.checkModifier(modify);

            //更改静态常量
            target.set(null, openMap2);

             System.out.println(openMap.get(2));
       } catch (Exception e) {
             e.printStackTrace();
        }

       /**重复设置一次*/
        Map<Integer, Object> openMap3 = new HashMap<Integer, Object>();
         openMap3.put(3, "中文输入");
        try {
           target = SetFinalValue.class.getField("openMap");
            target.setAccessible(true);
            System.out.println("#####重复一次检验一次重新get后值会不会改变######");
            checkModifier(target.getModifiers());

        } catch (Exception e) {
           e.printStackTrace();
        }

    }

     /**
      * 检查所有的修饰符，是否是 public static final
      * @param modify
     */
    public static void checkModifier(int modify){
        System.out.println("当前的 modify : " + modify);
        //源码见图-3
         System.out.println(" public : " + Modifier.isPublic(modify));
        System.out.println(" static : " + Modifier.isStatic(modify));
        System.out.println(" final : " + Modifier.isFinal(modify));
    }
 }