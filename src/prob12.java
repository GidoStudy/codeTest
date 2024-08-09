public class prob12 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6,1));
    }

    static class Solution{
        public long solution(int a, int b) {
            long answer = 0;

            if (a <= b) {
                for (int i = a; i <= b; i++)
                    answer += i;
            } else {
                for (int i = b; i <= a; i++)
                    answer += i;
            }

            return answer;
        }
    }
}
