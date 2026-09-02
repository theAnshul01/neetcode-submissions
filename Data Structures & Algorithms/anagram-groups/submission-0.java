class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            String key = sorted(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }

    private String sorted(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        String newStr = new String(temp);
        return newStr;
    }
}
