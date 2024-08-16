public class prob17 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String solution1 = solution.solution("01033334444");
        System.out.println("solution1 = " + solution1);
    }

    static class Solution{
        public String solution(String number) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < number.length(); i++){
                if(i<number.length()-4) {
                    sb.append("*");
                } else{
                    sb.append(number.charAt(i));
                }
            }
            return sb.toString();
        }
    }
}
