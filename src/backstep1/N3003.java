package backstep1;

import java.util.Scanner;

public class N3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        king = king - sc.nextInt();
        queen= queen - sc.nextInt();
        rook = rook - sc.nextInt();
        bishop = bishop - sc.nextInt();
        knight = knight - sc.nextInt();
        pawn = pawn - sc.nextInt();

        //출력 값 주의. System.out.print을 이용해서 공백 구분
        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.print(pawn);

    }
}
