package inflearn.응용._01_시뮬레이션_구현._03_잃어버린강아지;

public class Answer {
    public int solution(int[][] board){
        int count = 0;
        int n = board.length;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int x_hyunsu = 0, x_dog = 0, y_hyunsu = 0, y_dog = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    x_hyunsu = i;
                    y_hyunsu = j;
                }
                if (board[i][j] == 3) {
                    x_dog = i;
                    y_dog = j;
                }
            }
        }

        int d_hyunsu = 0, d_dog = 0;
        while (count < 10000) {
            count++;
            int nx_hyunsu = x_hyunsu + dx[d_hyunsu];
            int ny_hyunsu = y_hyunsu + dy[d_hyunsu];
            int nx_dog = x_dog + dx[d_dog];
            int ny_dog = y_dog + dy[d_dog];
            boolean flag_hyunsu = true, flag_dog = true;
            if (nx_hyunsu < 0 || nx_hyunsu >= n || ny_hyunsu < 0 || ny_hyunsu >= n || board[nx_hyunsu][ny_hyunsu] == 1) {
                d_hyunsu = (d_hyunsu + 1) % 4;
                flag_hyunsu = false;
            }

            if (nx_dog < 0 || nx_dog >= n || ny_dog < 0 || ny_dog >= n || board[nx_dog][ny_dog] == 1) {
                d_dog = (d_dog + 1) % 4;
                flag_dog = false;
            }

            if (flag_hyunsu) {
                x_hyunsu = nx_hyunsu;
                y_hyunsu = ny_hyunsu;
            }

            if (flag_dog) {
                x_dog = nx_dog;
                y_dog = ny_dog;
            }

            if (x_hyunsu == x_dog && y_hyunsu == y_dog) break;
        }
        if (count >= 10000) count = 0;
        return count;
    }

    public static void main(String[] args){
        Answer T = new Answer();
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