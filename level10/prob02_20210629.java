import java.util.Scanner;

public class prob02_20210629 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>20 | n<0) {
            System.out.println("ERROR");
            System.exit(0);
        }
        limit = n;
        fibo[0] = 0;
        fibo[1] = fibo[2] = 1;
        fibonacci();
        scanner.close();
    }

    public static int count = 3;
    public static int limit;
    public static int[] fibo = new int[21];
    public static void fibonacci() {
        if(count>limit) {
            System.out.println(fibo[limit]);
            return;
        }
        fibo[count] = fibo[(count-1)] + fibo[(count-2)];
        ++count;
        fibonacci();
    }

}
