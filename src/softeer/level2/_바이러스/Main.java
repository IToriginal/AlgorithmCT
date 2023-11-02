package softeer.level2._바이러스;

import java.io.*;
import java.util.*;

public class Main {

    public static int n, k, p;

    public long solution() {
        long virus = k;
        for(int i = 1; i <= n; i++) {
            virus = (virus * p) % 1000000007;
        }
        return virus;
    }

    public static void main(String args[]) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        k = Integer.parseInt(input[0]);
        p = Integer.parseInt(input[1]);
        n = Integer.parseInt(input[2]);
        System.out.println(T.solution());
    }
}


