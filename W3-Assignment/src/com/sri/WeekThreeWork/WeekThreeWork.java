package com.sri.WeekThreeWork;

public class WeekThreeWork {

	public static void main(String[] args) {
		
		// Week 3 Assignment - Arrays, Methods and more ...
		
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** Week 3 Coding Assignment - Array, Methods & More                            *** ***");
		System.out.println("*** Student: SRI SRINIVASAN                                                     *** ***");
		System.out.println("***                                                                             *** ***");
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();		
		
	
		int result = 0;
		int firstNum = 0;
		int currentNum = 0;

		double ageSum = 0;
		double ageAverage = 0.00d;
		
		int[] ages = new int[8]; //defines the integer array with 8 given numbers
		
		//int agesElements;
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		// Following section shows that the array has been built
		
		System.out.println("*** *** *** Results for Item 1 of Week 3 Coding Assignment.");
		System.out.println();
		System.out.print("Array ages now contains: ");
		for (int i = 0; i < ages.length; i++) {
			//agesElements = ages[i];
			if (i == (ages.length - 1)) {
				System.out.print(ages[i]);
			}	else System.out.print(ages[i] + ", ");
		}
		System.out.println();
		System.out.println("***************************************************************************");
		System.out.println();
		
		//Finding the difference between last number and first number
		
		int firstNumInAges = ages[0];
		int lastNumInAges = ages[(ages.length -1)];
		int diffBetLastAndFirst = lastNumInAges - firstNumInAges;
		
		System.out.println("*** *** *** Results for Item 1.a of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The first number in the ages array is: " + firstNumInAges);
		System.out.println("The last number in the ages array is: " + lastNumInAges);
		System.out.println();
		System.out.println("The difference between the last and first number is: " + diffBetLastAndFirst);
		System.out.println();
		System.out.println("***************************************************************************");
		System.out.println();
		
		
		//  Adding a new element to the previous array and run the same logic to 
		//get the difference between the last and first number
		
		int newAges[] = new int[9];
		
		newAges[0] = 3;
		newAges[1] = 9;
		newAges[2] = 23;
		newAges[3] = 64;
		newAges[4] = 2;
		newAges[5] = 8;
		newAges[6] = 28;
		newAges[7] = 93;
		newAges[8] = 2;
		
		int firstNumInNewAges = newAges[0];
		int lastNumInNewAges = newAges[(newAges.length -1)];
		int newDiffBetLastAndFirst = lastNumInNewAges - firstNumInNewAges;
		
		System.out.println("*** *** *** Results for Item 1.b of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The first number in the ages array is: " + firstNumInNewAges);
		System.out.println("The last number in the ages array is: " + lastNumInNewAges);
		System.out.println();
		System.out.println("The NEW difference between the last and first number is: " + newDiffBetLastAndFirst);
		System.out.println();
		System.out.println("***************************************************************************");
		System.out.println();
		
		// Using a loop to calculate the average of all numbers in ages array
		
		
		
		
		for (int i = 0; i < ages.length; i++){
										
					ageSum = ageSum + ages[i];
					
					}
					
					ageAverage = (ageSum / ages.length); 
					System.out.println("*** *** *** Results for Item 1.c of Week 3 Coding Assignment.");
					System.out.println();
					System.out.println("The average of all the numbers in ages array is: " + ageAverage);
					System.out.println("***************************************************************************");
					System.out.println();
		
		// -->Item 2 of assignment.
		// Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		// --> Item 2.a of assignment
		// Next, loop through the names array and calculate the average number of letters per name
		// --> Item 2.b 0f assignment
		//Loop through the array again and concatenate name separated by spaces 
	
		String[] names = new String[6];
		String currentName;
		
		double letterCount = 0;
		double averageLetterPerName = 0;
		double letterCountPerWord = 0;
		int k = 0;
	
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		System.out.println("*** *** *** Results for Item 2.a of Week 3 Coding Assignment.");
		System.out.println();
	
		//using a for loop in an array to calculate average number of letters per name.
		letterCountPerWord = names.length;
		int[] nameLengths = new int[6];  //defining array of int to be populated

		System.out.println("Number of Entries in Array: " +letterCountPerWord);
		for (int i = 0; i < names.length; i++) {
			currentName = names[i];
			k = currentName.length();
			nameLengths[i] = k;

			System.out.println(currentName + " has " + k + " letters.");
			System.out.println("Also, adding int " + nameLengths[i] + " to the new integer array");

	        letterCount = letterCount + k;
	        System.out.println("*** *** *** *** *** *** ***");
	            
		}
		averageLetterPerName = letterCount / letterCountPerWord; //calculates average
		
		System.out.println("Total number of letters is: " + letterCount);
		System.out.println("The average number of letters per word is: " + averageLetterPerName);
		System.out.println("***************************************************************************");
		System.out.println();

		
		// Concatenating the names in the array
		
		String concatName = "";
		for (int i = 0; i <names.length; i++) {
			currentName = names[i];
			if (i == 0) {
				concatName = currentName;
			} else {
				concatName = (concatName + " " +currentName);
			}
			
		}
		System.out.println("*** *** *** Results for Item 2.b of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The concatenated result of the names in the array: ");
		System.out.println(concatName);
		System.out.println("***************************************************************************");
		System.out.println();
		
		
		// Item 3 of assignment
		// How do you find the last element of the array?
		
		// Item 4 of assignment
		// How do you find the first element of the array?
		
		String lastNameInArray = names[names.length-1];		//fetch last element in array
		String firstNameInArray = names[0];					//fetch first element in array
		
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		System.out.println("*** *** *** Results for Item 3 of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The last element in the names array is: " + lastNameInArray);
		System.out.println("***************************************************************************");
		System.out.println();
		System.out.println("*** *** *** Results for Item 4 of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The first element in the names array is: " + firstNameInArray);
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		
		//    Item 5 in assignment - int array nameLengths
		
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		System.out.println("*** *** *** Results for Item 5 of Week 3 Coding Assignment.");
		System.out.println();

		for (int j = 0; j < nameLengths.length; j++) {
			System.out.println("Adding "  + nameLengths[j] + " as the letter count for " + names[j] + " to the nameLengths array");
		}
		
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();


		// Item # 6 of Asssignment.
		// total all numbers in newly created int array nameLengths
		
		int sumNameLengths = 0;
		for (int i = 0; i <nameLengths.length; i++) {
			currentNum = nameLengths[i];
			if (i == 0) {
				sumNameLengths = currentNum;
			} else {
				sumNameLengths = (sumNameLengths + currentNum);
			}
			
		}

		System.out.println("*** *** *** Results for Item 6 of Week 3 Coding Assignment.");
		System.out.println();

		System.out.print("Array nameLengths now contains: ");
		for (int i = 0; i < nameLengths.length; i++) {
			if (i == (nameLengths.length - 1)) {
				System.out.print(nameLengths[i]);
			}	else System.out.print(nameLengths[i] + ", ");
		}

		System.out.println();
		System.out.println("The sum of all the numbers in the nameLengths array is: " + sumNameLengths);
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		
		// Item 7 of Assignment
		// A method takes in String (word) and int (n); returns word concatenated n times
		
		String word = "Location";
		int n = 3;
		String concatWord = strConcat(word, n);
		
		System.out.println("*** *** *** Results for Item 7 of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The result of concatenating word 'n' times is:");
		System.out.println(concatWord);
		System.out.println("*** *** *** *** *** *** ***");
		System.out.println();
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		// Item 8 of Assignment
		// A method takes 2 strings and concatenates with a space in between
		
		String firstName = "Sri";
		String lastName = "Srinivasan";
		
		String fullName = concatNames(firstName, lastName);

		System.out.println("*** *** *** Results for Item 8 of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The result of concatenating the two strings: ");
		System.out.println(fullName);

		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		
		
		// Item 9 of Assignment
		// A method takes an array of int and returns true if sum of ints > 100
		
		int[] intArray = {10, 20, 30, 50};
		boolean intArrayFlag = sumCalc(intArray);
		
		System.out.println("The value returned by the method is: " + intArrayFlag);

		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();

		// Item 10 of Assignment
		// A method takes an array of double and returns the average of all the elements
		
		double[] dblArray = {5.1, 6.2, 7.3, 8.4};
		
		double averageOfArray = calcAverageArray(dblArray);
		
		System.out.println("*** *** *** Results for Item 10 of Week 3 Coding Assignment.");
		System.out.println();
		System.out.println("The average of elements in the double array is: " + averageOfArray);

		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();

		// Item 11 of Assignment
		// A method takes an two arrays of double and returns true if: 
		// the average of elements in 1st array is greater than average of elements in 2nd array
		
        double[] firstArray = {5.1, 5.2, 3.0, 4.0};
        double[] secondArray = {4.1, 4.2, 4.3, 4.4};
       
        boolean avgArraysCompare = avgCalc(firstArray, secondArray);
        
        System.out.println("The result of the compare is: " + avgArraysCompare);
		if (avgArraysCompare) {
			System.out.println("The average of the first double array is greater than the second array.");
		}	else {
			System.out.println("The average of the second double array is greater than the first array.");
		}
 
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();
		
		
		// Item 12 of Assignment
		// A method to determine willBuyDrink based on boolean isHotOutside and 
		// moneyInPocket > 10.50
		
		boolean isHotOutside = true;
		double moneyInPocket = 1.50;
		
		boolean doIBuy = willBuyDrink(isHotOutside, moneyInPocket);
		
		if (doIBuy)	{
			System.out.println("Time to go and enjoy a drink!");
		}	else {
			System.out.println("You cannot buy a drink now!");
		}
		System.out.println("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
		System.out.println();

		// Item 13 of Assignment
		// Method calls for temperature conversion (celsius to farenheit)
		// and distance unit conversion from kilometers to miles)
		//
		// story line - As I travel to Europe and Asia I am often faced with units that I am not used to 
		// especially the temperature and distance readings.  I find myself converting them to get a 
		// better perspective of the values.
		
	      double celTemp = 33;		//temperature in Celsius
	      double kmDistance = 842;	//distance in kilometers
	      
	      double farenTemp = convTemp(celTemp); //desired result in farenheit using method
	      double mileDistance = convDistance(kmDistance); //desired result in miles using method
	      
	     // String concatWord = strConcat(word, n);
	      
	      // System.out.println(concatWord);
	      
	      System.out.println("*** *** *** Results for Item 13 of Week 3 Coding Assignment.");
	      System.out.println();
	      System.out.println(celTemp + " degrees in Celsius converts to " + farenTemp + " in Farenheit");
	      System.out.println();
	      System.out.println(kmDistance + " in Kilometers converts to " + mileDistance + " in Miles");
	      System.out.println("**********************************************************************");
	     


		
	}
		 
		
	   public static double convTemp(double n1) {
		      double convValue;
		      
		      convValue = (n1 * 9 / 5) + 32;	//applies the conversion formula celsius to farenheit

		      return convValue; //returns value in farenheit to calling entity
		   }
		   
		   /** returns the mile value */
		   public static double convDistance(double n1) {
		      double convValue;
		      
		      convValue = (n1 * 5 / 8);		//applies the conversion formula kilometers to miles

		      return convValue; 	//returns value in miles to calling entity
		   }

	
	
	
		private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// method to determine if conditions warrant buying a drink
			
			System.out.println("*** *** *** Results for Item 12 of Week 3 Coding Assignment.");
			System.out.println();
			boolean result;
			if (isHotOutside)	{
				System.out.println("It is hot outside.");
				if (moneyInPocket > 10.50)	{
					System.out.println("There is enough money to buy a drink.");
					result = true;
				}	else {
					System.out.println("There is not enough money to buy a drink.");
					result = false;
				}
								
			}	else	{
				System.out.println("It is not hot outside.");
				result = false;
				if (moneyInPocket > 10.50)	{
					System.out.println("Even though there is enough money to buy a drink.");
				}	else {
					System.out.println("There is not enough money to buy a drink.");
				}
				
			}
		return result;
	}

		private static boolean avgCalc(double[] firstArray, double[] secondArray) {
		// Calculates averages for two arrays and determines which one is greater
			double firstArrayTotal = 0;
			double firstArrayAverage = 0;
			double secondArrayTotal = 0;
			double secondArrayAverage = 0;
			boolean result;
			
			for (int i = 0; i < firstArray.length; i++)	{
				
				firstArrayTotal = firstArrayTotal + firstArray[i];
				if (i ==  (firstArray.length - 1))	{
					firstArrayAverage = firstArrayTotal / firstArray.length;
				}
				
			}
			
			for (int j = 0; j < secondArray.length; j++)	{
				
				secondArrayTotal = secondArrayTotal + secondArray[j];
				if (j ==  (secondArray.length - 1))	{
					secondArrayAverage = secondArrayTotal / secondArray.length;
				}
				
			}
			
			System.out.println("*** *** *** Results for Item 11 of Week 3 Coding Assignment.");
			System.out.println();
			System.out.println("Average of 1st array is: " + firstArrayAverage);
			System.out.println("Average of 2nd array is: " + secondArrayAverage);

			if (firstArrayAverage > secondArrayAverage)	{
				result = true;
			} else {
				result = false;
			}
			return result;
	}

		private static double calcAverageArray(double[] dblArray) {
		// Calculates the average of a single double array
			
			double arrayTotal = 0;
			double arrayAverage = 0;
			
			for (int i = 0; i < dblArray.length; i++)	{
				
				arrayTotal = arrayTotal + dblArray[i];
				if (i == (dblArray.length - 1)) {
					arrayAverage = arrayTotal / (dblArray.length);
				}
				
			}
			
			return arrayAverage;
	}

		private static boolean sumCalc(int[] intArray) {
		// TODO Auto-generated method stub
			 int intArrayTotal = 0;
			 boolean intFlag = false;
			 
			  for (int k = 0; k < intArray.length; k++) {
				  
				  intArrayTotal = intArrayTotal + intArray[k];
				  
				  if (intArrayTotal > 100) {
					  intFlag = true;
				  }	else {
					  intFlag = false;
				  }
			  }
				System.out.println("*** *** *** Results for Item 9 of Week 3 Coding Assignment.");
				System.out.println();
				System.out.println("The sum of all the ints in the array is: " + intArrayTotal);
			  return intFlag;
	}

		private static String concatNames(String firstName, String lastName) {
		
			String result = firstName.concat(" ").concat(lastName);
						
		return result;
	}

		// Item 7 of Assignment
		// A method takes in String (word) and int (n); returns word concatenated n times
	
	   public static String strConcat(String word, int n) {
		// TODO Auto-generated method stub
		   
		   String result = "";
		   		   
		   for (int p = 0; p < n; p++)	{
			   result = result + word;   
		   }
		return result;
	   

	 }		
}
	 
