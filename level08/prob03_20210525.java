import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob03_20210525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x<1 | x>10000000) {System.exit(1);}
        int denom = 1;
        int nom = 1;
        if(x==1) {
            System.out.println(nom + "/" + denom);
            System.exit(0);
        }
        int n = 2;
        int lower_bound, upper_bound;

        while(true) {
            lower_bound = ((n*(n-1))/2) + 1;
            upper_bound = (n*(n+1))/2;
            if(x>=lower_bound && x<=upper_bound) {
                break;
            }else {
                n++;
            }
        }
        if(n%2==1) {
            denom = x - lower_bound + 1;
            nom = n - x + lower_bound;
        }else if(n%2==0) {
            denom = n - x + lower_bound;
            nom = x - lower_bound + 1;
        }
        System.out.println(nom+"/"+denom);
    }
}