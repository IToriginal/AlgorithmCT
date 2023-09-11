package inflearn._07_Recursive_Tree_Graph._08_송아지찾기;

import java.io.*;
import java.util.*;

public class Answer {
    // 송아지를 찾을 때, 현재 위치에서 가능한 3가지의 이동 방법 (문제에 스카이콩콩의 이동 범위가 알려져 있음.)
    int[] dist = {1, -1, 5};

    // 이미 방문한 위치를 체크하기 위한 배열. 방문한 위치는 1로 표시
    int[] visit;

    // BFS(너비 우선 탐색)를 위한 큐 생성. 탐색할 위치를 저장할 때 사용.
    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int s, int e) { // s: 시작 위치, e: 목표 위치(target)
        visit = new int[10001]; // 직선의 좌표가 1부터 10000까지이기 때문에 배열을 초기화하고, 방문 여부를 체크하는데 사용
        visit[s] = 1; // 시작 위치를 방문한 것으로 체크 = 1
        queue.offer(s); // 시작 위치를 큐에 추가
        int answer = 0; // 현재까지 몇 번의 이동을 했는지를 나타내는 변수로 사용

        while (!queue.isEmpty()) { // 큐가 비어있는지 확인하고 비어있지 않으면 반복. 비어있다면 모든 경로를 탐색한 것
            int len = queue.size(); // 현재 큐에 들어있는 위치의 갯수를 저장. (탐색할 수)
            for (int i = 0; i < len; i++) { // 한개씩 탐색
                int x = queue.poll(); // 탐색할 대상을 큐에서 꺼냄
                for (int j = 0; j < 3; j++) { // 현재 위치에서 가능한 3가지 이동을 시도
                    int nx = x + dist[j]; // 이동한 위치를 nx에 저장
                    if (nx == e) return answer + 1; // 이동한 위치가 목표위치인 e 와 같다면, 현재까지의 이동 횟수에 1을 더한 값을 반환
                    if (nx >= 1 && nx <= 10000 && visit[nx] == 0) { // 이동위치가 범위 내에 있고 아직 방문하지 않았으면,
                        visit[nx] = 1; // 방문 표시 1 을 한다.
                        queue.offer(nx); // 방문해야하기 때문에 큐에 추가한다.
                    }
                }
            }
            answer++; // 이동 횟수를 1 증가 시킨다.
        }
        return 0; // 큐를 모두 탐색했는데 찾지 못했다. 0을 반환
    }

    public static void main(String[] args) throws IOException {
        Answer T = new Answer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s = Integer.parseInt(input[0]); // 5
        int e = Integer.parseInt(input[1]); // 14
        System.out.println(T.BFS(s, e));
    }
}
