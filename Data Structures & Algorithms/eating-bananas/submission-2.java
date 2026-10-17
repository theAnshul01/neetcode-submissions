class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        long max = 0;

        for(int pile: piles){
            max += pile;
        }

        long low = 1;
        long high = max;
        long ans = high;
        while(low <= high){
            long mid = low + (high - low) / 2;
            
            if(calcTime(piles, mid) <= (long)h){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }

        return (int)ans;
    }

    private long calcTime(int[] piles, long speed){
        long time = 0;
        for(int i = 0; i < piles.length; i++){
            time += Math.ceil((double) piles[i] / speed);
        }

        return time;
    }
}
