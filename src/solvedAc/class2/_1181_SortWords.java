package solvedAc.class2;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class _1181_SortWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        List<String> words = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            words.add(br.readLine());
        }

        HashSet<String> uniqueWords = new HashSet<>(words);

        // List<String> sortWords = new ArrayList<>(uniqueWords);
        // Collections.sort(sortWords, new WordComparator());
        List<String> sortWords = uniqueWords.stream().sorted((s1, s2) -> {
                int lengthComparator = Integer.compare(s1.length(), s2.length());
                if (lengthComparator != 0) {
                    return lengthComparator;
                }
                return s1.compareTo(s2);
            })
            .collect(Collectors.toList());

        for (String word : sortWords) {
            System.out.println(word);
        }
    }

    // static class WordComparator implements Comparator<String> {
    //     @Override
    //     public int compare(String s1, String s2) {
    //         int lengthComparator = Integer.compare(s1.length(), s2.length());
    //         if (lengthComparator != 0) {
    //             return lengthComparator;
    //         }
    //         return s1.compareTo(s2);
    //     }
    // }
}
