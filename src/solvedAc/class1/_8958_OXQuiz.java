package solvedAc.class1;

import java.io.*;

public class _8958_OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String quiz = br.readLine();
            int result = 0;
            int score = 0;

            for (int j = 0; j < quiz.length(); j++) {
                char exam = quiz.charAt(j);

                if (exam == 'O') {
                    score++;
                    result += score;
                } else {
                    score = 0;
                }
            }
            output.append(result).append("\n");
        }
        System.out.println(output);
    }
}
