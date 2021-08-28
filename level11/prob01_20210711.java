import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class prob01_20210711 {

    static int[] arr;
    static int N, M;
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str1 = br.readLine().split(" ");
        N = Integer.parseInt(str1[0]);
        M = Integer.parseInt(str1[1]);
        arr = new int[N];

        if(N<3 || N>100 || M<10 || M>300000) {System.out.println("ERROR"); System.exit(0);}

        String[] str2 = br.readLine().split(" ");
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(str2[i]);
        }

        BlackJack();
        biggest();

    }

    public static void BlackJack() {
        int sum;
        for(int i=0 ; i<N ; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0 ; k<N ; k++) {
                    sum = 0;
                    if(i==j || j==k || i==k) {break;}
                    sum = arr[i]+arr[j]+arr[k];
                    set.add(sum);
                }
            }
        }
    }

    public static void biggest() {
        int i = 0;
        int num;
        while(true) {
            num = M-i;
            if(set.contains(num)) {
                System.out.println(num);
                break;
            }
            i++;
        }
    }

}
