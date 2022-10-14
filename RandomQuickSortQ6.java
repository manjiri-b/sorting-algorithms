//Sorting 6: Quick Sort Manjiri Bhandarwar (Implementing Randomized Quick Sort)

import java.util.*;

public class RandomQuickSortQ6 {
	
	public static void main(String args[]){
        int [] testArray = {4,77,98,30,20,50,77,22,49,2};
        quickSort(testArray, 0, testArray.length-1);
        
        System.out.println("Sorted array: ");
        
        for (int x: testArray) {
        	System.out.print(x + " ");
        }
    }
	
	//Creating the partitioning method
	public static int partition(int[] array, int start, int end){

		//Choosing a random pivot using .nextInt()
		Random random= new Random();
        int pivotInd = random.nextInt(end-start)+start; 
		
		int temp1=array[pivotInd]; 
        array[pivotInd]=array[end];
        array[end]=temp1;
        
        int pivot = array[end];

		//Variable that points to the larger number
		int pointer = start-1; 

		//Using a for loop to traverse through the array and comparing each number with the pivot
		for(int i = start; i <= end - 1; i++){

			// If element is smaller than the pivot, then swap it 
			if (array[i] < pivot) {

				//Incrementing the pointer index
				pointer++; 

				//Swapping the elements at pointer index and at j
				int temp = array[pointer];
				array[pointer] = array[i];
				array[i] = temp;
			}
		}

		//Swapping the pivot with number pointer refers to 
		int temp = array[pointer+1];
		array[pointer+1] = array[end];
		array[end] = temp;

		//Returning the index where partitioning took place
		return (pointer + 1);
	}

	//Creating quickSort method
	public static void quickSort(int[] array, int start, int end){
		if (start < end) {
			//Using the partition function to find the pivot (right to pivot: elements greater than it, left of pivot: elements smaller than it)ght
			int pivot = partition(array, start, end);

			// Using the pivot position found and using that in two recursive calls that will sort the array
			//Sorting left of pivot
			quickSort(array, start, pivot-1);

			//Sorting right of pivot
			quickSort(array, pivot+1, end);
		}
	}
}
