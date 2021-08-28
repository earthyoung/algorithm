import java.util.Scanner;

public class prob07_20210521 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=999 && a>=100 && b<=999 && b>=100) {
            int a_1 = a%10;
            int a_2 = (a%100-a%10)/10;
            int a_3 = a/100;
            int b_1 = b%10;
            int b_2 = (b%100-b%10)/10;
            int b_3 = b/100;
            int A = Integer.parseInt(String.valueOf(a_1)+String.valueOf(a_2)+String.valueOf(a_3));
            int B = Integer.parseInt(String.valueOf(b_1+String.valueOf(b_2)+String.valueOf(b_3)));
            if(A>=B) {System.out.println(A);}
            else {System.out.println(B);}
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
        sc.close();
    }
}