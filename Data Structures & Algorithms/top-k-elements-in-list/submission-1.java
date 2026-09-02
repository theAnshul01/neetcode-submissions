class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            minHeap.add(new int[]{entry.getValue(), entry.getKey()});
            if(minHeap.size() > k) minHeap.poll();
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            int[] pair = minHeap.poll();
            ans[i] = pair[1];
        }

        return ans;
    }
}
