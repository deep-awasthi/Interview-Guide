public class NthRoot {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int s = 1;
        int e = m;

        while(s<=e){
            int mid = (s+e)/2;
            int midN = isRoot(m, n, mid);
            if(midN==0){
                return mid;
            }
            else if(midN==1){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }

    private static int isRoot(int m, int n, int possibleRoot){
        long res = 1;
        for(int i = 1; i<=n; i++){
            res = res * possibleRoot;
            if(res>m){
                return 2;
            }
        }
        if(res == m){
            return 0;
        }
        return 1;
    }
}
