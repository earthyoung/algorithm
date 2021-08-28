import java.util.ArrayList;

public class prob02_20210520 {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        for(int i=0;i<=10000;i++) {
            arr.add(i);
        }

        for(int de_generator=1;de_generator<=10000;de_generator++) {
            for(int generator=1; generator<de_generator;generator++) {

                int one = 0;
                int ten = 0;
                int hundred = 0;
                int thousand = 0;
                if(generator<10) {
                    one = generator%10;
                    //System.out.println("de_generator : " + de_generator + ", generator : " + generator + ", one : " + one + ", ten : " + ten);
                }else if(generator<100) { // 97
                    one = generator%10;
                    ten = generator/10;
                    //System.out.println("de_generator : " + de_generator + ", generator : " + generator + ", one : " + one + ", ten : " + ten);
                }else if(generator<1000) { // 346
                    one = generator%10;
                    ten = (generator%100 - generator%10)/10;
                    hundred = generator/100;
                }else if(generator<10000) { // 3386
                    one = generator%10;
                    ten = (generator%100 - generator%10)/10;
                    hundred = (generator%1000 - generator%100)/100;
                    thousand = generator/1000;
                }
                if(de_generator == generator + one + ten + hundred + thousand ) {
                    arr.remove(new Integer(de_generator));
                    //System.out.println(arr);
                    //System.out.println(de_generator + " is removed.");
                }
            }
        }
        arr.remove(0);
        for(int i=0;i<arr.size();i++) {
            System.out.println(arr.get(i));
        }
    }
}
