class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        for(int i = 0; i<nums.length; i++){
            if(i!=0 && nums[i]!=nums[i-1]){
                nums[res] = nums[i];
                res++;
            }
        }

        return res;
    }
}
