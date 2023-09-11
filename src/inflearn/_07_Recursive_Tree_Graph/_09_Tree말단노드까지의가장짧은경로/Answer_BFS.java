package inflearn._07_Recursive_Tree_Graph._09_Tree말단노드까지의가장짧은경로;

import java.util.LinkedList;
import java.util.Queue;

class Node_BFS {
    int data;
    Node_BFS lt, rt;

    public Node_BFS(int value) {
        data = value;
        lt = rt = null;
    }
}

public class Answer_BFS {
    Node_BFS root;

    public int BFS(Node_BFS root) {
        Queue<Node_BFS> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node_BFS cur = queue.poll();
                if (cur.lt == null && cur.rt == null) return level;
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Answer_BFS T = new Answer_BFS();
        T.root = new Node_BFS(1);
        T.root.lt = new Node_BFS(2);
        T.root.rt = new Node_BFS(3);
        T.root.lt.lt = new Node_BFS(4);
        T.root.lt.rt = new Node_BFS(5);
        System.out.println(T.BFS(T.root));
    }
}
