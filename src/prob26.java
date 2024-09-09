public class prob26 {
    public static void main(String[] args) {
        prob26 prob26 = new prob26();
        int solution = prob26.solution(24, 27);
        System.out.println("solution = " + solution);
    }

    public int solution(int l, int r) {
        int answer = 0;
        for (int i=l; i<=r; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }
        return answer;
    }
}
