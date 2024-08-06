public class prob8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("-1234");
        System.out.println("solution1 = " + solution1);
    }

    static class Solution{
        public int solution(String s) {
            return Integer.parseInt(s);
        }
    }
}
