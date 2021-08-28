import java.util.Scanner;

public class prob01_20210520 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        if(N>=1 && N<=1000) {
            for(int i=1;i<=N;i++) {
                int one = i%10;
                int ten = (i%100-i%10)/10;
                int hundred = i/100;
                if(i<=99 && i>=1) {
                    count += 1;
                }else if((one-ten) == (ten-hundred)) {
                    count += 1;
                }
            }
            System.out.println(count);
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
        sc.close();
    }
}
