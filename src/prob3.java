public class prob3 {
    public static void main(String[] args) {

    }

    public static class Solution{
        public int solution(int n) {
            int ans = 0;
            while (true) {
                ans += n%10;
                if(n<10) break;
                n /= 10;
            }
            return ans;
        }
    }
}
