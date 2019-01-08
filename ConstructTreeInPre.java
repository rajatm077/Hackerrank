/**
 * Created by MalhotR1 on 04/23/2018.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeInPre {
    static int[] inorder = {4,2,6,5,7,8,1,9,10,3};
    static int[] preorder = {1,2,4,5,6,8,7,3,9,10};
    static int next = 0;
    public static void main(String[] args) throws IOException {
        TreeNode root = new TreeNode(preorder[0]);
        next++;
        int index = getLocation(inorder, root.val);
        root.left = getSubTree(0, index - 1);
        root.right = getSubTree(index + 1, preorder.length - 1);
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            TreeNode node = qu.poll();
            System.out.print(node.val + " ");
            if (node.left != null) qu.add(node.left);
            if (node.right != null) qu.add(node.right);
        }
    }


    private static TreeNode getSubTree(int start, int end) {
        if (start <= end) {
            TreeNode node = new TreeNode(preorder[next]);
            next++;
            int index = getLocation(inorder, next);
            if (index > 0) node.left = getSubTree(start, index - 1);
            if (index + 1 < end) node.right = getSubTree(index + 1, end);
            return node;
        }
        else return null;
    }

    private static int getLocation(int[] inorder, int val) {
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == val) return i;
        }
        return -1;
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
        val = Integer.MIN_VALUE;
        left = null;
        right = null;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
