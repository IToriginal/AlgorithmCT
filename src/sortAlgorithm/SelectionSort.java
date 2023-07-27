package sortAlgorithm;

/**
 * 선택 정렬 (SelectionSort)
 * 시간복잡도: O(n2) - 중첩 반복문을 통해서 정렬됨
 * 요약: 비교할 인덱스 중 최소값 찾기
 *
 * 선택 정렬은 해당 자리에 들어갈 최소값 또는 최대값 (역순정렬시) 찾기
 * for문을 1번 순회할 때 마다 한 자리가 완성
 * 기대값만큼 정렬을 해줄 수도 있다.
 */
public class SelectionSort {
    public static void solution(int[] arr) {
        final int length = arr.length;

        for (int i = 0; i < length; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                arr[min] = arr[min] + arr[i];
                arr[i] = arr[min] - arr[i];
                arr[min] = arr[min] - arr[i];
            }

            int count = i + 1;
            System.out.print("[" + count + "] - ");
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 54, 99, 3, 2, 1, 0};
        solution(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
