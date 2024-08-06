import java.awt.color.ICC_ColorSpace;

public class prob7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(793244);
        for (int i : solution1) {
            System.out.println("i = " + i);
        }
    }

    static class Solution{
        public int[] solution(long n) {
            String len = "" + n;
            int[] answer = new int[len.length()];
            int i = 0;
            while (n > 0) {
                answer[i] = (int)(n%10);
                n /= 10;
                i++;
            }
            return answer;
        }
    }
}
