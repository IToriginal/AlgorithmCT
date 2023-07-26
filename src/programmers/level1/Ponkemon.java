package programmers.level1;

import java.util.*;
/**
 * 2023. 07. 26 (수)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java">폰켓몬</a>
 */
class Ponkemon {
    public int solution(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();

        for (int num : nums) {
            uniqueNums.add(num);
        }
        return (Math.min(nums.length / 2, uniqueNums.size()));
    }

    public static void main(String[] args) {
        Ponkemon result = new Ponkemon();

        int[] test1 = {3, 1, 2, 3}; // 2
        int[] test2 = {3, 3, 3, 2, 2, 4}; // 3
        int[] test3 = {3, 3, 3, 2, 2, 2}; // 2

        System.out.println(result.solution(test1));
        System.out.println(result.solution(test2));
        System.out.println(result.solution(test3));
    }
}
