package solvedAc.beginner;

import java.io.*;

public class _2743_WordLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = br.readLine().length();
        System.out.println(result);
        br.close();
    }
}
