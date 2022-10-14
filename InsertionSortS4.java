//Sorting Algorithm 4: Insertion Sort Manjiri Bhandarwar

public class InsertionSortS4 {
	
	public static void main(String args[]){
        int [] testArray = {4,77,98,30,20,50,77,22,49,2};
        insertionSort(testArray);
        
        System.out.println("Sorted array: ");
        
        for (int x: testArray) {
        	System.out.print(x + " ");
        }
    }
	
	//Credit of code: from Sorting Lecture Notes
	public static void insertionSort(int[] array){
		for (int i = 1; i < array.length; i++){
			int j = i;
			int current = array[i];
			while (j > 0 && current < array[j - 1]){
				// Making room for the element. Moving all the elements that are greater than  
				//current element we want to insert, to one index position ahead
				array[j] = array[j - 1];
				j--;
			}
			array[j] = current; //Inserting the element
		}
	}

}
