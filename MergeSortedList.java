/**
 * Created by MalhotR1 on 05/17/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSortedList {
    public static void main(String[] args) throws IOException {
        Node2 ha = new Node2();
        Node2 hb = new Node2();
        int[] arr = {1,2};
        ha = insertIntoList(ha, arr);
        int[] arr2 = {3};
        hb = insertIntoList(hb, arr2);
        Node2 root = mergeLists(ha, hb);

    }

    private static Node2 insertIntoList(Node2 ha, int[] arr) {
        Node2 root = ha;
        for (int i = 0; i < arr.length; i++) {
            root.data = arr[i];
            root.next = new Node2();
            root = root.next;
        }
        return ha;
    }

    private static Node2 mergeLists(Node2 headA, Node2 headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if (headA == null) return headB;
        if (headB == null) return headA;

        Node2 ptr = new Node2();
        Node2 root = ptr;
        while (headA.next != null && headB.next != null) {
            if (headA.data < headB.data) {
                ptr.data = headA.data;
                headA = headA.next;

            } else {
                ptr.data = headB.data;
                headB = headB.next;
            }
            ptr.next = new Node2();
            ptr = ptr.next;
        }

        if (headA.next == null) ptr = headB;
        else ptr = headA;
        System.out.println(root);
        return root;

    }

}

class Node2 {
    int data;
    Node2 next;
}
