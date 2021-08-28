import java.util.Scanner;

public class prob05_20210531 {

    public static int N;
    public static boolean[] prime;
    public static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            N = Integer.parseInt(sc.nextLine().trim());
            if(N==0) {
                break;
            }
            if(N<1 | N>123456) {
                System.out.println("ERROR");
                break;
            }else {
                prime = new boolean[((2*N)+1)];
                get_prime();
            }
        }

        sc.close();
    }

    public static void get_prime() {
        count = 0;
        prime[0] = true;
        prime[1] = true;
        if(N==1) {
            System.out.println(1);
        }else if(N==0) {
            System.out.println("");
        }else {
            for(int i=2 ; i<=Math.sqrt((2*N)) ; i++) {
                for(int j=(i*i); j<prime.length; j += i) {
                    prime[j] = true;
                }
            }

            for(int i=(N+1) ; i<=(2*N) ; i++) {
                if(prime[i]==false) {
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}