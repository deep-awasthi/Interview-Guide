class SubsetSumTwo {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<>(), 0);
        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, ArrayList<Integer> ans, int index){
        res.add(new ArrayList<>(ans));
        for(int i = index; i<nums.length; i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            ans.add(nums[i]);
            helper(nums, res, ans, i+1);
            ans.remove(ans.size()-1);
        }
    }
}
