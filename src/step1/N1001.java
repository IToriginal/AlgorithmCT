//입출력과 사칙연산
package step1;

import java.util.Scanner;

public class N1001 {
    public static void main(String[] args) {
        // 두 정수의 뺄셈
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A-B);
        scanner.close();
    }
}
