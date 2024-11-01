class SubarrayWithSum0
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
            if(sum==0){
                res = i+1;
            }
            else{
                if (map.containsKey(sum)){
                    res = Math.max(res, i - map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        
        return res;
    }
}
