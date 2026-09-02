class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        int left = 0, right = n-1;
        while(left < right){
            int area = 0;
            if(heights[left] < heights[right]){
                area = (right - left) * heights[left];
                left++;
            } else if (heights[left] > heights[right]) {
                area = (right - left) * heights[right];
                right--;
            } else {
                area = (right - left) * heights[right];
                left++;
                right--;
            }
            max = Math.max(area, max);
        }

        return max;
    }
}
