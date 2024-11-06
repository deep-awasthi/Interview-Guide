class Combination {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, res, target, 0, new ArrayList<>());
        return res;
    }

    private void helper(int[] candidates, List<List<Integer>> res, int target, int index, ArrayList<Integer> temp){
        if(index==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        if(target-candidates[index]>=0){
            temp.add(candidates[index]);
            helper(candidates, res, target-candidates[index], index, temp);
            temp.remove(temp.size()-1);
        }
        helper(candidates, res, target, index+1, temp);
    }
}
