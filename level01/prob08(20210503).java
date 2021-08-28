import java.util.Scanner;

public class prob08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if(A>0 && B<10) {
            double result = (double) A / B;
            System.out.println(result);
        }else {
            System.out.println("ERROR!");
        }
    }
}
