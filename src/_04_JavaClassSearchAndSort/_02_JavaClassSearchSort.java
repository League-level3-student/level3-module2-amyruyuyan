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
    	Arrays.binarySearch(arr, 4);
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        Collections.binarySearch(list, list.get(0));
        return null;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        
        return null;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        
        return null;
    }
}
