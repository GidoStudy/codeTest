public class prob1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String answer = solution.solution(4);
        System.out.println("answer = " + answer);
    }

    public static class Solution{
        public String solution(int num) {
            String answer=null;
            if (num % 2 == 0) {
                answer = "EVEN";
            } else {
                answer = "ODD";
            }
            return answer;
        }
    }
}
