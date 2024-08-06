public class prob9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long solution1 = solution.solution(121L);
        System.out.println("solution1 = " + solution1);
    }

    static class Solution{
        public long solution(long n) {
            int sqrt =  (int) Math.sqrt(n);
            if ((long) sqrt * sqrt == n) {
                return (long) (sqrt + 1) * (sqrt + 1);
            } else {
                return -1;
            }
        }
    }
}
