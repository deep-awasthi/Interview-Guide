class PalindromePartition {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, res, 0, new ArrayList<>());
        return res;
    }

    private void helper(String s, List<List<String>> res, int index, ArrayList<String> temp){
        if(index==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i<s.length(); i++){
            if(isPalindrome(s, index, i)){
                temp.add(s.substring(index, i+1));
                helper(s, res, i+1, temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int si, int ei){
        while(si<=ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }

        return true;
    }
}
