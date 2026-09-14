class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        Map<Character, Integer> freqMap = new HashMap<>();

        int l = 0, r = 0;
        int max = Integer.MIN_VALUE;
        while(r < s.length()){
            freqMap.put(s.charAt(r), freqMap.getOrDefault(s.charAt(r), 0) + 1);

            while(freqMap.get(s.charAt(r)) > 1){
                freqMap.put(s.charAt(l), freqMap.get(s.charAt(l))-1);
                l++;
            }

            max = Math.max(max, r-l+1);
            r++;
        }

        return max;
    }
}
