import java.util.Scanner;

public class prob03_20210514 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>1000 | A<100 | B>1000 | B<100 | C>1000 | C<100) {
            System.out.println("ERROR");
            System.exit(1);
        }

        int ABC = A*B*C;
        String abc = String.valueOf(ABC);
        int[] sum = new int[10];

        for(int i=0;i<=9;i++) {

            for(int j=0;j<=(abc.length()-1);j++) {
                if(!String.valueOf(i).equals(abc.substring(j,j+1))) {
                    continue;
                }
                sum[i] = sum[i] + 1;
            }
        }
        for(int i=0;i<sum.length;i++) {
            System.out.println(sum[i]);
        }
        sc.close();
    }
}
