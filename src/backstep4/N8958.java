package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * OX 퀴즈
 * 문자열 배열인 String 을 통해 각 줄의 OX 문자열을 각 배열에 저장한 뒤
 * 반복문과 조건문을 통해서 해결
 * String 배열 arr의 각 원소에 문자열을 저장한다.
 * cnt는 몇 번 연속했는지 sum은 누적 합산 값을 나타내는 변수로 선언한다.
 * for문으로 charAt() 메소드를 통해 검사한 후 문자'O'가 나타나면 cnt 1 증가
 * X일 경우 cnt를 0으로 초기화시킨 뒤 sum에 cnt값을 누적하여 출력
 */
public class N8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());

        String arr[] = new String[testCase];
        for(int i=0; i<testCase; i++) {
            arr[i] = br.readLine();
        }
        for(int i=0; i<testCase; i++) {
            int cnt = 0; //연속 횟수
            int sum = 0; //누적 합산

            for(int j=0; j<arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O') {
                    cnt++;
                }else {
                    cnt = 0;
                }
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}
