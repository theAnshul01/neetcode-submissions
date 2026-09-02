class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int first = 0; first < nums.length; first++){
            if(first > 0 && nums[first] == nums[first-1]) continue;
            int second = first + 1;
            int third = nums.length - 1;

            while(second < third){
                int sum = nums[first] + nums[second] + nums[third];
                if(sum < 0){
                    second++;
                } else if(sum > 0){
                    third--;
                } else {
                    ans.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    second++;
                    third--;
                    while(second < third && nums[second] == nums[second-1]) second++;
                    while(second < third && nums[third] == nums[third+1]){
                        third--;
                    }
                }
            }
        }

        return ans;
    }
}
