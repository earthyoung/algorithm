import java.util.Scanner;

public class prob02_20210509 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if(A>=10 | A<=0 | B>=10 | B<=0) {
                break;
            }
            System.out.println(A+B);
        }
        scanner.close();
    }
}
