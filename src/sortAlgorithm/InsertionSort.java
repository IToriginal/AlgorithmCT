package sortAlgorithm;

/**
 * 삽입 정렬 (InsertionSort)
 * 시간복잡도: O(n2) - 중첩 반복문을 통해서 정렬됨
 * 요약: 연결리스트일때 하나씩 연결해주기
 *
 * 삽입정렬은 첫번째부터 도는 버블정렬이나, 선택정렬과는 다르게 두번째 인덱스부터 시작해서
 * 자신의 앞ㄱ에 있는 값들과 비교하여 적절한 위치를 찾아 넣어주는 형식이다.
 * 즉, 정렬을 위해 비교하는 범위자체가 훨씬 작고, 연소도 최소 O(n) 만큼만 발생할 수도 있다.
 */
public class InsertionSort {
    public static void solution(int[] arr) {
        final int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int position = i;

            while (position > 0 && key < arr[position - 1]) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = key;

            int count = i;
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
