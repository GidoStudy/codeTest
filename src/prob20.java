public class prob20 {
    public static void main(String[] args) {
        String abcde = Solution.solution("qwer");
        System.out.println(abcde);
    }

    static class Solution{
        public static String solution(String s) {
            StringBuilder sb = new StringBuilder();
            if(s.length() % 2 == 0) {
                sb.append(s.charAt(s.length()/2-1)).append(s.charAt(s.length()/2));
            }else{
            sb.append(s.charAt(s.length()/2));
            }
            return sb.toString();
        }
    }
}
