class Solution {
    public int trap(int[] height) {
        if (height.length == 0) return 0;

        Stack<Integer> st = new Stack<>();
        int res = 0;

        for(int i = 0; i < height.length; i++) {
            while(!st.isEmpty() && height[i] >= height[st.peek()]) {
                int mid = height[st.pop()];
                if(!st.isEmpty()){
                    int right = height[i];
                    int left = height[st.peek()];
                    int h = Math.min(right, left) - mid;
                    int w = i - st.peek() - 1;
                    res += h * w;
                }
            }
            st.push(i);
        }

        return res;
    }
}
