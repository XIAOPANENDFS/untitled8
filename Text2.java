
import java.util.HashMap;

public class Text2 {
    public static void main(String[] args) {

        String str ="aaacccssszzzdvzs";

        HashMap<String,Integer> hashMap = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            String  c = String.valueOf(str.charAt(i));

            if (!hashMap.containsKey(c)) {
                hashMap.put(c,1);
            }else {
                Integer count = hashMap.get(c);
                hashMap.put(c,count+1);
            }
        }
        System.out.println(hashMap);
    }
}
