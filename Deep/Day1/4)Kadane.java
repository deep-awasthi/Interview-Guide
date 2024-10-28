class Kadane {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int curr = 0;

        for(int i = 0; i<nums.length; i++){
            curr = curr + nums[i];
            res = Math.max(res, curr);
            if(curr<0){
                curr = 0;
            }
        }

        return res;
    }
}
