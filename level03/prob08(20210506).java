import java.util.Scanner;

public class prob08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=1;i<=T;i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            if(A<10 && A>0 && B<10 && B>0) {
                System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
            }
        }
        scanner.close();
    }
}
