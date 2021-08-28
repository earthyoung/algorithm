import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=1, j=1; i<=T && j<=T ; i++, j++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if(A<=0 | A>=10 | B<=0 | B>=10) {
                continue;
            }
            System.out.println(A+B);
        }
        scanner.close();
    }
}
