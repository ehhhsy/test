/**
 * @Author: hsy
 * @Date: 2022/11/02/10:56
 * @Description:
 */
public class fruitMain {
    public static void main(String[] args) {
//        fruit fruit = new fruit();  //为抽象类，不能实例化
        apple apple = new apple("富士");
        apple.grow();
        apple.printName();
    }
}
