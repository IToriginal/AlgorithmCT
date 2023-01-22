package backstep4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 과제 안 내신 분..?
 * 30명의 학생이 있고, 그 중 28명이 과제를 제출하고 나머지 2명은 과제를 제출하지 않았다.
 * 이 때 2명의 학생의 번호를 번호가 작은 순부터 출력하면 된다.
 * boolean 형 배열을 이용하여 과제를 제출하면 true, 아니면 false
 * 28명의 번호가 입력으로 주어지면 배열에서 입력받은 인덱스 값을 true로 바꾸고
 * 마지막에 배열을 순회하며 false인 인덱스를 출력한다.
 *
 */
public class N5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean arr[] = new boolean[31];
        // 출석 check
        for (int i=0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n] = true;
        }
        for (int i=1; i<=30; i++) {
            if(!arr[i]) System.out.println(i);
        }
    }
}
