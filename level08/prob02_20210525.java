import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob02_20210525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n>1000000000 | n<1) {System.exit(1);}
        int result = 1;
        if(n==1) {
            System.out.println(result);
            System.exit(0);
        }
        result++;
        while(true) {
            int a = (3 * (result-1) * (result-2)) + 2;
            int b = (3 * result * (result-1)) + 1;
            if(n>=a && n<=b) {
                break;
            }else {
                result++;
            }
        }
        System.out.println(result);
    }
}