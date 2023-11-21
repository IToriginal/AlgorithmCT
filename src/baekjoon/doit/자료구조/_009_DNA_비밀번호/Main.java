package baekjoon.doit.자료구조._009_DNA_비밀번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int DNA_STRING_LENGTH = 4;

    private int[] checkCurrentStatus(int range, char[] arr) {
        int[] count = new int[DNA_STRING_LENGTH];
        for (int j = 0; j < range; j++) {
            switch (arr[j]) {
                case 'A': count[0]++; break;
                case 'C': count[1]++; break;
                case 'G': count[2]++; break;
                case 'T': count[3]++; break;
            }
        }
        return count;
    }

    public int solution(int s, int p, char[] dataDNA, int[] checkACGT) {
        int result = 0;
        int[] checkCurrent = checkCurrentStatus(p, dataDNA); // 첫 임시 비밀번호 알파벳 개수 초기화

        // 슬라이딩 윈도우 반복 회수
        for (int i = 0; i <= s - p; i++) {
            boolean flag = false;
            // 조건에 부합하는지 확인
            for (int j = 0; j < DNA_STRING_LENGTH; j++) {
                if (checkCurrent[j] < checkACGT[j]) {
                    flag = true;
                    break;
                }
            }
            // 사용 가능한 비밀번호
            if (!flag) {
                result++;
            }
            if (i == s - p) break;

            // 맨 앞의 문자를 제거
            checkCurrent[getPosition(dataDNA[i])]--;
            // 뒤에 올 문자를 추가
            checkCurrent[getPosition(dataDNA[i+p])]++;
        }
        return result;
    }

    private int getPosition(char idxData) {
        switch (idxData) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int s = Integer.parseInt(info[0]);
        int p = Integer.parseInt(info[1]);
        char[] dataDNA = br.readLine().toCharArray();
        int[] checkACGT = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(T.solution(s, p, dataDNA, checkACGT));
    }

}
