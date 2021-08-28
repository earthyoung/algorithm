import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class prob06_20210526 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int test = 1; test<=T ; test++) {

            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int apartment[][] = new int[15][15];
            if(k>14 | k<1 | n>14 | n<1) {System.exit(1);}
            for(int room = 1; room<=14; room++) {
                apartment[0][room] = room;
            }
            for(int floor = 1; floor<=14; floor++) {
                apartment[floor][1] = 1;
            }
            for(int floor = 1; floor <= 14; floor++) {
                for(int room = 1; room <= 14; room ++) {
                    apartment[floor][room] = apartment[floor][(room-1)] + apartment[(floor-1)][room];
                }
            }
            bw.write(String.valueOf(apartment[k][n]) + "\n");

        }
        bw.flush();
        bw.close();
    }

}