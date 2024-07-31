public class prob6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] ans = solution.solution(2, 5);
        for (long an : ans) {
            System.out.println("an = " + an);
        }
    }

    static class Solution{
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            for (int i = 0; i < n; i++) {
                answer[i] = (long)x * (i+1);
            }
            return answer;
        }
    }
}
