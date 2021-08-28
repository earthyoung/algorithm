import java.util.Scanner;

public class prob06_20210519 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N+1];
        int[] success = new int[N+1];
        int[] total = new int[N+1];
        if(N>=1) {
            for(int i=0; i<=N; i++){
                str[i] = sc.nextLine();
                for(int j=0; j<str[i].length(); j++) {
                    switch(str[i].substring(j,j+1)) {
                        case "O":
                            success[i] += 1;
                            total[i] += success[i];
                            break;
                        case "X":
                            success[i] = 0;
                            total[i] = total[i];
                            break;
                        default:
                            System.out.println("ERROR");
                            System.exit(1);
                            break;
                    }
                }
            }
            for(int i=1;i<=N;i++) {
                System.out.println(total[i]);
            }
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
        sc.close();
    }
}
