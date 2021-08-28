import java.util.Scanner;

public class prob04_20210520 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] times = new int[T];
        String[] str = new String[T];
        String P = "";
        if(T<=1000 && T>=1) {

            for(int i=0;i<T;i++) {
                int R = sc.nextInt();
                times[i] = R;
                String S = sc.next();
                str[i] = S;
            }

            for(int i=0;i<T;i++) {
                P = "";
                for(int j=0;j<str[i].length();j++) {
                    for(int k=0;k<times[i];k++) {
                        P += str[i].substring(j,j+1);
                    }
                }
                System.out.println(P);
            }

        }
        sc.close();
    }
}