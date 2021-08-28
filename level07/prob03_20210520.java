import java.util.Scanner;

class prob03_20210520 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if(S.length()<=100) {
            for(int i=0;i<S.length();i++) {
                int ascii = (int) S.charAt(i);
                if(ascii<97 | ascii>122) {
                    System.out.println("ERROR");
                    System.exit(1);
                }
            }
            for(int i=0;i<26;i++) {
                System.out.print(S.indexOf((char)(i+97)) + " ");
            }
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }
        System.out.println();

        sc.close();
    }
}