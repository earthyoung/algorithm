import java.util.Scanner;

public class prob05_20210719 {

    public static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1, num = 666;
        while(count!=N) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);

        sc.close();
    }

}
