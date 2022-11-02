import java.util.*;

public class demo_01 {
    public static void main(String [] args){
        HashMap hashMap = new HashMap<>();
        hashMap.put(1,66);
        hashMap.put(2,32);
        hashMap.put(3,44);
        hashMap.put(4,15);
        List<Map.Entry<String, Integer>> list_Data = new ArrayList<Map.Entry<String, Integer>>(hashMap.entrySet());
        Collections.sort(list_Data, (o1, o2) -> {
            if (o2.getValue() != null && o1.getValue() != null && o2.getValue().compareTo(o1.getValue()) > 0) {
                return 1;
            } else {
                return -1;
            }
        });
        System.out.println(list_Data);

    }
}

