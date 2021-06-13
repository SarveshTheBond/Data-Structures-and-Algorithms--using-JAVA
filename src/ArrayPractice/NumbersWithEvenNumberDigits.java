package ArrayPractice;

import java.util.HashMap;
import java.util.Map;

public class NumbersWithEvenNumberDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896, 42,56};
        System.out.println(findNumbers2(nums));
    }
    public static int findNumbers(int[] nums) {
        int temp=0;
        for(int i=0; i<nums.length; i++){
            if(countDigit(nums[i]) %2 ==0){
                ++temp;
            }
        }
        return temp;
    }

    public static int countDigit(int num){
        if(num/10==0)
            return 1;
        return 1+countDigit(num/10);
    }

    public static int findNumbers2(int[] nums) {
        int temp=0;
        for(int i=0; i<nums.length; i++){
            String s = Integer.toString(nums[i]);
            if(s.length() %2 ==0){
                ++temp;
            }
        }
        return temp;
    }
}
