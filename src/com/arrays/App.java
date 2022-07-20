package com.arrays;

import java.util.Arrays;
import java.util.Collections;

//working with arrays

public class App {

	public static void main(String[] args) {
		
		// Three ways to declarte an array
		
		/* Type 1 */
		
		int[] x = {4,3,6,1,2,8,9};
		System.out.println(x[0]);// prints 4
		
		System.out.println("\n************************");
		
		for (int element : x) { //enhanced for loop
			System.out.print(element);// prints the whole array
		}
		
		System.out.println("\n************************");
		
		/* Type 2 */
		
		// create an array
		// start the loop
		// attach the values to the array
		
		int[] arr = new int[10000]; //length of the array is 10000. arr[0]....a[9999] = 0. each value will have a default 0 value
		
		
		/* Type 3 */
		
		Integer[] arry = new Integer[] {4,3,6,1,2,8,9};
		
		/* 
		 * length of the array is final
		 */
		
		System.out.println(arr.length);
		// arr.length = 5000; --The final feild array.length cannot be assigned. 
		// array length is final
		
		
		/*
		 *  Ops: iterate : sorting(ACS-DECS) : Searching
		 */
		
		System.out.println("\n************************");
		
		
		for (int temp : arry) {
			System.out.print(temp + " "); // 4 3 6 1 2 8 9
		}
		
		System.out.println("\n************************");
		
		
		/* sorting an array */
		
		Arrays.sort(arry); // ASC order sort
		
		for(int temp : arry) {
			System.out.print(temp + " "); // 1 2 3 4 6 8 9 
		}
		
		System.out.println("\n************************");
		
		
		// DESC ording
		Arrays.sort(arry,Collections.reverseOrder()); // We are using collections so use Integer (wrapper class) instead of int (primitive), int in other programs will also work with Integer
		
		for (int temp : arry) {
			System.out.print(temp + " ");//DESC order 9 8 6 4 3 2 1 
		}
		
		
		System.out.println("\n************************");
		
		/* Searching: Binary Search: Divide and Conquer */
		
		// only works with ASC sorted array
		
		
		Arrays.sort(arry);
		
		int i = Arrays.binarySearch(arry, 4);// 1 2 3 4 6 8 9 
		
		if(i >=0) 
			System.out.println("Element found at index: " + i);
		
		else 
			System.out.println("Element NOT found");
			
			// value of something that is not present in the array for example 5
			
			i = Arrays.binarySearch(arry, 5);// array is {1,2,3,4,6,7,8,9}
			
			// if 5 was present in the array it would have been at index 4
			System.out.println(i);// formula is -insertionpoint-1 = -4-1 = -5 so the output is -5
			
		
		
		

	}

}
