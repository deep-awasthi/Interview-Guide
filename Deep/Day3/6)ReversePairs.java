class ReversePairs {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] nums, int s, int e){
        int ans = 0;
        if(s>=e){
            return ans;
        }

        int mid = s + (e-s)/2;

        ans = ans + mergeSort(nums, s, mid);
        ans = ans + mergeSort(nums, mid+1, e);
        ans = ans + countPairs(nums, s, mid, e);
        merge(nums, s, mid, e);
        return ans;
    }

    private void merge(int[] nums, int s, int mid, int e){
        List<Integer> list = new ArrayList<>();

        int first = s;
        int last = mid + 1;

        while(first<=mid && last<=e){
            if(nums[first]>nums[last]){
                list.add(nums[last]);
                last++;
            }
            else {
                list.add(nums[first]);
                first++;
            }
        }

        while(first<=mid){
            list.add(nums[first]);
            first++;
        }
        while(last<=e){
            list.add(nums[last]);
            last++;
        }

        for(int i = s; i<=e; i++){
            nums[i] = list.get(i-s);
        }
    }

    private int countPairs(int[] nums, int s, int mid, int e){
        int ans = 0;
        int right = mid + 1;

        for(int i = s; i<=mid; i++){
            while(right<=e && (nums[i]>nums[right]*2L)){
                right++;
            }
            ans = ans + right - (mid + 1);
        }
        return ans;
    }
}
