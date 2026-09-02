class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }

        int max = 1;
        for(int num: nums){
        int count = 1;
            if(set.contains(num+1)){
                continue;
            }else{
                while(set.contains(num-1)){
                    count++;
                    max = Math.max(count, max);
                    num -= 1;
                }
            }
        }

        return max;
    }
}
