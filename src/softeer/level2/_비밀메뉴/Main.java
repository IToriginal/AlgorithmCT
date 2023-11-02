package softeer.level2._비밀메뉴;

import java.io.*;
import java.util.*;

public class Main {

    private static final String SECRET = "secret";
    private static final String NORMAL = "normal";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String secretBtn = br.readLine().trim();
        String userBtn = br.readLine().trim();

        if (userBtn.length() < secretBtn.length()) {
            System.out.print(NORMAL);
        } else if (userBtn.contains(secretBtn)) {
            System.out.print(SECRET);
        } else {
            System.out.print(NORMAL);
        }
    }

}
