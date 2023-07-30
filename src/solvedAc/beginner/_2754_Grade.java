package solvedAc.beginner;

import java.io.*;

public class _2754_Grade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        double grade = 0;

        char score = input.charAt(0);
        if (score == 'A') {
            grade = 4;
        } else if (score == 'B') {
            grade = 3;
        } else if (score == 'C') {
            grade = 2;
        } else if (score == 'D') {
            grade = 1;
        } else {
            System.out.println("0.0");
            return;
        }

        score = input.charAt(1);
        if (score == '+') {
            grade += 0.3;
        } else if (score == '-') {
            grade -= 0.3;
        }
        System.out.println(grade);
    }
}
