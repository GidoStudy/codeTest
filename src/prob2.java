import java.util.Arrays;

public class prob2 {
    public static void main(String[] args) {

    }

    public static class Solution{
        public double solution(int[] arr) {
            double answer = 0;
            int sum = Arrays.stream(arr).sum();
            return (double) sum / arr.length;
        }
    }

}
