package solvedAc.beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866_CharactersAndStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine1 = br.readLine();
        String inputLine2 = br.readLine();

        int n = Integer.parseInt(inputLine2);
        int count = 1;
        for (char x : inputLine1.toCharArray()) {
            if (count == n) {
                System.out.println(x);
                break;
            }
            count++;
        }
    }
}
