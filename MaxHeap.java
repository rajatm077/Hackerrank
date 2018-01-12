/**
 * Created by MalhotR1 on 10/05/2017.
 */
public class MaxHeap {
    static int[] buildMaxHeap(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            int parent = (i-1) / 2;
            int j = i;
            while (parent >= 0 && nums[parent] < nums[j]) {
                int temp = nums[parent];
                nums[parent] = nums[j];
                nums[j] = temp;

                j = parent;
                parent = (parent-1) / 2;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7, 6, 5, 14, 9, 2, 100};
        nums = buildMaxHeap(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
