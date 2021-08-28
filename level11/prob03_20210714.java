import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class prob03_20210714 {

    static int[][] arr;
    static int rank;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        if(N<2 || N>50) {System.out.println("ERROR"); System.exit(0);}
        arr = new int[N][2];

        for(int i=0 ; i<N ; i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
            if(arr[i][0]<10 || arr[i][0]>200 || arr[i][1]<10 || arr[i][1]>200) {System.out.println("ERROR"); System.exit(0);}
        }
        br.close();

        for(int i=0 ; i<N ; i++) {
            rank = 1;
            for(int j=0 ; j<N ; j++) {
                if(i==j) continue;
                if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
                    rank++;
                }
            }
            if(i==(N-1)) {
                sb.append(rank);
            }else {
                sb.append(rank + " ");
            }
        }

        System.out.println(sb);

    }

}
