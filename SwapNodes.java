import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by MalhotR1 on 09/25/2017.
 */
public class SwapNodes {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        Node root = new Node(1, null ,null,  1);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int height = 0;
        for (int i = 0; i < N; i++) {
            if (queue.isEmpty()) break;
            Node node = queue.poll();

            String[] in = br.readLine().trim().split(" ");
            int leftData = Integer.parseInt(in[0]);

            if (leftData != -1)  {
                Node left = new Node(leftData, null, null, node.depth + 1);
                node.left = left;
                queue.add(left);
                height = left.depth;
            }

            int righData = Integer.parseInt(in[1]);
            if (righData != -1) {
                Node right = new Node(righData, null, null, node.depth + 1);
                node.right = right;
                queue.add(right);
                if (right.depth > height) height = right.depth;
            }
        }
        int T = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < T; i++) {
            queue.clear();
            queue.add(root);
            int k = Integer.parseInt(br.readLine().trim());

            while (k <= height) {
                if (queue.isEmpty()) break;
                Node node = queue.peek();
                Queue<Node> nq = new LinkedList<>();
                if (node.depth == k - 1) {
                    do {
                        node = queue.poll();
                        if (node.left != null) nq.add(node.left);
                        if (node.right != null) nq.add(node.right);
                        node = queue.peek();
                    } while (node.depth == k-1);
                }
                while (!nq.isEmpty()) {
                    Node n = nq.poll();
                    Node temp = n.left;
                    n.left = n.right;
                    n.right = temp;
                }
                k += k;
            }

            inorderTraversal(root);
            System.out.println();
        }
    }

    private static void inorderTraversal(Node root) {
        if (root == null) return;
        else {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
}

class Node {
    Node left, right;
    int data, depth;


    public Node() {
        data = 0;
        depth = 0;
        left = right = null;
    }

    public Node(int data, Node left, Node right, int depth) {
        this.left = left;
        this.right = right;
        this.data = data;
        this.depth = depth;
    }
}
