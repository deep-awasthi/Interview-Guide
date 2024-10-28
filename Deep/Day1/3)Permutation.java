class Permutation {
    public void nextPermutation(int[] nums) {
        int backKey = -1;
        int frontKey = -1;

        for(int i = nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                backKey = i;
                break;
            }
        }

        if(backKey==-1){
            reverse(nums, 0, nums.length-1);
        }
        else{
            for(int i = nums.length-1; i>=0; i--){
                if(nums[i]>nums[backKey]){
                    frontKey = i;
                    break;
                }
            }
            swap(nums, backKey, frontKey);
            if(backKey<nums.length-1){
                reverse(nums, backKey+1, nums.length-1);
            }
        }
    }

    private void swap(int[] nums, int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }

    private void reverse(int[] nums, int s, int e){
        while(s<e){
            swap(nums, s++, e--);
        }
    }
}
