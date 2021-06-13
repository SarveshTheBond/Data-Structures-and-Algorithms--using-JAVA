package ArrayPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int[] test = new int[nums.length];
        Map<Integer,Integer> map = new HashMap<>();

        List input = Arrays.asList(nums).stream().collect(Collectors.toList());
        //input.stream().
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                test[i] = nums[i];
            }
        }
            int zeroCount = nums.length - test.length;
            for (int j = test.length; j < test.length + zeroCount; j++) {
                test[j] = 0;
            }

            for (int i = 0; i < test.length; i++) {
                System.out.println(test[i]);
            }
        }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        //Output: [1,3,12,0,0]
        moveZeroes(nums);
    }
}
