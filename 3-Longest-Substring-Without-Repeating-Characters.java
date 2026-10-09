class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder st = new StringBuilder();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            while (st.toString().contains(String.valueOf(ch))) {
                st.deleteCharAt(0);
            }

            st.append(ch);
            max = Math.max(max, st.length());
        }

        return max;
    }
}