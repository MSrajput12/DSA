package array;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDuplicates {
        public ArrayList<Integer> duplicates(int arr[]) {

               HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            
            if(set.contains(arr[i])){
                result.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        
        return result;
        }
    }

