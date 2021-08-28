import java.util.Scanner;

public class prob11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A>=100 && A<1000 && B>=100 && B<1000) {
            int result1 = A*(B%10);
            System.out.println(result1);
            int result2 = A*((B%100)-(B%10));
            if (result2 == 0) {
                System.out.println(0);
            }else {
                System.out.println(result2/10);
            }
            int result3 = A*(B-(B%100));
            if (result3 == 0) {
                System.out.println(0);
            }else {
                System.out.println(result3/100);
            }
            int result4 = result1 + result2 + result3;
            System.out.println(result4);
        }else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}
