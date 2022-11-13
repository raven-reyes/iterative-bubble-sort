import java.util.Arrays;
// bubblesort iteratively and optimized 
public class IterativeBubbleSort {
	public static void bubblesort(int arr[],int n) {
		for(int i = 0 ; i < n - 1 ; i++) { //outer loop for keeping track of whole passes
			                               //and incrementing i after a whole pass 
			                               //in worst case the number of passes are 1 less than n
			int flag = 0 ;//we improve this algorithm by terminating the first time the array gets sorted
			              //so we will not have to do n - 1 passes if the array gets sorted with fewer passes, hence reducing computation time
			              // this flag method is effective when the array is already sorted , because you will only need one pass from the 
			              // outer loop and n - 1 comparisons from the inner loop , so the best case is when the array is already sorted
			             // and the time complexity is one pass from outer loop (1) * comparisons from inner loop(n - 1) 
			             //hence 1 * n - 1 which is simply  O(n)
			             // otherwise the time complexity is the number of passes from the outer loop(n - 1) * number of comparisons in 
			             // every pass(n - 1) hence (n - 1) * (n -1) which is simply O(n*n)
			for(int j = 0 ; j < n -1 - i ; j++) {// for loop for traversing/looping through the elements 
				int temp ;  //temporary variable to store elements before swapping
				if(arr[j] > arr[j + 1]) { //comparing current array element with its next element
					                   //if current element is  greater than its next element, swap them
					temp = arr[j + 1];  // hold the next array element arr[j + 1] in a temp storage
					arr[j + 1]= arr[j]; // // at the place of arr[i + 1] store arr[i]
				    arr[j] = temp; // and at the place of arr[i] store arr[i + 1] which you have stored
                                  // temporarily in temp
				    flag = 1; // if there is any swapping set flag to 1
				}
			}
				if (flag == 0) { // if flag is zero
					break;     // we break from the outer loop, and print our sorted array
				} 
			}
		}
	
	// example driver code
	public static void main(String[] args) {
		int n = 6 ;
		int arr[] = {25 , 16 , 17 , 4, 9 , 2};
		bubblesort(arr,n);
		System.out.println(Arrays.toString(arr));

	}

}
