import java.util.Arrays;

public class prob18 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{1, 3, 5, 7, 9});
    }

    static class Solution{
        public int solution(int[] numbers) {
            int answer = 0;
            for (int i = 0; i < 10; i++) {
                if (!contains(numbers, i)) {
                    answer+=i;
                }
            }
            return answer;
        }

        public boolean contains(int[] arr, int key) {
            return Arrays.stream(arr).anyMatch(i -> i == key);
        }
    }
}
