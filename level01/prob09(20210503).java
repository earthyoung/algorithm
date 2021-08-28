import java.util.Scanner;

public class prob09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if(A>=1 && A<=10000 && B>=1 && B<=10000) {
            int result1 = A+B;
            int result2 = A-B;
            int result3 = A*B;
            int result4 = A/B;
            int result5 = A % B;

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
            System.out.println(result5);
        }else {
            System.out.println("ERROR!");
        }
    }
}
