import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        if (H>=0 && H<=23 && M>=0 && M<=59) {
            if(M<45 && H==0) {
                System.out.println(23+" "+(M+15));
            }else if(M<45 && H!=0) {
                System.out.println((H-1)+" "+(M+15));
            }else {
                System.out.println(H+" " + (M-45));
            }
        }else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}
