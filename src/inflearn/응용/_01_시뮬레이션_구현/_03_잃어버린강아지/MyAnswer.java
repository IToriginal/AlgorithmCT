package inflearn.응용._01_시뮬레이션_구현._03_잃어버린강아지;

public class MyAnswer {
    private static int hsX = 0, hsY = 0, dogX = 0, dogY = 0;

    private void savePos(int[][] board) {
        int x = 0, y = 0;
        for (int[] line : board) {
            for (int pos : line) {
                if (pos == 2) {
                    hsX = x;
                    hsY = y;
                } else if (pos == 3) {
                    dogX = x;
                    dogY = y;
                }
                y++;
            }
            y = 0;
            x++;
        }
    }

    public int solution(int[][] board){
        int answer = 0, n = board.length;
        int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
        savePos(board); // board의 정보로 현수의 위치와 강아지의 위치를 저장

        int hsD = 0, dogD = 0;
        while (answer < 10000) {
            answer++;
            int hsNx = hsX + dx[hsD];
            int hsNy = hsY + dy[hsD];
            int dogNx = dogX + dx[dogD];
            int dogNy = dogY + dy[dogD];

            boolean hsFlag = true, dogFlag = true;
            if (hsNx < 0 || hsNx >= n || hsNy < 0 || hsNy >= n || board[hsNx][hsNy] == 1) {
                hsD = (hsD + 1) % 4;
                hsFlag = false;
            }

            if (dogNx < 0 || dogNx >= n || dogNy < 0 || dogNy >= n || board[dogNx][dogNy] == 1) {
                dogD = (dogD + 1) % 4;
                dogFlag = false;
            }

            if (hsFlag) {
                hsX = hsNx;
                hsY = hsNy;
            }

            if (dogFlag) {
                dogX = dogNx;
                dogY = dogNy;
            }

            if (hsX == dogX && hsY == dogY) break;
        }
        if (answer >= 10000) answer = 0;
        return answer;
    }

    public static void main(String[] args){
        MyAnswer T = new MyAnswer();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));

        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}