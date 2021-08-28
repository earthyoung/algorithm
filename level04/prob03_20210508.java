import java.util.Scanner;

public class prob03_20210508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = N;
        int i = 1;
        while(N<=99 && N>=0) {
            int a = N / 10;
            int b = N % 10;
            int c = (a+b)%10;
            N = (10*b)+c;
            if(N == M) {
                break;
            }
            i++;
        }
        System.out.println(i);
        scanner.close();
    }
}
