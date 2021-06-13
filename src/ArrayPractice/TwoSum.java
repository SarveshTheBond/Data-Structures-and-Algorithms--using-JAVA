package ArrayPractice;

import java.util.*;
import java.util.stream.Collectors;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class TwoSum {

    //O(n^2)
    public static int[] twoSum(int[] array, int target) {
        int[] result = new int[2];
        List inputList = Arrays.asList(array);
        if (array.length < 2) {
            System.out.println("Invalid Input");
        }
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                System.out.println("Invalid Input");
            }
        }
            for (int i = 0; i < array.length; i++) {
                int firstelement = array[i];
                for (int j = i+1; j < array.length; j++) {
                    if ((target - firstelement) == array[j]) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }
            return result;
        }

        //O(n)
    public static int[] twoSum2(int[] array, int target) throws IllegalArgumentException {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
          int complement = target - array[i];
           if(map.containsKey(complement)){
               return new int[]{i,map.get(complement)};
           }
           map.put(array[i],i);
        }
        throw new IllegalArgumentException("Invalid Argument Passed");
    }

    public static void main(String[] args) {
        int[] nums = {3,3};//{2,7,11,15};
        int target = 6;//9;
        int[] result;
        result = twoSum2(nums, target);
        System.out.println("First index is: "+result[0]+" Second index is: "+result[1]);
    }
    }

