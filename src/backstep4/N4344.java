package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균 구하기
 * 테스트 케이스 만큼 반복문으로 배열에 성적을 저장함과 동시에 누적 합을 구한다
 * 평균 성적을 구해 배열에 저장된 성적들과 비교하여 몇 명이 평균보다 우위인지 세면 된다.
 * 문제에서는 소수점 셋째자리까지 출력을 원한다. (%.3f)
 */
public class N4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int arr[];
        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine(), " "); //학생 수, 성적을 입력
            int N = Integer.parseInt(st.nextToken()); //학생 수
            arr = new int[N];
            double sum = 0; //성적 누적 합

            //성적 입력
            for (int j=0; j<N; j++) {
                int val = Integer.parseInt(st.nextToken()); //성적 저장
                arr[j] = val;
                sum += val; //누적 성적 합
            }

            double avg = (sum / N);
            double count = 0; //평균 넘는 학생 수 변수

            //평균 넘는 학생 찾기
            for (int j=0; j<N; j++) {
                if(arr[j] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
    }
}
