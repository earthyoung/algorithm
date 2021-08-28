import java.util.Scanner;

public class prob08_20210521 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dialnum = sc.nextLine();
        int time = 0;
        if(dialnum.length()>15 | dialnum.length()<2) {
            System.out.println("ERROR");
            System.exit(1);
        }
        for(int i=0;i<dialnum.length();i++) {
            switch((int)(dialnum.charAt(i)-64)) {
                case 1:
                case 2:
                case 3:
                    time += 3;
                    break;
                case 4:
                case 5:
                case 6:
                    time += 4;
                    break;
                case 7:
                case 8:
                case 9:
                    time += 5;
                    break;
                case 10:
                case 11:
                case 12:
                    time += 6;
                    break;
                case 13:
                case 14:
                case 15:
                    time += 7;
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    time += 8;
                    break;
                case 20:
                case 21:
                case 22:
                    time += 9;
                    break;
                case 23:
                case 24:
                case 25:
                case 26:
                    time += 10;
                    break;
            }
        }
        System.out.println(time);
        sc.close();
    }
}