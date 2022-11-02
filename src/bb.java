/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hsy
 * @Date: 2022/10/15/19:34
 * @Description:
 */

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 */
@SuppressWarnings("all")
public class bb {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(12));
    }


    public static boolean isPerfectNumber(int num){
        // num%1 i=1 num%1=num     不要num，初始化为1，要的是真因子
        int sum=1;
        //真因子:一个数如果能被n整除的话，那么n的最大值不超过被除数的一半
        for (int i = 2; i<=Math.sqrt(num); i++) {
            //能被整除  num%i=0;
            if (num%i==0){
                //如过num=6
                //第一次num%2==0    i=2 num=3
                sum+=i+num/i;
            }
        }
        return sum==num;
    }
}


