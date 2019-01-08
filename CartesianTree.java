/**
 * Created by MalhotR1 on 04/24/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CartesianTree {
    public static void main(String[] args) throws IOException {
        int[] arr = {9,3,7,1,8,12,10,20,15,18,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int index = getSmallestElement(arr, 0 , arr.length - 1);
        CT root = new CT(arr[index]);
        root.left = getSubTree(arr,0, index - 1);
        root.right = getSubTree(arr, index + 1, arr.length - 1);
        printInorder(root);

    }

    private static void printInorder(CT root) {
        if (root == null) return;
        else {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    private static CT getSubTree(int[] arr, int start, int end) {
        if (start > end) return null;
        int index = getSmallestElement(arr, start, end);
        CT node  = new CT(arr[index]);
        node.left = getSubTree(arr, start, index - 1);
        node.right = getSubTree(arr, index + 1, end);
        return node;
    }

    public static int getSmallestElement(int[] arr, int start, int end) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }

}
class CT {
    int val;
    CT left;
    CT  right;

    public CT(int val) {
        this.val = val;
    }
}
