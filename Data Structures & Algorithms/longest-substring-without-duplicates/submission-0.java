class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int l = 0;
        int res = 0;

        for(int r=0; r<arr.length; r++){
            while(set.contains(arr[r])){
                set.remove(arr[l]);
                l+=1;
            }
            set.add(arr[r]);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
