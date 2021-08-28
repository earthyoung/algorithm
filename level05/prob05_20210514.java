import java.util.Scanner;

public class prob05_20210514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        double new_avg;
        int N = sc.nextInt();
        if(N>1000 | N<1) System.exit(1);
        int[] grade = new int[N];
        for(int i = 0; i<N; i++) {
            grade[i] = sc.nextInt();
            if(grade[i]>100 | grade[i]<0) System.exit(1);
            sum += grade[i];
            max = (max>grade[i]) ? max : grade[i];
        }
        int count = 0;
        for(int i=0; i<N; i++) {
            if(grade[i]==0) {
                continue;
            }
            count += 1;
        }
        if(count==0) System.exit(1);
        new_avg = (double)(sum*100)/(double)(max*N);
        System.out.println(new_avg);
        sc.close();
    }
}
