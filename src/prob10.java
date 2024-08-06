import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob10 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(123L);
    }

    static class Solution{
        public long solution(long n) {
            String[] ans = String.valueOf(n).split("");
            ans = Arrays.stream(ans)
                    .sorted(Collections.reverseOrder())
                    .toArray(String[]::new);
            StringBuilder sb = new StringBuilder();
            for (String a : ans) {
                sb.append(a);
            }
            System.out.println("Long.parseLong(sb.toString() = " + Long.parseLong(sb.toString()));
            return Long.parseLong(sb.toString());
        }
    }
}
