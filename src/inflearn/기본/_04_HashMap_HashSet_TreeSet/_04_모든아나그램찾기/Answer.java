package inflearn.기본._04_HashMap_HashSet_TreeSet._04_모든아나그램찾기;

import java.util.*;

public class Answer {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        
        for (char x : b.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < b.length() - 1; i++) {
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = b.length() - 1; rt < a.length(); rt++) {
            aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0) + 1);
            if (aMap.equals(bMap)) answer++;
            aMap.put(a.charAt(lt), aMap.get(a.charAt(lt)) - 1);
            if (aMap.get(a.charAt(lt)) == 0) aMap.remove(a.charAt(lt));
            lt++;
        }

        return answer;
    }
    
    public static void main(String[] args) {
        Answer T = new Answer();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}
