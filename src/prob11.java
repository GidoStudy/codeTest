public class prob11 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution = " + solution.solution(18));

    }

    static class Solution{

        public boolean solution(int x) {
           String[] num = Integer.toString(x).split("");
           int sum=0;
            for (int i = 0; i < num.length; i++) {
                sum += Integer.parseInt(num[i]);
            }
            if( x % sum == 0) return true;
            return false;
        }
    }
}
