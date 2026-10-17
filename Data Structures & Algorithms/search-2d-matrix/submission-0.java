class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(matrix[row][col] == target){
                    return true;
                }
            }
        }

        return false;
    }
}
