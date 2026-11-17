class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        int total = A.length + B.length;

        int half = (total + 1) / 2;

        if(B.length < A.length){
            int[] temp = A;
            A = B;
            B = temp;
        }

        int l = 0, r = A.length;

        while(l <= r){
            int first = (l + r) / 2;
            int second = half - first;

            int Aleft = first > 0 ? A[first-1] : Integer.MIN_VALUE;
            int Aright = first < A.length ? A[first] : Integer.MAX_VALUE;
            int Bleft = second > 0 ? B[second-1] : Integer.MIN_VALUE;
            int Bright = second < B.length ? B[second] : Integer.MAX_VALUE;

            if(Aleft <= Bright && Bleft <= Aright){
                if(total % 2 != 0){
                    return Math.max(Aleft, Bleft);
                }
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            } else if (Aleft > Bright){
                r = first - 1;
            } else {
                l = first + 1;
            }
        }

        return -1;
    }
}
