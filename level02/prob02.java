import java.util.Scanner;

public class prob02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if (grade>=0 && grade<=100) {
            if(grade>=90) {
                System.out.println("A");
            }else if(grade>=80) {
                System.out.println("B");
            }else if(grade>=70) {
                System.out.println("C");
            }else if(grade>=60) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        }else {
            System.out.println("ERROR");
        }
        scanner.close();
    }
}
