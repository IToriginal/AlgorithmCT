package inflearn.기본._04_HashMap_HashSet_TreeSet._01_학급회장_해쉬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private int n;
    private char[] votes;
    private char solution() {
        Map<Character, Integer> voteResult = new HashMap<>();
        char answer = ' ';
        int maxVotes = 0;

        for (char vote : votes) {
            int currentVotes = voteResult.getOrDefault(vote, 0) + 1;
            voteResult.put(vote, currentVotes);

            if (currentVotes > maxVotes) {
                maxVotes = currentVotes;
                answer = vote;
            }
        }

        return answer;
    }

    private void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        votes = br.readLine().toCharArray();
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.inputData();
        System.out.println(m.solution());
    }

}
