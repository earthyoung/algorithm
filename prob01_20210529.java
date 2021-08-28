import java.util.Scanner;

public class prob01_20210529 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int num = sc.nextInt();
            boolean isPrime = true;

            if(num==1) {
                continue;
            }
            for(int j=2; j<=Math.sqrt(num); j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count ++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}