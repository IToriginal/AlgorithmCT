package programmers.level1;
/**
 * 2023. 07. 25 (화)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java">자릿수 더하기</a>
 */
class AddIndexNum {
    public int solution(int n) {
        int answer = 0;
        String sNum = Integer.toString(n);

        for (int i = 0; i < sNum.length(); i++) {
            answer += sNum.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        AddIndexNum result = new AddIndexNum();
        System.out.println(result.solution(123)); // 1 + 2 + 3 = 6
        System.out.println(result.solution(987)); // 9 + 8 + 7 = 24
    }
}
