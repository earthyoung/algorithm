import java.util.Scanner;

public class prob10_20210903 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int groupCount = N;
        
        // for문 2번으로 끝낼 수 있다. 1번은 문자열 입력 할당하고, prev와 arr 등의 변수 초기화하기.
        for(int i=0 ; i<N ; i++){
            String str = sc.next();
            int prev = 0;
            boolean[] arr = new boolean[26];    // 기본값이 false이다. 
            for(int j=0; j<str.length(); j++){
                //  2번은 각 단어의 '문자'에서, 앞 문자와 연속되지 않게 나온 경우, false이면 true로 바꾼다.
                //  true라면 이미 앞에서 한 번 그 문자가 나왔던 것이므로, 지금 또 나오면 같은 문자가 불연속적으로 2번 이상 나온 것이다 = 그룹 단어가 아니다 = break후 groupCount 차감
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
        sc.close(); // resource 낭비 방지하기

        System.out.println(groupCount);

    }
}
