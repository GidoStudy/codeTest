import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class prob27 {
    public static void main(String[] args) {

    }

    int gcd(int n, int m) {
        int r;
        while(m > 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 두 수에서 더 큰 수를 n으로 지정
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        // 최대공약수 구하기
        answer[0] = gcd(n, m);

        // 최소공배수 구하기
        answer[1] = n * m / answer[0];

        return answer;
    }
}
