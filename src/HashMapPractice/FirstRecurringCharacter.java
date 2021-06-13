package HashMapPractice;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        int[] arr = {2,5,1,2,3,5,1,2,4};
        System.out.println(firstRecurringInteger(arr));
    }

    public static Integer firstRecurringInteger(int[] arr){
        int result = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return arr[i];
            }
            map.put(arr[i], 1);
        }
        return null;
    }
}
