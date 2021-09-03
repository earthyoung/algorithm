import java.util.Scanner;

public class prob10_20210903 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int groupCount = N;

        for(int i=0 ; i<N ; i++){
            String str = sc.next();
            int prev = 0;
            boolean[] arr = new boolean[26];
            for(int j=0; j<str.length(); j++){
                if(prev != str.charAt(j)){
                    if(arr[str.charAt(j) - 'a']==false){
                        arr[str.charAt(j) - 'a'] = true;
                        prev = str.charAt(j);
                    }else{
                        groupCount--;
                        break;
                    }
                }
            }
        }
        sc.close();

        System.out.println(groupCount);

    }
}
