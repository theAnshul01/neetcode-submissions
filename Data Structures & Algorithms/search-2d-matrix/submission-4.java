class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        if(ROWS == 0) return false; 
        int COLS = matrix[0].length;

        int l = 0, r = ROWS * COLS - 1;

        while(l <= r){
            int m = (l + r) / 2;
            
            int row = m / COLS;
            int col = m % COLS;

            if(target == matrix[row][col]){
                return true;
            } else if(target < matrix[row][col]){
                r = m - 1;
            } else{
                l = m + 1;
            }
        }

        return false;
    }
}
