import java.util.Scanner;

public class prob01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if(N>=1 && N<=9) {
            for(int m=1; m<=9; m++) {
                System.out.println(N + " * " + m + " = " + (N*m));
            }
        }else {
            System.out.println("ERROR");
        }
        input.close();
    }
}
