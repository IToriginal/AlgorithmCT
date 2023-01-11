package backstep2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시험 성적
 * score = 성적
 * 1. score >= 90 : A
 * 2. score >= 80 : B
 * 3. score >= 70 : C
 * 4. score >= 60 : D
 * else 나머지 점수 : F
 */
public class N9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if(score >= 90) System.out.println("A");
        else if(score >= 80) System.out.println("B");
        else if(score >= 70) System.out.println("C");
        else if(score >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
