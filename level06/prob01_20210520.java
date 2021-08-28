public class prob01_20210520 {
    long sum(int[] a) {
        long ans = 0;
        int n = a.length;
        if(n<=3000000 && n>=1) {
            for(int i=0;i<a.length;i++) {
                ans += a[i];
                if(a[i]>3000000 | a[i] <0) {
                    System.exit(1);
                }
            }
        }else {
            System.exit(1);
        }
        return ans;
    }
}
