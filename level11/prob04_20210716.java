import java.util.Scanner;
import java.io.IOException;

public class prob04_20210716 {

    static boolean arr[][];
    static int min = 64;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new boolean[N][M];
        if(N<8 || N>50 || M<8 || M>50) {System.out.println("ERROR"); System.exit(0);}

        sc.nextLine();

        for(int i=0 ; i<N ; i++) {
            String str = sc.nextLine().trim();
            for(int j=0 ; j<M ; j++) {
                if(str.charAt(j)=='W') {
                    arr[i][j]=true;
                }else {
                    arr[i][j]=false;
                }
            }
        }
        sc.close();

        int N_row = (N-7);
        int M_col = (M-7);

        for(int i=0 ; i<N_row ; i++) {
            for(int j=0 ; j<M_col ; j++) {
                find(i, j);
            }
        }
        System.out.println(min);

    }

    public static void find(int x, int y) {
        int x_end = (x+8);
        int y_end = (y+8);
        int count = 0;

        boolean TF = arr[x][y];

        for(int i=x ; i<x_end ; i++) {
            for(int j=y ; j<y_end ; j++) {
                if(arr[i][j]!=TF) {count++;}
                TF = (!TF);
            }
            TF = (!TF);
        }
        count = Math.min(count, (64-count));
        min = Math.min(count, min);
    }

}
