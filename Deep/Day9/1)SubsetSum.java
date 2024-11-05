

// User function Template for Java//User function Template for Java
class SubsetSum {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        subsetHelper(arr, res, 0, new ArrayList<>());
        
        return res;
    }
    
    private void subsetHelper(ArrayList<Integer> arr, ArrayList<Integer> res, int index, ArrayList<Integer> temp){
        if(index==arr.size()){
            res.add(sumOfList(temp));
            return;
        }
        
        temp.add(arr.get(index));
        subsetHelper(arr, res, index+1, temp);
        temp.remove(temp.size()-1);
        subsetHelper(arr, res, index+1, temp);
    }
    
    private int sumOfList(ArrayList<Integer> arr){
        int sum = 0;
        for(int i = 0; i<arr.size(); i++){
            sum = sum + arr.get(i);
        }
        
        return sum;
    }
}
