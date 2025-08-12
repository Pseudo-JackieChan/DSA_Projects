package com.hansin;
import java.util.Scanner;

public class Sorting_Searching {
	static void bubbleSort(int arr[]) {
		int n = arr.length;
		boolean swapped;
		for(int i = 0; i < n ; i++) {
			swapped = false;
			for(int j = 0; j < n - 1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
        }
	static int LinearSearch(int arr[],int key) {
	        for(int i=0;i<arr.length;i++) {
				if (arr[i] == key) {
					return i;
				}
	        }
			return -1;
	}
	static int binarySearch(int []arr,int key) {
		int left=0,right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==key) return mid;
			else if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
		}
		static void printArray(int arr[]) {
            for(int value:arr) {
                System.out.print(value+" ");
            }
            System.out.println();
        }
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements in the array:");
			int n=sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Original Array:");
			printArray(arr);
			bubbleSort(arr);
			System.out.println("Sorted Array:");
			printArray(arr);
			System.out.println("Enter the element to search:");
			int key = sc.nextInt();
			int linearResult = LinearSearch(arr, key);
			if (linearResult != -1) {
				System.out.println("Element found at index: " + linearResult);
			} else {
				System.out.println("Element not found using Linear Search.");
			}
	}
	}