package baa_kingDog.hash._13414_수강신청;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    static int K, L;
    static Set<String> waitingList = new LinkedHashSet<>();
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] learnInfo = br.readLine().split(" ");
        K = Integer.parseInt(learnInfo[0]); // K = 수강 가능 인원
        L = Integer.parseInt(learnInfo[1]); // L = 학생들이 버튼을 클릭한 순서를 기록한 대기 목록의 길이

        for (int i = 0; i < L; i++) {
            String studentId = br.readLine();
            if (waitingList.contains(studentId)) {
                waitingList.remove(studentId);
            }
            waitingList.add(studentId);
        }

        int count = 0;
        for (String id : waitingList) {
            count++;
            result.append(id).append("\n");
            if (count == K) break;
        }
        System.out.print(result);
    }

}
