import java.util.Scanner;

public class prob01_20210507 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if((A<=0 | A>=10 | B<=0 | B>=10) | (A==0 && B==0)) {
                break;
            }
            System.out.println(A+B);
        }
        scanner.close();
    }
}
