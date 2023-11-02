package softeer.level2._지도자동구축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public int solution(int n) {
        int answer = 2; // 첫 시작, 한변의 점 개수
        for (int i = 0; i < n; i++) {
            answer *= 2;
            answer--;
        }
        return (int)Math.pow(answer, 2);
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
