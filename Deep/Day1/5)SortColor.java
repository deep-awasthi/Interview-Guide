class SortColor {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int mid = 0;

        while(mid<=e){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums, s, mid);
                s++;
                mid++;
            }
            else{
                swap(nums, e, mid);
                e--;
            }
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
