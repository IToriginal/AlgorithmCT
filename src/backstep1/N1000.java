//입출력과 사칙연산
package backstep1;
//Scanner 를 사용하기 위한 import
import java.util.Scanner;

public class N1000 {
    public static void main(String[] args) {
        //객체를 생성 Scanner(System.in)에서 System.in은 입력값을 Byte 단위로 읽는 것을 뜻함
        // 두 정수의 덧셈
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A+B);
        scanner.close();
    }
}
