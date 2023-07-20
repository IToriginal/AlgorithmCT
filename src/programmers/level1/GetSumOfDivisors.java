package programmers.level1;

/**
 * 2023. 07. 20 (목)
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12928">약수의 합</a>
 */
class GetSumOfDivisors {
    public int solution(int n) {
        return getSumOfDivisors(n);
    }

    public static int getSumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        GetSumOfDivisors result = new GetSumOfDivisors();
        System.out.println(result.solution(12));
        System.out.println(result.solution(5));
    }
}
