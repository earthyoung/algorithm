import java.util.Scanner;
import java.util.ArrayList;

public class prob11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> B = new ArrayList<>();
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if(N<=10000 && N>=1 && X<=10000 && X>=1) {
            int[] A = new int[N];
            for(int i=0;i<N;i++) {
                A[i] = scanner.nextInt();
                if(A[i]<X) {
                    B.add(A[i]);
                }
            }
            for(int i : B) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}
