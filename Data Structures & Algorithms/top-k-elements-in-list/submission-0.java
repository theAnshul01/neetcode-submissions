class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(new int[]{entry.getValue(), entry.getKey()});
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            int[] pair = pq.poll();
            ans[i] = pair[1];
        }

        return ans;
    }
}
