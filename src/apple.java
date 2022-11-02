/**
 * @Author: hsy
 * @Date: 2022/11/02/10:53
 * @Description:
 */
public class apple extends fruit{
    private String name;
    @Override
    public void grow() {
        System.out.println("苹果正在生长");
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    public apple(String name) {
        this.name = name;
    }
}
