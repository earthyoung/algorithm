import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<=100 && N>=1) {
            for(int i=1;i<=N;i++) {
                for(int j=N-i;j>=1;j--) {
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++) {
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
