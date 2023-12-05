package inflearn.기본._02_Array._11_임시반장정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int n;
    private int[][] matrix;
    private final int TOTAL_GRADE = 5;

    private int solution() {
        int answer = 0, max = 0;
        for (int student = 0; student < n; student++) { // row (기준 학생)
            int cnt = countSameStudent(student);
            if (cnt > max) {
                max = cnt;
                answer = student;
            }
        }
        return answer + 1;
    }

    private int countSameStudent(int student) {
        int cnt = 0;
        for (int friend = 0; friend < n; friend++) { // row (비교할 대상의 학생)
            for (int grade = 0; grade < TOTAL_GRADE; grade++) { // col (학년)
                if (matrix[student][grade] == matrix[friend][grade]) {
                    cnt++;
                    break;
                }
            }
        }
        return cnt - 1;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        matrix = new int[n][TOTAL_GRADE];
        for (int i = 0; i < n; i++) {
            matrix[i] = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
