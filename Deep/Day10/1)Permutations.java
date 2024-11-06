class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, 0);
        return res;
    }

    private void helper(int[] nums, List<List<Integer>> res, int index){
        if(index==nums.length){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                temp.add(nums[i]);
            }
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i<nums.length; i++){
            swap(nums, i, index);
            helper(nums, res, index+1);
            swap(nums, i, index);
        }
    }

    private void swap(int[] nums, int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}
