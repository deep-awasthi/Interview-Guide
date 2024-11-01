class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();

        while(l<s.length()){
            if(!set.contains(s.charAt(l))){
                set.add(s.charAt(l));
                l++;
            }
            else{
                while(s.charAt(r)!=s.charAt(l)){
                    set.remove(s.charAt(r));
                    r++;
                }
                set.remove(s.charAt(r));
                r++;
                set.add(s.charAt(l));
                res = Math.max(res, l-r+1);
                l++;
            }
        }

        return res;
    }
}
