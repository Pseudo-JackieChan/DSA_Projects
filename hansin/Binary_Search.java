//write a java program to perform simple binary search
package com.hansin;

public class Binary_Search {
	static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == key) {
				return mid; // Key found
			} else if (arr[mid] < key) {
				left = mid + 1; // Search in the right half
			} else {
				right = mid - 1; // Search in the left half
			}
		}
		return -1; // Key not found
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 10, 40 };
		int key = 10;
		int result = binarySearch(arr, key);
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

}
