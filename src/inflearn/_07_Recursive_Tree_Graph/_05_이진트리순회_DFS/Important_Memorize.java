package inflearn._07_Recursive_Tree_Graph._05_이진트리순회_DFS;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Important_Memorize {
    Node root;

    public void preorderDFS(Node root) {
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            preorderDFS(root.lt);
            preorderDFS(root.rt);
        }
    }

    public void inorderDFS(Node root) {
        if (root == null) return;
        else {
            inorderDFS(root.lt);
            System.out.print(root.data + " ");
            inorderDFS(root.rt);
        }
    }

    public void postorderDFS(Node root) {
        if (root == null) return;
        else {
            postorderDFS(root.lt);
            postorderDFS(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Important_Memorize tree = new Important_Memorize();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        System.out.print("전위 순회: ");
        tree.preorderDFS(tree.root);
        System.out.println();

        System.out.print("중위 순회: ");
        tree.inorderDFS(tree.root);
        System.out.println();

        System.out.print("후위 순회: ");
        tree.postorderDFS(tree.root);
        System.out.println();
    }
}
