public class prob23 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(\"1234\") = " + solution.solution("1234"));
    }

    static class Solution{
        public boolean solution(String s) {
            if(s.length() != 4 && s.length() != 6) {
                return false;
            }
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
            }
            return true;
        }
    }
}
