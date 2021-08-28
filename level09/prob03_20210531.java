import java.util.Scanner;
import java.util.ArrayList;

public class prob03_20210531 {

    public static int N;
    public static ArrayList<Integer> number = new ArrayList<Integer>();
    public static int i = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        isDivisor(N, number);

        sc.close();
    }

    public static void isDivisor(int N, ArrayList<Integer> number) {
        if(N==1) {
            System.out.println("");
        }else if(N<0 | N>10000000) {
            System.out.println("Error");
        }else {
            while(true) {
                if(N==i) {
                    number.add(i);
                    break;
                }else if(N % i != 0) {
                    i++;
                }else if(N % i == 0) {
                    N = N/i;
                    number.add(i);
                }
            }
            for(int k=0; k<number.size(); k++) {
                System.out.println(number.get(k));
            }
        }
    }

}