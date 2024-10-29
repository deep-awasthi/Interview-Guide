class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;
        while(m>0 && n>0){
            if(nums1[m-1]>=nums2[n-1]){
                nums1[size-1] = nums1[m-1];
                m--;
                size--;
            }
            else {
                nums1[size-1] = nums2[n-1];
                n--;
                size--;
            }
        }
        while(n>0){
            nums1[size-1] = nums2[n-1];
            n--;
            size--;
        }
        while(m>0){
            nums1[size-1] = nums1[m-1];
            m--;
            size--;
        }
    }
}
