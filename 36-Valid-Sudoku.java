
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int arr[];

        for (int i = 0; i < 9; i++) {
            arr = new int[]{0,0,0,0,0,0,0,0,0};

            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                else {
                    arr[board[i][j] - '1']++;
                }

                if (arr[board[i][j] - '1'] > 1)
                    return false;
            }
        }

        int jarr[];

        for (int i = 0; i < 9; i++) {
            jarr = new int[]{0,0,0,0,0,0,0,0,0};

            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.')
                    continue;
                else {
                    jarr[board[j][i] - '1']++;
                }

                if (jarr[board[j][i] - '1'] > 1)
                    return false;
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                arr = new int[]{0,0,0,0,0,0,0,0,0};

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] == '.')
                            continue;

                        arr[board[k][l] - '1']++;

                        if (arr[board[k][l] - '1'] > 1)
                            return false;
                    }
                }
            }
        }

        return true;
    }
}
