import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class prob05_20210525 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        int[] H = new int[T];
        int[] W = new int[T];
        int[] N = new int[T];

        for(int i=0; i<T; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            H[i] = Integer.parseInt(st.nextToken());
            W[i] = Integer.parseInt(st.nextToken());
            N[i] = Integer.parseInt(st.nextToken());
            if(H[i]>99 | H[i]<1 | W[i]>99 | W[i]<1 | N[i]>(H[i]*W[i]) | N[i]<1) {System.exit(1);}
        }

        for(int i=0; i<T; i++) {
            int X, Y;
            X = N[i]/H[i];
            if(N[i]%H[i]!=0) {X = (N[i]/H[i])+1;}
            Y = N[i]%H[i];
            if(N[i]%H[i]==0) {Y = H[i];}
            bw.write(Y + String.format("%02d", X) + "\n");
        }

        bw.flush();
        bw.close();
    }
}