package test;

/**
 * @Author: hsy
 * @Date: 2022/11/04/15:12
 * @Description:
 */
public class main {
    public static void main(String[] args) {
        print(new People() {
            @Override
            public void run() {
                System.out.println("people can run");
            }
        });
        System.out.println("====");
        print(()->
            System.out.println("people can jump")
       );
    }
    public static void print(People people){
        people.run();
    }
}
