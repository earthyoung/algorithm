import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob06_20210604 {

    public static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim());
        get_prime();

        while(T>0) {
            int n = Integer.parseInt(br.readLine().trim());
            int firstNum = n/2;
            int secondNum = n/2;
            while(true) {
                if(prime[firstNum]==false && prime[secondNum]==false) {
                    System.out.println(firstNum + " " + secondNum);
                    break;
                }
                firstNum--;
                secondNum++;
            }
            T--;
        }

        bw.close();
    }

    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(10000); i++) {
            for (int j = (i * i); j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

}