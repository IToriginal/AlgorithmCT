//입출력과 사칙연산
package step1;

import java.util.Scanner;

public class N1008 {
    public static void main(String[] args) {
        // 두 정수의 나눗셈
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.println(A/B);
        scanner.close();
    }
}
