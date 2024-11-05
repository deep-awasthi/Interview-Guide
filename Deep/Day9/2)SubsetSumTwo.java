class SubsetSumTwo {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, nums, 0, new ArrayList<>());
        return res;
    }

    private void helper(List<List<Integer>> res, int[] nums, int index, ArrayList<Integer> temp){
        res.add(new ArrayList<>(temp));

        for(int i = index; i<nums.length; i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }

            temp.add(nums[i]);
            helper(res, nums, i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
}
