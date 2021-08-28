import java.util.Scanner;

public class prob04_20210531 {

    public static int M;
    public static int N;
    public static boolean[] prime;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        prime = new boolean[(N+1)];

        if(M>=1 && N>=M && N<=1000000) {
            get_prime();
            for(int i=M; i<prime.length; i++) {
                if(prime[i]==false) {
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("ERROR");
        }

        sc.close();
    }

    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;
        for(int i=2 ; i<=Math.sqrt(N) ; i++) {
            for(int j=(i*i); j<prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}