import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Text3 {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<String> colors = new ArrayList();
        ArrayList<String> numbers = new ArrayList();

        Collections.addAll(colors, "♠", "♥", "♦", "♣");
        Collections.addAll(numbers, "2", "A", "K", "Q", "10", "9", "8", "7", "6", "5", "4", "3");

        int conut = 1;

        pokerMap.put(conut++, "大王");
        pokerMap.put(conut++, "小王");

        for (String s : colors) {
            for (String c : numbers) {
                String care = s + c;
                pokerMap.put(conut++, care);
            }
        }
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.addAll(numberSet);

        Collections.shuffle(numberList);

        ArrayList<Integer> noP1 = new ArrayList<Integer>();
        ArrayList<Integer> noP2 = new ArrayList<Integer>();
        ArrayList<Integer> noP3 = new ArrayList<Integer>();
        ArrayList<Integer> dipaiNo = new ArrayList<Integer>();

        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);

            if (i > 51) {
                dipaiNo.add(no);
            } else {
                if (i % 3 == 0) {
                    noP1.add(no);
                } else if (i % 2 == 0) {
                    noP2.add(no);
                } else {
                    noP3.add(no);
                }
            }
        }
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(noP1);
        Collections.sort(dipaiNo);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (Integer s : noP1) {
            String card = pokerMap.get(s);
            player1.add(card);
        }
        for (Integer s : noP2) {
            String card = pokerMap.get(s);
            player2.add(card);
        }
        for (Integer s : noP3) {
            String card = pokerMap.get(s);
            player3.add(card);
        }
        for (Integer s : dipaiNo) {
            String card = pokerMap.get(s);
            dipai.add(card);
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }
}
