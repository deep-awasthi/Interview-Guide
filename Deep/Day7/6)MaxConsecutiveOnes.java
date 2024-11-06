class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int curr = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                curr++;
            }
            else{
                res = Math.max(res, curr);
                curr = 0;
            }
        }
        res = Math.max(res, curr);

        return res;
    }
}
