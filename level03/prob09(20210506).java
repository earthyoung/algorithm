import java.util.Scanner;

public class prob09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<=100 && N>=1) {
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}
