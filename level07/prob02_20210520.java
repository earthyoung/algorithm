import java.util.Scanner;

public class prob02_20210520 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        String str = sc.nextLine();
        if((N==str.length()) && (str.indexOf(" ")==-1)) {
            if(N<=100 && N>=1) {
                for(int i=0;i<N;i++) {
                    sum += Integer.parseInt(str.substring(i,i+1));
                }
                System.out.println(sum);
            }else {
                System.out.println("ERROR");
                System.exit(1);
            }
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
        sc.close();
    }
}
