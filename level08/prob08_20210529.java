import java.util.Scanner;
import java.math.BigInteger;

public class prob08_20210529 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));
        sc.close();
    }
}