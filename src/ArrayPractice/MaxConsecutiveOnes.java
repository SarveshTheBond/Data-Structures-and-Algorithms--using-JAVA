package ArrayPractice;

public class MaxConsecutiveOnes  {

    public static void main(String[] args) {
       int[] nums = {1,0,1,1,0,1};
        int result = findMaxConsecutiveOnes(nums);
       // Output: 2
        System.out.println(result);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int oneStart = 0;
        int oneCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                oneStart=oneStart+1;
            }else{
                oneStart=0;
            }
            if(oneCount<oneStart){
               // oneStart=i;
                oneCount=oneStart;
            }
        }
        return oneCount;
    }
}
