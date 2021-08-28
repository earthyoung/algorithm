import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob01_20210524 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); // 기본금액
        int B = Integer.parseInt(st.nextToken()); // 1대당 추가비용
        int C = Integer.parseInt(st.nextToken()); // 1대당 수익

        int break_point = 1;
        if(B>=C) {
            break_point = -1;
        }else {
            break_point = ((A/(C-B))+1);
        }
        System.out.println(break_point);
    }
}
