import java.util.Scanner;

public class prob07_20210528 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==4 | N==7) {
            System.out.println(-1);
        }else {
            if((N%5)==2 | (N%5)==4) {
                System.out.println((N/5)+2);
            }else if((N%5)==1 | (N%5)==3) {
                System.out.println((N/5)+1);
            }else {
                System.out.println(N/5);
            }
        }
        sc.close();
    }
}