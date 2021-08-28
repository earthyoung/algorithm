import java.util.Scanner;
import java.util.ArrayList;

public class prob05_20210520 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] count = new int[26];
        int max = 0;
        ArrayList<Integer> max_index = new ArrayList<>();

        for(int i=0;i<26;i++) {
            for(int j=0;j<S.length();j++) {
                if(S.charAt(j)==(char)(i+65) | S.charAt(j) == (char)(i+97)) {
                    count[i] += 1;
                }
            }
        }

        for(int i=0;i<26;i++) {
            max = (count[i]>max) ? count[i] : max;
        }
        for(int i=0;i<26;i++) {
            if(max==count[i]) {
                max_index.add(i);
            }
        }
        if(max_index.size()>=2) {
            System.out.println("?");
        }else {
            System.out.println((char)(max_index.get(0)+65));
        }
        sc.close();
    }
}