package solvedAc.beginner;

import java.io.*;

public class _2753_LeapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int year = Integer.parseInt(input);

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
