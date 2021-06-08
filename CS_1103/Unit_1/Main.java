/**
 * Contents: Testing of sorting algorithms.
 * 
 * Author: Dawid Blom.
 * 
 * Date: 2021/04/10.
 * 
 * Test scores: Test one with 10,000 elements took 68 milliseconds and Test two with 10,000 elements took 4 milliseconds.
 */

import java.util.*;



/**
 * The purpose of this program is to test the java build in sorting algorithms 
 * speed with my own implementation of a sorting algorithm.
 * In this class there are 3 methods. Method 1 will start the entire
 * program since it is the main method, method 2 will sort my array,
 * and method 3 will conduct the testing too see which algorithm is faster, 
 * mine or the build in java sort algorithm.
 */
public class Main 
{
	/**
	 * Method 1:
	 * This is the main method in this program used to execute all the other methods.
	 */
	public static void main(String[] args)
	{
		Main.test();
	}
	
	
	
	/**
	 * Method 2:
	 * By calling this method we will initiate the sorting algorithm called selection sort.
	 * Selection sort is a O(n^2) algorithm, which is fine for small data computations, 
	 * however, not for big data computation. Therefore, I do not expect much from it.
	 * 
	 * How the algorithm works is quite simple. We will start by iterating over an array from
	 * the back to the front. We will check that if the element we're on now is bigger than
	 * the the first element in the array we swap then. We will continue this until all the elements
	 * are sorted. Finally we will return the sorted array.
	 */
	public static void selectionSort(int[] arr)
	{	
		for (int i = arr.length - 1; i > 0; i--)
		{
			int maxLoc = 0;
			
			for (int j = 1; j <= i; j++)
			{
				if (arr[j] > arr[maxLoc])
				{
					maxLoc = j;
				}
			}
			
			int temp = arr[maxLoc];
			arr[maxLoc] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	
	
	
	/**
	 * Method 4:
	 * By calling this method we will start the test of the two algorithms.
	 * The selection sort algorithm I implemented with a run time of O(n^2),
	 * or the build in java sorting algorithm. I will use a build in method 
	 * called currentTimeMillis() to compute the time it took to sort the array.
	 * The first test that will be run is the selection sort algorithm that I 
	 * implemented and the second test that will be run is the build in sort algorithm.
	 */
	public static void test()
	{
		int[] arr1 = new int[10000];
		int[] arr2 = new int[10000];
		
		for (int i = 0; i < arr2.length - 1; i++)
		{
			int temp = (int) (Integer.MAX_VALUE * Math.random());
			arr1[i] = temp;
			arr2[i] = temp;
		}
		
		
		// Start of test one.
		System.out.println("Test one starting....");
		long startTime1 = System.currentTimeMillis();	      	  
	
		Main.selectionSort(arr1);
		
		long runTime1 = System.currentTimeMillis() - startTime1;
		System.out.println("Test one finished in " + runTime1 + " millisecond/s\n");
		// End of test one.
		
		
		
		// Start of test two.
		System.out.println("Test two starting....");
		long startTime2 = System.currentTimeMillis();
			      	  
		Arrays.sort(arr2);
		
		long runTime2 = System.currentTimeMillis() - startTime2;
		System.out.println("Test two finished in " + runTime2 + " millisecond/s");
		// End of test two.
	}
}
