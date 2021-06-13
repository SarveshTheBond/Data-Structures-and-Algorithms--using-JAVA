package ArrayPractice;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arra= {1,0,2,3,0,4,5,0};
        duplicateZeros(arra);
    }

    public static void duplicateZeros(int[] arr) {
        int zeroCount = 0;
        for(int i=0; i<arr.length;i++) {
            if (arr[i] == 0)
                ++zeroCount;
        }
        System.out.println("Zero Count is: "+zeroCount);
            int[] test = new int[arr.length+zeroCount];
            int length = 0;
            for(int i=0;i<arr.length; i++){
                test[length]=arr[i];
                if(arr[i]==0) {
                    length=length+1;
                    test[length] = 0;
                }
               ++length;
            }
        System.out.println(Arrays.toString(test));
          int[] finalArray=  Arrays.copyOfRange(test,0,arr.length);
        System.out.println(Arrays.toString(finalArray));
        }
    }
