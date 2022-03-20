package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
    	Arrays.sort(arr);
        for( int i : arr ) {
            System.out.print(i);
        }
        return arr; 
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        for (Double s : list) {
        	System.out.println(s);
        }
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
    	Arrays.sort(arr);
        int results = Arrays.binarySearch(arr, key);
        if (results >= 0) {
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
    	 Collections.sort(list);
         int results = Collections.binarySearch(list, key);
         if (results >= 0) {
        return true;
         }
         else{
        	return false;
        }
    }
}
