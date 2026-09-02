class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;

// row check
        for(int i = 0; i < n; i++){
            Set<Character> rowSet = new HashSet<>();
            for(int j = 0; j < m; j++){
                if(rowSet.contains(board[i][j]) && board[i][j] != '.'){
                    return false;
                }
                rowSet.add(board[i][j]);
            }
        }

// col check
        for(int i = 0; i < m; i++){
            Set<Character> colSet = new HashSet<>();
            for(int j = 0; j < n; j++){
                if(colSet.contains(board[j][i])  && board[j][i] != '.'){
                    return false;
                }
                colSet.add(board[j][i]);
            }
        }

        // square check
    for(int sq = 0; sq < 9; sq++){
        Set<Character> sqSet = new HashSet<>();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int row = (sq / 3) * 3 + i;
                int col = (sq % 3) * 3 + j;
                if(sqSet.contains(board[row][col])  && board[row][col] != '.'){
                    return false;
                }
                sqSet.add(board[row][col]);
            }
        }
    }

    return true;
    }

    
}
