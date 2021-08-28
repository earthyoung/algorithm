import java.util.Scanner;

public class prob09_20210529 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i=0; i<T; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            double dist = y-x;
            if(x>y) {System.exit(1);}

            int leftDist;
            int count = 0;
            int goDist = 0;
            int culDist = 0;
            while(true) {
                if(culDist>=((double)dist/2)) {
                    count--;
                    culDist -= goDist;
                    leftDist = (int)dist-(culDist*2);
                    break;
                }else {
                    count++;
                    goDist++;
                    culDist += goDist;
                }
            }

            if((culDist*2)+goDist==dist) {
                System.out.println((count*2)+1);
            }else if(leftDist<=(goDist-1)){
                System.out.println((count*2)+1);
            }else{
                System.out.println((count*2)+2);
            }
        }
        sc.close();
    }
}