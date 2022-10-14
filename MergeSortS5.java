//Sorting 5: Merge Sort Manjiri Bhandarwar
public class MergeSortS5 {
	
	public static void main(String args[]){
        int [] testArray = {4,77,98,30,20,50,77,22,49,2};
        mergeSort(testArray, testArray.length);
        
        System.out.println("Sorted array: ");
        
        for (int x: testArray) {
        	System.out.print(x + " ");
        }
    }
	
	//Merge Arrays Method
	public static void mergeArrays(int[] mergedArray, int[] left,int[] right,int leftLength, int rightLength){

		//Three variables to keep track of the indexes of arrays left, right, and merged array
		int index1 = 0;
		int index2 = 0;
		int indexMerged = 0;

		//While loop will only end once one of the arrays (the shorter one) has reached its length
		while (index1 < leftLength && index2 < rightLength){

			//If number at current index of left array is smaller than number at current index of right,
			//assign this number to current index of mergedArray and then increment the indexes
			if (left[index1] < right[index2]){
				mergedArray[indexMerged] = left[index1];
				index1++;
			}
			//If not, assign number from right array to current index of mergedArray and then increment the indexes
			else{
				mergedArray[indexMerged] = right[index2];
				index2++;
			}
			indexMerged++;
		}

		//Following while loops populate the merged array with the remaining numbers (leftovers) of longer array
		while (index1 < leftLength){
			mergedArray[indexMerged] = left[index1];
			index1++;
			indexMerged++;
		}

		while (index2 < rightLength){
			mergedArray[indexMerged] = right[index2];
			index2++;
			indexMerged++;
		}
	}

	//Exercise 7
	public static void mergeSort(int [] array, int arrayLength){

		//BASECASE: is when the array length is 1, in this case there is no need to sort the array and just return
		if (arrayLength == 1) {
			return;
		}

		//Dividing array into two subarrays (making copies of subarrays)
		int middle = arrayLength/ 2;
		int [] left = new int[middle];
		int [] right = new int[arrayLength-middle];

		//Sorting the sub arrays
		for (int i = 0; i < middle; i++) {
			left[i] = array[i]; 
		}
		for (int j = middle; j < arrayLength; j++) {
			right[j - middle] = array[j];
		}

		//RECURSIVE DECOMPOSITION
		//Two recursive calls on sub-arrays.
		//This will keep splitting and sorting the halves of the arrays until the base case has been reached

		//First recursive call sorts left half of array and puts the result in sub-array left
		mergeSort(left,middle);
		//Second recursive call sorts right half of array and puts the result in sub-array right
		mergeSort(right,arrayLength-middle);

		//Using the mergeArrays function created in Q6 to merge the two halves
		//Merging two halves and placing the result in the array "array"
		mergeArrays(array, left,right,middle,arrayLength-middle);
	}
}
