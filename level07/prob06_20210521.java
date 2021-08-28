import java.util.Scanner;
import java.util.StringTokenizer;

public class prob06_20210521 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int count = st.countTokens();
        System.out.println(count);
        sc.close();
    }
}