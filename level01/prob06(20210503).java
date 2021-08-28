import java.util.Scanner;

public class prob06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        if(A>0 && A<10 && B>0 && B<10) {
            int result = A - B;
            System.out.print(result);
        }else {
            System.out.println("ERROR!");
        }
    }
}
