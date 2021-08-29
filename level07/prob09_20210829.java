import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class prob09_20210829 {

    public static String[] croatia = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
    public static String modifiedString;
    public static int strLength;
    public static int dz_count = 0;

    public static boolean checkLetter(){
        if(modifiedString.length()>100){
            return false;
        }
        for(int i=0 ; i<modifiedString.length() ; i++){
            char ch = modifiedString.charAt(i);
            if(ch!=61 && ch!=45 && (ch<97 || ch>122)){
                return false;
            }
        }
        return true;
    }

    // 알파벳 문자 수 확인
    public static void checkNumber(int pos){
        // 마지막 문자일 경우
        if((pos+1)==modifiedString.length()){
            return;
        }
        // 뒤에 한 문자밖에 없을 경우
        if((pos+2)<modifiedString.length()){
            String str2 = modifiedString.substring(pos, (pos+3));
            if(str2.equals("dz=")){
                //System.out.println((pos+1) + "\t" + str2 + "\t" + "equal to dz=");
                dz_count++;
                strLength -= 2;
            }
        }

        String str1 = modifiedString.substring(pos, (pos+2));
        for(int i=0 ; i<croatia.length ; i++){
            if(str1.equals(croatia[i])){
                //System.out.println((pos+1) + "\t" + str1 + "\t" + "equal to " + croatia[i]);
                strLength--;
                break;
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        modifiedString = br.readLine();
        strLength = modifiedString.length();
        br.close();

        if(!checkLetter()){
            System.out.println("ERROR");
            System.exit(0);
        }

        for(int i=0 ; i<modifiedString.length() ; i++){
            char ch = modifiedString.charAt(i);
            if(ch=='c' || ch=='d' || ch=='l' || ch=='n' || ch=='s' || ch=='z'){
                checkNumber(i);
            }
        }
        strLength += dz_count;
        System.out.println(strLength);
    }

}
