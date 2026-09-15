class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int l = 0;
        int maxLen = 0;

        for(int r = 0; r < s.length(); r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }

            charSet.add(s.charAt(r));
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
