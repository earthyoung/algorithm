import java.util.Scanner;

public class prob04_20210514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mod = new int[42];
        int[] A = new int[10];
        int count = 0;
        for(int i=0; i<10; i++) {
            A[i] = sc.nextInt();
            if(A[i]>1000 || A[i]<0) {
                System.out.println("ERROR");
                System.exit(1);
            }
            A[i] = A[i]%42;
            mod[A[i]%42] += 1;
        }
        for(int i=0; i<mod.length; i++) {
            if(mod[i]==0) {
                continue;
            }
            count += 1;
        }
        System.out.println(count);
        sc.close();
    }
}
