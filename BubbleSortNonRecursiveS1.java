//Sorting 1 Algorithm: Bubble Sort Non Recursive Manjiri Bhandarwar

public class BubbleSortNonRecursiveS1 {
	
	public static void main(String args[]){
        int [] testArray = {4,77,98,30,20,50,77,22,49,2};
        bubbleSort(testArray);
        
        System.out.println("Sorted array: ");
        
        for (int x: testArray) {
        	System.out.print(x + " ");
        }
    }

	//Bubble sort function
	public static void bubbleSort(int[] array){
		int temp;
		//Outer loop to ensure we have a total of n-1 checks/passes
		for (int i = 0; i < array.length - 1; i++){
			
			//Variable j keeps track of elements to be compared
			//At each pass j will end at array.length - i - 1 because the last i elements have already been sorted
			//so we do not have to check for those
			for (int j = 0; j < array.length - i - 1; j++){
				if (array[j] > array[j+1]){ 
					//swapping the elements if element on the left is bigger than elemennt on the right
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

	}

}
