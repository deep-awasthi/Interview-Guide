class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int res = 1;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int check = nums[i] + 1;
                int curr = 1;
                while(set.contains(check)){
                    curr++;
                    check++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
