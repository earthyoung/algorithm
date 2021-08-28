import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if(A>0 && B<10) {
            int result = A + B;
            System.out.println(result);
        }else {
            System.out.println("ERROR!");
        }
    }
}
