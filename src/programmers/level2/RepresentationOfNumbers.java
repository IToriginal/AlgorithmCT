package programmers.level2;
/**
 * 2023. 07. 25 (화)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12924?language=java">숫자의 표시</a>
 */
class RepresentationOfNumbers {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) answer++;
                else if (sum > n) break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RepresentationOfNumbers result = new RepresentationOfNumbers();
        System.out.println(result.solution(15));
    }
}
