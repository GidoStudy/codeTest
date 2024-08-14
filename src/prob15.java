import java.util.ArrayList;

public class prob15 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] solution1 = solution.solution(new int[]{3,2,6}, 10);
        for (int i : solution1) {
            System.out.println("i = " + i);
        }
    }

    static class Solution{
        public int[] solution(int[] arr, int divisor) {
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i : arr) {
                if (i % divisor == 0) {
                    ans.add(i);
                }
            }
            if(ans.size() == 0) {
                ans.add(-1);
            }
            return ans.stream().mapToInt(i -> i).sorted().toArray();
        }
    }
}
