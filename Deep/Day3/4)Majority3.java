class Majority3 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int ans1 = -1;
        int ans2 = -1;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i<nums.length; i++){
            if(count1 == 0 && nums[i]!=ans2){
                ans1 = nums[i];
            }
            else if(ans1 != nums[i] && count2 == 0){
                ans2 = nums[i];
            }
            if(nums[i]==ans1){
                count1++;
            }
            else if(nums[i]==ans2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==ans1){
                count1++;
            }
            else if(nums[i]==ans2){
                count2++;
            }
        }

        if(count1>(nums.length)/3){
            res.add(ans1);
        }
        if(count2>(nums.length)/3){
            res.add(ans2);
        }

        return res;
    }
}
