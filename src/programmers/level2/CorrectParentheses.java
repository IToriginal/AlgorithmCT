/**
 * 2023. 07. 21 (금)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java">올바른 괄호</a>
 */
package programmers.level2;

import java.util.Stack;

public class CorrectParentheses {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CorrectParentheses result = new CorrectParentheses();
        System.out.println(result.solution("()()"));
        System.out.println(result.solution("(())()"));
        System.out.println(result.solution(")()("));
        System.out.println(result.solution("(()("));
    }
}
