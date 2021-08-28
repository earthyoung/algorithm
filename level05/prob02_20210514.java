import java.util.Scanner;

public class prob02_20210514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[9];
        for(int i=0;i<9;i++) {
            A[i] = sc.nextInt();
            if(A[i]>100 | A[i]<1) {
                System.out.println("ERROR");
                System.exit(1);
            }
        }
        int max = A[0];
        int max_index = A[0];
        for(int i=0;i<=7;i++) {
            max = (max>A[i+1]) ? max : A[i+1];
        }
        for(int i=0;i<=8;i++) {
            if(max==A[i]) {
                max_index = (i+1);
                break;
            }
        }

        System.out.println(max);
        System.out.println(max_index);
        sc.close();
    }
}
