
class Solution {
    public int minInsertions(String s) {
        int close = 0;
        int insertions = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (close % 2 == 1) {
                    insertions++;
                    close--;
                }
                close+= 2;
            } else {
                close--;

                if (close< 0) {
                    insertions++;
                    close = 1;
                }
            }
        }

        return insertions+close;
    }
}
