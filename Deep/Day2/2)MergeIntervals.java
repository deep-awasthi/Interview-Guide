class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2)->Integer.compare(arr1[0], arr2[0]));
        List<int[]> ans = new ArrayList<>();
        int[] curr = intervals[0];     
        ans.add(curr);
        
        for(int[] i : intervals){
            int currBegin = curr[0];
            int currEnd = curr[1];
            int nextBegin = i[0];
            int nextEnd = i[1];

            if(currEnd>=nextBegin){
                curr[1] = Math.max(currEnd, nextEnd);
            }
            else{
                curr = i;
                ans.add(curr);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
