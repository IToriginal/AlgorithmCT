package sortAlgorithm;

/**
 * 버블 정렬 (BubbleSort)
 * 시간복잡도: O(n2) - 중첩 반복문을 통해서 정렬됨
 * 요약: 서로 붙은 애들끼리 자리바꾸기
 *
 * 배열의 크기만큼 반복하되,
 * [0-1], [1-2], [2-3] ... [(n-1) - n]
 * 이러한 형식으로 바로 다음 노드와 비교해가면서 큰 값을 뒤로 보내주면서 정렬하는 형식
 */
public class BubbleSort {
    public static void solution(int[] arr) {
        final int length = arr.length;

        for (int i = 0; i < length; i++) { // 배열의 길이만큼 순회
            for (int j = 0; j < length - i; j++) { // 0 ~ size - 1 까지
                if (j + 1 < length && arr[j] > arr[j + 1]) { // 인접한 노드끼리 계속 비교하면서 자리 교체
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
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
