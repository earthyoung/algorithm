import java.util.Scanner;

public class prob07_20210518 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N<=1000 && N>=1) {
            int[][] arr = new int[N][];
            for(int i=0;i<N;i++) {
                int a = sc.nextInt();
                arr[i] = new int[(a+1)];
                for(int j=1;j<(arr[i].length);j++) {
                    arr[i][j] = sc.nextInt();
                    if(arr[i][j]>100 | arr[i][j]<0) {
                        System.out.println("ERROR");
                        System.exit(1);
                    }
                }
                arr[i][0] = arr[i].length-1;
            }


            double[] avg = new double[N];
            double[] percent = new double[N];

            for(int i=0;i<N;i++) {
                for(int j=1;j<arr[i].length;j++) {
                    avg[i] += arr[i][j];
                }
                avg[i] = avg[i]/(double)(arr[i][0]);
            }

            for(int i=0;i<N;i++) {
                for(int j=1;j<arr[i].length;j++) {
                    if(avg[i]<arr[i][j]) {
                        percent[i] += 1;
                    }else {
                        percent[i] = percent[i];
                    }
                }
                percent[i] = Math.round((percent[i]/(double)arr[i][0])*100000)/1000.0;
                System.out.printf("%04.3f%%%n",percent[i]);
            }

        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
        sc.close();
    }
}
