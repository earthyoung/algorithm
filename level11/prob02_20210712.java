import java.io.IOException;
import java.util.Scanner;

public class prob02_20210712 {

    static int ten, N, numSum;
    static int[] arrM;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        if(N<1 || N>1000000) {System.out.println("ERROR"); System.exit(0);}

        findTen();

        findSelector();

        sc.close();
    }

    public static void findTen() {
        for(int i=1 ; i<=7 ; i++) {
            if(N<Math.pow(10, i)) {
                ten = i;
                break;
            }
        }
    }

    public static void findSelector() {
        for(int M = Math.max(1, N-(ten*9)) ; M<=(N-1) ; M++) {
            singleNum(M);
            if(N==numSum + M) {
                System.out.println(M);
                return;
            }
        }
        System.out.println(0);
    }

    public static void singleNum(int M) {
        numSum = 0;
        int count = 0;
        int num = M;
        if(M<10) {
            arrM = new int[1];
            arrM[0] = M;
            numSum = M;
            return;
        }else if(M>=Math.pow(10, (ten-1))) {
            arrM = new int[ten];
        }else if(M<Math.pow(10, (ten-1))) {
            arrM = new int[(ten-1)];
        }

        while(true) {
            arrM[count] = num%10;
            num = num/10;
            if(num<10) {
                arrM[(++count)] = num;
                break;
            }
            count++;
        }

        for(int elem : arrM) {
            numSum += elem;
        }
    }

}
