import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author: hsy
 * @Date: 2022/10/27/11:18
 * @Description:
 */
public class TestReflect_1 {
    @Test
    void getClzz() throws ClassNotFoundException {
        //创建方式1  通过class.forName   class.forName("全类名")  获取字节码对象

            Class<?> aClass1 = Class.forName("src.Student");

        //创建方式2 通过类名.class  获取字节码对象
        Class<Student> aClass2 = Student.class;
        //通过对象.getClass()
        Class<? extends Student> aClass3 = new Student().getClass();

        for (Method method : aClass2.getMethods()) {
            System.out.println(method);
            System.out.println(method.getName());
            Class<?>[] types = method.getParameterTypes();
            System.out.println(Arrays.toString(types));
        }
    }
}
