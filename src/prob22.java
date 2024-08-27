public class prob22 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        long ans = solution.solution(3, 20, 4);
        System.out.println(ans);
    }

    static class Solution {
        public long solution(int price, int money, int count) {
            int sum = 0;
            for (int i = 1; i <= count; i++) {
                sum += price * i;
            }
            System.out.println("sum = " + sum);
            if(money >= sum ) return 0;
            else return sum - money;
        }
    }
}
