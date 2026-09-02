class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x: nums){
            if(map.get(x) != null) return true;
            map.put(x, 1);
        }
        
        return false;
    }
}