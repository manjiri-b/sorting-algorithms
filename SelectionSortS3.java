//Sorting 3: Selection Sort Code Sorting 3 Manjiri Bhandarwar
public class SelectionSortS3 {
	
	public static void main(String args[]){
        int [] testArray = {4,77,98,30,20,50,77,22,49,2};
        selectionSort(testArray, testArray.length);
        
        System.out.println("Sorted array: ");
        
        for (int x: testArray) {
        	System.out.print(x + " ");
        }
    }
	
	public static void selectionSort(int array[], int length){
		
		int temp, indexOfMin;
		
		// i keeps track of indexOfMin and what to swap
        for (int i = 0; i < length; i++)
        {
            // Find the minimum element in unsorted array
            indexOfMin = i; //Setting default min index to first element
            
            //j keeps track of array index
            for (int j = i+1; j < length; j++)
                if (array[j] < array[indexOfMin])
                	indexOfMin = j; //changing indexOfMin to J
 
            // Swapping the minimum element with the 'i' element
            temp = array[indexOfMin];
            array[indexOfMin] = array[i];
            array[i] = temp;
        }
    }
}
