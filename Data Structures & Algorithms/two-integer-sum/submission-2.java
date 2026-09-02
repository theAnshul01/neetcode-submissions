class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] temp = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            temp[i][0] = nums[i];
            temp[i][1] = i;
        }

        Arrays.sort(temp, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = nums.length - 1;
        while(left < right){
            int curSum = temp[left][0] + temp[right][0];
            if(curSum == target){
                return new int[]{Math.min(temp[left][1], temp[right][1]), Math.max(temp[left][1], temp[right][1])};
            } else if (curSum < target){
                left++;
            } else{
                right--;
            }
        }

        return new int[0];
    }
}
