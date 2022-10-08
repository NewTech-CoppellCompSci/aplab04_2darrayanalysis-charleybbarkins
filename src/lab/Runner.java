package lab;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		//creates a new scanner 
		Scanner inKey = new Scanner(System.in);
		
		//
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		//creates arr1 with using create random method
		int[][] arr1 = ArrayAnalysis.createRandom(6, 3, -2, 10);
		
		//creates arr2 with the create random method 
		int[][] arr3 = ArrayAnalysis.createRandom(6, 3, -2, 10);
		
		//prompts user to input parameters to make new 2D array
		System.out.println("Input parameters for new 2D Array:\nHow many columns should your Array have?");
		
		//asks user for column input
		int column = inKey.nextInt();
		
		//WHILE input is less than 4 or greater than 20 keep asking user to redo
		while (column < 3 || column > 21 ) {
			System.out.println("Bad input\nTry again with a number greater than 3 or less than 21");
		 column = inKey.nextInt();
		
		}
		
		//get # of rows from input 
		System.out.println("\nHow many rows should your Array have?");
		
		
		int row = inKey.nextInt();
		
		//WHILE input is less than 4 or greater than 20 keep asking for another input 
		while (row < 3 || row > 21 ) {
			System.out.println("Bad input\nTry again with a number greater than 3 or less than 21");
		 row = inKey.nextInt();
		
		}
		
		//ask user for minimum for random number creater
		System.out.println("\nWhat is the minimum random numbers can be in your Array?");
		
		int min = inKey.nextInt();
		
		//WHILE minimum is a three digit number or greater keep asking user to inout a better input 
		while (min > 99 || min < -99 ) {
			System.out.println("Bad input\nTry again with a two digit number");
		 min = inKey.nextInt();
		
		}
		
		//find max value in random numbers
		System.out.println("\nWhat is the max value numbers can be in your Array?");
		
		//WHILE max is a three digit number keep asking user to different input 
		int max = inKey.nextInt();	
		while (max > 99 || max < -99 ) {
			System.out.println("Bad input\nTry again with a two digit number");
		 max = inKey.nextInt();
		
		}
		
		
		//create arr2 using all the user inputs
		int[][] arr2 = ArrayAnalysis.createRandom(row, column, min, max);
		
		
		//print all of the above arrays created
		System.out.println("\n-------------------");
		System.out.println("Your Arrays:\nARRAY ONE");
		ArrayAnalysis.printArray(arr1);
		System.out.println("\nARRAY TWO");
		ArrayAnalysis.printArray(arr2);
		System.out.println("\nARRAY THREE");
		ArrayAnalysis.printArray(arr3);
		System.out.println("\n-------------------");
		
		
		//find the sum of arr1 using sumTotal method 
		System.out.print("\nSum of all numbers in Array 1: ");
		System.out.println(ArrayAnalysis.sumTotal(arr1));
		
		//find the sum of arr2 using sumTotal method 
		System.out.print("\nSum of all numbers in Array 2: ");
		System.out.println(ArrayAnalysis.sumTotal(arr2));
		
		//find the sum of arr3 using sumTotal method 
		System.out.print("\nSum of all numbers in Array 3: ");
		System.out.println(ArrayAnalysis.sumTotal(arr3));
		
		////////////////////////////////////////////
		
		//find the average of all numbers in arr1 using the average method
		System.out.print("\nAverage of numbers in Array One: ");
		System.out.println(ArrayAnalysis.average(arr1));
		
		//find the average of all numbers in arr2 using the average method
		System.out.print("\nAverage of numbers in Array Two: ");
		System.out.println(ArrayAnalysis.average(arr2));
		
		//find the average of all numbers in arr3 using the average method
		System.out.print("\nAverage of numbers in Array Three: ");
		System.out.println(ArrayAnalysis.average(arr3));
		///////////////////////////////////
		
		//find the samllest number present in array 1 using findMin method
		System.out.print("\nThe smallest number in Array One: ");
		System.out.println(ArrayAnalysis.findMin(arr1));
		
		//find the smallest number present in arr2 using findMin method
		System.out.print("\nThe smallest number in Array Two: ");
		System.out.println(ArrayAnalysis.findMin(arr2));
		
		//find the smallest number present in array 3 using findMin method
		System.out.print("\nThe smallest number in Array Three: ");
		System.out.println(ArrayAnalysis.findMin(arr3));
		
		/////////////////////////////////////////
		
		//find the biggest number present in arr1 using findMax method
		System.out.print("\nThe biggest number in Array One: ");
		System.out.println(ArrayAnalysis.findMax(arr1));
		
		//find the biggest number present in arr2 using findMax method
		System.out.print("\nThe biggest number in Array Two: ");
		System.out.println(ArrayAnalysis.findMax(arr2));
		
		//find the biggest number present in arr3 using findMax method
		System.out.print("\nThe biggest number in Array Three: ");
		System.out.println(ArrayAnalysis.findMax(arr3));
		
		////////////////////////////////
		
		//using diffArrays method, print out the difference between  arr1 and arr3 (if not equal returns null)
		System.out.println("\nThe difference between Array 1 and Array 3: ");
		ArrayAnalysis.printArray(ArrayAnalysis.diffArrays(arr1, arr3));
		
		System.out.println();
		
		//prompt user for how many rows to move arr2 down by 
		System.out.println("How many rows would you like Array 2 to be moved down by?");
		
		//save user input
		int diff = inKey.nextInt();
		System.out.println();
		System.out.println("Array 2 moved down by " + diff + " rows:");
		//Use TransposeRow method to move array rows down by user input
		ArrayAnalysis.printArray(ArrayAnalysis.transposeRow(arr2, diff));
		
		
		
		System.out.println("\n-------------------\n3D ARRAY");
		
		//create a new3D array 
		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			
			//set indexes to random numbers
			arr3D[i] = ArrayAnalysis.createRandom(2, 2, -40, 40);
		}
		int x = 1;
		
		//print the 3D array
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			ArrayAnalysis.printArray(arr);
			x++;
		}
		System.out.println("\n-------------------");
		
		
		//show the sum of all numbers in the 3D array using the sum3D method 
		System.out.print("\nSum of all numbers in 3D Array: ");
		System.out.println(ArrayAnalysis.sum3D(arr3D));
		
		//show the average of all numbers in 3D array using average3D method
		System.out.print("\nAverage of numbers in 3D Array: ");
		System.out.println(ArrayAnalysis.average3D(arr3D));
		
		
	}
	
	
	
	
	
	
	
}
