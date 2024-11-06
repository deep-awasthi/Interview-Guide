class CombinationTwo {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, res, target, 0, new ArrayList<>());
        return res;
    }

    private void helper(int[] candidates, List<List<Integer>> res, int target, int index, ArrayList<Integer> temp){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i<candidates.length; i++){
            if(i!=index && candidates[i]==candidates[i-1]){
                continue;
            }

            if(target-candidates[i]<0){
                break;
            }

            temp.add(candidates[i]);
            helper(candidates, res, target-candidates[i], i+1, temp);
            temp.remove(temp.size()-1);
        }
    }
}
