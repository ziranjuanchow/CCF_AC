package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by liudong on 2018/11/14.
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example 1:

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

 It doesn't matter what you leave beyond the returned length.
 */
public class RemoveDuplicatesfromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n :nums) {
            if (i == 0 || n > nums[i-1]) {
                    nums[i++] = n;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
        }
        return i;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesfromSortedArray_26 s = new RemoveDuplicatesfromSortedArray_26();
        int result = s.removeDuplicates(nums);
        System.out.print(result);
    }
}
