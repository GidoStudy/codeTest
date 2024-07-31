import java.util.stream.IntStream;

public class prob5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.solution(3);
        System.out.println("ans = " + ans);
        int ans2 = solution.solution2(12);
        System.out.println("ans2 = " + ans2);
    }

    static class Solution{
        public int solution(int n) {
            int answer = 1;
            while (true) {
                if(n % answer == 1) break;
                answer++;
            }
            return answer;
        }

        public int solution2(int n) {
            return IntStream.range(2,n).filter(i -> n % i == 1).findFirst().orElse(0);
        }
    }
}
