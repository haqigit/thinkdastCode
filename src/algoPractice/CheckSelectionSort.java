package algoPractice;

import java.util.Arrays;

public class CheckSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 52, 12, 47, 58, 46, 32, 1, 0, 25 };
		int[] arr2 = { 67, 89, 57, 37, 97, 36, 0, 9, 7, 5 };
		SelectionSort.selectionSort(arr1);
		SelectionSort.selectionSort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.print(Arrays.toString(arr2));
	}

}
