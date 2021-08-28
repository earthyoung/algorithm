import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if(A>=2 && A<=10000 && B>=2 && B<=10000 && C>=2 && C<=10000) {
            int result1 = (A+B)%C;
            int result2 = ((A%C)+(B%C))%C;
            int result3 = (A*B)%C;
            int result4 = ((A%C)*(B%C))%C;

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
        }else {
            System.out.println("ERROR!");
        }
    }
}
