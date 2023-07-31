package solvedAc.class1;

import java.io.*;
import java.util.*;

public class _10809_SearchAlpha {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] posArray = new int[26];
        Arrays.fill(posArray, -1);

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char transferInput = input.charAt(i);

            if (posArray[transferInput - 'a'] == -1) {
                posArray[transferInput - 'a'] = i;
            }
        }

        for (int x : posArray) {
            System.out.print(x + " ");
        }
    }
}
