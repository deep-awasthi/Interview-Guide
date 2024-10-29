public class RepeatAndMissing {
    public int[] repeatedNumber(int[] A) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        
        for(int i = 0; i<A.length; i++){
            ans = ans + A[i];
            if(set.contains(A[i])){
                res[0] = A[i];
            }
            set.add(A[i]);
        }
        
        for(int i = 1; i<=A.length; i++){
            ans = ans - i;
        }
        
        res[1] = Math.abs(ans - res[0]);
        
        return res;
    }
}
