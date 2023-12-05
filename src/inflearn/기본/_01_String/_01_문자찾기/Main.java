package inflearn.기본._01_String._01_문자찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    private static char[] cArr;
    private static char alphabet;

    private int solution() {
        return (int) IntStream.range(0, cArr.length)
                .mapToObj(i -> cArr[i])
                .filter(c -> c == alphabet)
                .count();
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cArr = br.readLine().toLowerCase().toCharArray();
        alphabet = br.readLine().toLowerCase().charAt(0);
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
