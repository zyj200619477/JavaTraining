import java.util.*;
public class findSecondHighest {
	public static void main(String[] args) {
		//time complexity o(n) average with quick select, or we could use minHeap with size 2, time complexity O(N * log2)
		int[] nums = new int[] {6,4,7,8,9,0,1,3};
		System.out.println(findKthLargest(nums, 2));
	}
	
	private static int findKthLargest(int[] nums, int k) {
        quickSelect(nums, 0, nums.length - 1, nums.length - k);
        return nums[nums.length - k];
    }
    private static void quickSelect(int[] nums, int start, int end, int k){
        if(start >= end) return;
        Random rand = new Random();
        int pivot = start + rand.nextInt(end - start + 1);
        swap(nums, pivot, end);
        int left = start;
        for(int i = start; i < end; i++){
            if(nums[i] < nums[end]){
                swap(nums, i, left++);
            }
        }
        swap(nums, left, end);
        if(left == k){
            return;
        }else if(left < k){
            quickSelect(nums, left + 1, end, k);
        }else{
            quickSelect(nums, start, left - 1, k);
        }
        
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
