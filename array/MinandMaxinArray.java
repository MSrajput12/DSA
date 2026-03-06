package array;

import java.util.ArrayList;

public class MinandMaxinArray {
    public static ArrayList<Integer> main(int []arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];   
            }
            else if (arr[i]>max){
                max=arr[i];
            }
        }
        ArrayList<Integer>result=new ArrayList<>();
        result.add(min);
        result.add(max);

        return result;

    }
    
}
