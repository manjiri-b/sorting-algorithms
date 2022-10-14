//Sorting 2 Algorithm: Bubble Sort Recursive Manjiri Bhandarwar

public class BubbleSortRecursiveS2 {
	
	public static void main(String args[]){
        int [] testArray = {4,77,98,30,20,50,77,22,49,2};
        recursiveBubbleSort(testArray, testArray.length);
        
        System.out.println("Sorted array: ");
        
        for (int x: testArray) {
        	System.out.print(x + " ");
        }
    }
	
	//Recursive Bubble Sort Algorithm
    public static void recursiveBubbleSort(int[] array, int length){
        
    	//Base case would be when array length is 1 (no sorting needed)
    	if (length == 1) {
        	return;
        }
    	else {
	    	int temp;
	    	
	    	//First pass would be from start to end index
	    	for (int i = 0; i < length - 1; i++){
	            if (array[i] > array[i + 1]) {
	            	//swapping the elements if element on the left is bigger than element on the right
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
	            }
	        }
	    	
	    	//After the first pass, the last element is the largest (fixed) 
	    	//Now we call the recursive bubblesort function (recursvie) again but only till length - 1
	    	//This will continue until entire array is sorted
	    	recursiveBubbleSort(array, length-1);
    	}
    }
}
