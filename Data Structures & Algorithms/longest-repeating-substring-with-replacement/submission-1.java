class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] charFreq = new int[26];

        for(int r = 0; r < n; r++){
            char ch = s.charAt(r);
            charFreq[ch-'A']++;

            maxFreq = Math.max(maxFreq, charFreq[ch-'A']);

            while((r-l+1) - maxFreq > k){
                charFreq[s.charAt(l)-'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r-l+1);

        }

        return maxLen;
    }
}
