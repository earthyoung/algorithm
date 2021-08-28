import java.util.Scanner;

public class prob01_20210629 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<0 || N>12) {
            System.out.println("ERROR");
            System.exit(0);
        }
        factorial(N);
        System.out.println(value);
        scanner.close();
    }

    public static int value = 1;
    public static void factorial(int num) {

        if(num==0) {return;}

        value *= num;

        factorial(num-1);
    }

}