class Grid {
    public int uniquePaths(int m, int n) {
        return helper(m-1, n-1);
    }

    private int helper(int m, int n){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }

        return helper(m-1, n) + helper(m, n-1);
    }
}
