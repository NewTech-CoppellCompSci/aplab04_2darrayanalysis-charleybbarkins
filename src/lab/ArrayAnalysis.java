package lab;


/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		
		//create a new array using parameters (user input)
		int[][] arr = new int[row][column];
		
		//while i is less than length..
		for (int i = 0; i < arr.length; i++) {  //cycle through all the rows
			for (int j = 0; j < arr[i].length; j++) {  //cycle through all the columns on a given row
				
				int scope = max - min + 1;
				
				//set array to random numbers within the parameters given 
				arr[i][j] =  (int) (Math.random() * scope + min);  //setting the elements in the array
				
			}
		}
		
		//return full array 
		return arr;
	}
	
	
	
	//#2
	public static void printArray(int[][] arr)  {
		
		
		for (int i = 0; i < arr.length; i++) { //cycle though all rows 
			for (int j = 0; j < arr[i].length; j++) { //cycle through all columns
				
				//print array at every index
				System.out.print(arr[i][j] + " ");
				
			}
			//start new line to seperate all the arrays 
			System.out.println();
			
		}
		
		
	        
    }
	
	
	
	
	//#3
	public static int sumTotal(int[][] arr) {
		
		//holder to keep sums 
		int sum = 0;
		
		//copy array rows onto int[] one 
		for(int[] one: arr) {
			
			//copy columns from int[][] one onto int two
			for (int two : one) {
				
				//add index two is at to sum counter
				sum += two;
				
			}
			
		}
		
		//return sum of all numbers in array 
		return sum;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		//calcuate the average using formula given (sum of array / # of #'s in array)
		double av = (sumTotal(arr))/(arr.length * arr[0].length);
		
		
		//return the  average of all the numbers in array 
		return av;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		
		//set min to largest possible number
		int min = Integer.MAX_VALUE;
		
		//while i is less than array length...
		for (int i = 0; i < arr.length; i++) { //goes through all rows
			for (int j = 0; j < arr[i].length; j++) { //goes thorugh all columns
				
				//if index is less than current number that is stored in min, replace min with taht number
				//stores smallest number in array 
				min = Math.min(min, arr[i][j]);
				
			}
		
			
		}
		
		//return smallest number in array 
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		
		//set max to smallest possible value 
		int max = Integer.MIN_VALUE;
		

		for (int i = 0; i < arr.length; i++) { //cylce through all rows
			for (int j = 0; j < arr[i].length; j++) { //cycle though all columns
				
				//if number at index is bigger than number stored in max, replace max
				//finds biggest number in array 
				max = Math.max(max, arr[i][j]);
				
			}
			
		}
		
		//return biggest number in array 
		return max;
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		
		
		//if arrays are not the smae length return null and end loop 
		if (arr1.length != arr2.length) {
			
			return null;
			
			//if they are the same length,
		}else {
			
			//create a new empty array with the same lengths as the compared arrays 
			int[][] diff = new int[arr1.length][arr1[0].length];
			
			for (int i = 0; i < arr1.length; i++) {  //cycle through all the rows
				for (int j = 0; j < arr1[i].length; j++) {  //cycle through all the columns on a given row
					
					//set diff index to store the difference between arr1 and arr2 at the same index
					diff[i][j] =  Math.abs(arr1[i][j] - arr2[i][j]); 
					
					
				}
				
			}
			
			//return diff (holding the differneces between arr1 and arr2 now)
			return diff;
		}
		
		
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		
		//keeps count of how many times array is transposed
		int counter = 0;
		
		// while the loop has not repeated the same amount of times as dist,...
		while (counter != dist) {
		
		/////////////////////////////
			//create a new array that matches arr1's length 
		int[][] diff = new int[arr1.length][arr1[0].length];
		
		//copy arr1 to diff
		for (int i = 0; i < diff.length; i++) {  //cycle through all the rows
			for (int j = 0; j < diff[i].length; j++) {  //cycle through all the columns on a given row
				
				
				diff[i][j] =  arr1[i][j];  //set array diff to be the same as arr1
				
			}
		}
		//////////////////////////////////
	
	
		for (int i = 0; i < arr1.length;i++ ) { //go through every row
			
			//store last row of array into int[] last
			int[] last = diff[arr1.length-1];
			
			//keep count of how many times loop j has ran 
			int count = 0;
			for (int j = i + 1; j < arr1.length && count == 0; count++) { //goes though the row ahead of current row
				
			//if at the last row ...
				if (j == arr1.length-1) {
					
					//set last row to equal previous row 
					arr1[j]= arr1[j-1];
					
					//set the first row to equal last row 
					arr1[0] = last;
					
				}else {
					//create  holder for row
					int[] holder;
					
					// set holder equal to row at i 
					 holder = diff[i];
					 
					 //set j to holder (move the array down one)
                    arr1[j] = holder;
                    
                  
				}
				
				//store  last row in diff in int[] last
				last = arr1[diff.length-1];
				//set the last row in arr1 equal to the 2nd last row in diff (moves array down 1)
				arr1[arr1.length-1] = diff[diff.length-2];
			}
			
			
		
		}
		
		//add one to counter, continue loop until counter is equal to dist 
		counter ++;
		}
		
		//return transposed array
		return arr1;
	}
	
	
	//#9
	public static int sum3D(int[][][] arr) {
		
		//holds sum of numbers
		int sum = 0;
		
		for (int[][] one : arr){ //set int [][] one equal to arr
			
			//use sumtotal method to find the sum of array rows  and add it to sum 
			sum +=sumTotal(one);
			
		}
		
		//return sum of 3D array 
		return sum;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		
		//use given fromula to find average of 3D array
		// (total of all numbers from sum3d method / 3D array length)
		double av = (sum3D(arr))/(arr.length * arr[0].length * arr[0][0].length );
		
		//return average
		return av;
	}
	
	
	
	
	
	
}
