import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: hsy
 * @Date: 2022/10/27/11:07
 * @Description:
 */
public class TestStudent {
    public static void main(String[] args) throws Exception{
        //创建方式1  通过class.forName   class.forName("全类名")  获取字节码对象
            Class<?> aClass1 = Class.forName("Student");

        //创建方式2 通过类名.class  获取字节码对象
        Class<Student> aClass2 = Student.class;
        //通过对象.getClass()
        Class<? extends Student> aClass3 = new Student().getClass();

        for (Method method : aClass2.getMethods()) {
            System.out.println(method);
            System.out.println(method.getName());
            Class<?>[] types = method.getParameterTypes();
            System.out.println(types);
        }

    }
}
