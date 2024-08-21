import java.util.Arrays;
import java.util.OptionalInt;

public class prob19 {
    public static void main(String[] args) {

    }

    static class Solution{
        public int[] solution(int[] arr) {
            OptionalInt min = Arrays.stream(arr).min();

            // 가장 작은 값을 제외한 새로운 배열 생성
            int[] result = Arrays.stream(arr)
                    .filter(value -> value != min.orElse(Integer.MIN_VALUE))
                    .toArray();
            if (result.length == 0) {
                result = new int[]{-1};
            }
            return result;
        }
    }
}
