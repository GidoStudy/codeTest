import java.util.Arrays;

public class prob16 {
    public static void main(String[] args) {
        int[] abs = {1,2,3};
        boolean[] signs = {false, false, true};
        Solution solution = new Solution();
        int solution1 = solution.solution(abs, signs);
        System.out.println("solution1 = " + solution1);
    }

    static class Solution{
        public int solution(int[] absolute, boolean[] signs) {
            for(int i=0;i<absolute.length;i++){
                if(!signs[i]){
                    absolute[i] = -absolute[i];
                }
            }
            return Arrays.stream(absolute).sum();
        }
    }
}
