class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            sFreq[sChar-'a']++;
            tFreq[tChar-'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(sFreq[i] != tFreq[i]){
                return false;
            }
        }

        return true;
    }
}
