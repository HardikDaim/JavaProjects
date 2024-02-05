package Heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElement kthLargestElement = new KthLargestElement();

        // Example usage:
        int[] nums = {3, 1, 4, 2, 2};
        int k = 3;

        int result = kthLargestElement.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
