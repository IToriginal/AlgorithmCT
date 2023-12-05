package inflearn.기본._02_Array._12_멘토링_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private int n, m;
    private int[][] matrix;

    private int solution() {
        int answer = 0;
        for (int mentor = 1; mentor <= n; mentor++) {
            for (int mentee = 1; mentee <= n; mentee++) {
                int cnt = 0;
                for (int test = 0; test < m; test++) {
                    int mentorRank = 0;
                    int menteeRank = 0;
                    for (int rank = 0; rank < n; rank++) {
                        if (matrix[test][rank] == mentor) {
                            mentorRank = rank;
                        }
                        if (matrix[test][rank] == mentee) {
                            menteeRank = rank;
                        }
                    }

                    // Test 만족
                    if (mentorRank < menteeRank) {
                        cnt++;
                    }
                }

                // Test 모두를 만족한 경우, 최종 카운트 증가
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); // col
        m = Integer.parseInt(input[1]); // row
        matrix = new int[m][n];
        for (int row = 0; row < m; row++) {
            matrix[row] = Arrays.stream(br.readLine().split(" "))
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
