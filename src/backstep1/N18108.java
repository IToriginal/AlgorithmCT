package backstep1;
//수리추론
import java.util.Scanner;

/**
 * 불기와 서기의 차이는 543년
 * 주어진 불기 연도 - 543 = 서기의 연도
 */
public class N18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bYear = sc.nextInt();
        System.out.println(bYear-543);

    }
}
