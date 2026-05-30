class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set < Character > seen = new HashSet < > ();
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') continue;
                if (seen.contains(board[row][i])) {
                    return false;
                }
                seen.add(board[row][i]);
            }

        }

        for (int col = 0; col < 9; col++) {
            Set < Character > seen = new HashSet < > ();
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') continue;
                if (seen.contains(board[i][col])) {
                    return false;
                }
                seen.add(board[i][col]);
            }

        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                Set<Character> seen = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = boxRow * 3 + i;
                        int col = boxCol * 3 + j;
                        char c = board[row][col];
                        if (c == '.') continue;
                        if (!seen.add(c)) return false;
                    }
                }
            }
        }
        return true;
    }
}

