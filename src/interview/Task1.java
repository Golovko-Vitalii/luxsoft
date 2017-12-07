package interview;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        String [] s = {"S", "4", "4.4", "Int", "2", "1"};
        ArrayList <Integer> a = new ArrayList();
        for (int i = 0; i < s.length; i++) {
            try {
                if (Integer.parseInt(s[i])%2==0){
                    a.add(Integer.parseInt(s[i]));
                }
            }catch (Exception e){}
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}
