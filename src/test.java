import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        System.out.println(3%10);
        printNum();
        }
        //输出1-100之间不为，3,5,7结尾的个数，并计算他们的和
    public static void  printNum(){
        int count=0;
        int sum=0;
        for (int i = 1; i < 100; i++) {
            int tmp=i%10;
            if (!(tmp==3||tmp==5||tmp==7)){
                count++;
                sum+=i;
            }
        }
        System.out.println("不为，3,5,7结尾的个数是  "+count);
        System.out.println("和 ="+sum);
    }
}
