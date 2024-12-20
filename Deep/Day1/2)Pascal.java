class Pascal {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1; i<=numRows; i++){
            List<Integer> prev = new ArrayList<>();
            int ans = 1;
            prev.add(1);
            for(int j = 1; j<i; j++){
                ans = ans * (i-j);
                ans = ans/j;
                prev.add(ans);
            }
            res.add(prev);
        }

        return res;
    }
}
