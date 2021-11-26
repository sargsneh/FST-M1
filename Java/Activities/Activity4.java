package Activities;

import java.util.Arrays;

public class Activity4 {
	//method to sort any array
	static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        // to print unsorted array
        System.out.println("Unsorted Array in Ascending Order: "+ Arrays.toString(data));
        
        //initiate ascending sorting
        ascendingSort(data);
        
        //Print sorted array
        System.out.println("Sorted Array in Ascending Order: "+ Arrays.toString(data));
    }
}
