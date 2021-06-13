package ArrayPractice;
//Kadane's algorithm
public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            if (sum < temp) {
                sum = temp;
            }
            if(temp<0){
                temp=0;
            }
        }
        return sum;
    }

    public static int maxSubArray2(int[] nums) {
        int sum = nums[0];
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if( temp + nums[i]<nums[i]){
                temp=nums[i];
            }else{
                temp=temp+nums[i];
            }
            if(sum<temp){
                sum=temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1};//{-2,1,-3,4,-1,2,1,-5,4};
       int output;// 6
        //Explanation: [4,-1,2,1] has the largest sum = 6.
        output=maxSubArray2(nums);
        System.out.println(output);
    }

}
