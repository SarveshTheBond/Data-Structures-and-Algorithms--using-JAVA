package ArrayPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
        System.out.println(Arrays.toString(sortedSquaresDesc(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
       // Arrays.sort(nums, Collections.reverseOrder());
        Arrays.sort(nums);
        return nums;
    }

    public static Integer[] sortedSquaresDesc(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        // Arrays.sort(nums, Collections.reverseOrder());
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
}
