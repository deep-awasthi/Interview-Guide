class TrappingRainwater {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int res = 0;

        for(int i = 0; i<height.length; i++){
            res = Math.max(res, height[i]);
            left[i] = res;
        }

        res = 0;
        for(int i = height.length-1; i>=0; i--){
            res = Math.max(res, height[i]);
            right[i] = res;
        }

        int total = 0;

        for(int i = 0; i<height.length; i++){
            if(height[i]<left[i] && height[i]<right[i]){
                total = total + Math.min(left[i], right[i]) - height[i];
            }
        }

        return total;
    }
}
