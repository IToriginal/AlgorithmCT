package inflearn._07_Recursive_Tree_Graph._09_Tree말단노드까지의가장짧은경로;

class Node_DFS {
    int data;
    Node_DFS lt, rt;

    public Node_DFS(int value) {
        data = value;
        lt = rt = null;
    }
}

public class Answer_DFS {
    Node_DFS root;

    public int DFS(int L, Node_DFS root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

    public static void main(String[] args) {
        Answer_DFS T = new Answer_DFS();
        T.root = new Node_DFS(1);
        T.root.lt = new Node_DFS(2);
        T.root.rt = new Node_DFS(3);
        T.root.lt.lt = new Node_DFS(4);
        T.root.lt.rt = new Node_DFS(5);
        System.out.println(T.DFS(0, T.root));
    }
}
