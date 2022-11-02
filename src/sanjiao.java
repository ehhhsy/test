import java.sql.Array;

/**
 * @Author: hsy
 * @Date: 2022/11/01/16:48
 * @Description:
 */
public class sanjiao {
    public static void main(String[] args) {
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer stringBuffer_1 = new StringBuffer();
        StringBuffer stringBuffer_2 = new StringBuffer();
        for (int i = 0; i < word1.length; i++) {
            stringBuffer_1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            stringBuffer_2.append(word2[i]);
        }
        return stringBuffer_1.toString().equals(stringBuffer_2.toString());
    }
}
