/**
 * Created by MalhotR1 on 04/23/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedArrToBST {
    public static void main(String[] args) throws IOException {
        int[] nums = {-10,-3,0,5,9};
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getTree(nums, start, mid - 1);
        root.right = getTree(nums, mid + 1, end);
        System.out.println(root.val);
    }

    private static TreeNode getTree(int[] nums, int start, int end) {
        if (start >= 0 && end < nums.length && start <= end) {
            if (start == end) return new TreeNode(nums[start]);

            int mid = (start + end) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getTree(nums, start, mid - 1);
            node.right = getTree(nums, mid + 1, end);
            return node;
        }
        return null;
    }

}
