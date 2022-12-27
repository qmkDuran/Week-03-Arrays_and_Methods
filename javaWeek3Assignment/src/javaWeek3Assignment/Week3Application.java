package javaWeek3Assignment;

public class Week3Application {

	static int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 1000 };
	static int total = 0;

	public static void main(String[] args) {
//		PART 1
		int subtractAges = ages[ages.length - 1] - ages[0];
		System.out.println("First and last ages subtracted in the array: " + subtractAges);

		for (int i = 0; i < ages.length; i++) {
			total = +ages[i];
		}

		int average = total / ages.length;
		System.out.println("Ages average: " + average);

//		PART 2
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int letterSum = 0;
		String listOfNames = "";

		for (int i = 0; i < names.length; i++) {
			letterSum = letterSum + names[i].length();
		}

		int letterAverage = letterSum / names.length;
		System.out.println("Letter average: " + letterAverage);

		for (int i = 0; i < names.length; i++) {
			listOfNames = listOfNames + names[i] + " ";
		}

		System.out.println("List of names: " + listOfNames);

//		PART 3
		int[] nameLengths = new int[6];
		int sumNameLengths = 0;

		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}

		for (int i = 0; i < nameLengths.length; i++) {
			sumNameLengths += nameLengths[i];
		}

		System.out.println("Average name lenght: " + sumNameLengths);

//		PART 4 

		String word = "Hello";
		int n = 3;
		String wordsCombined = firstMethod(word, n);
		System.out.println("Words combined: " + wordsCombined);

		String firstName = "Michael";
		String lastName = "Duran";
		String fullName = secondMethod(firstName, lastName);
		System.out.println("Full Name: " + fullName);

		int[] numbers = { 1, 1, 1, 1, 100 };
		boolean overOneHundred = thirdMethod(numbers);
		System.out.println("Over 100: " + overOneHundred);

		double[] numbersDecimals = { 2.1, 3.1, 4.1, 5.1, 6.1 };
		double decimalsAverage = fourthMethod(numbersDecimals);
		System.out.println("Avereage decimal: " + decimalsAverage);

		double[] numbersDecimalsOne = { 1.1, 1.1, 1.1, 1.1, 1.1 };
		double[] numbersDecimalsTwo = { 0.1, 0.1, 0.1, 0.1, 0.1 };
		boolean oneVsTwoDecimal = fifthMethod(numbersDecimalsOne, numbersDecimalsTwo);
		System.out.println("One is bigger than Two: " + oneVsTwoDecimal);
		
		boolean isHotOutside = true;
		double moneyInPocket = 11;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println("I can buy a drink: " + buyDrink);
		
		int myAge = 21;
		boolean canDrink = canIDrink(myAge);
		System.out.println("Old enough to drink: " + canDrink);

	}

//	PART 4 METHODS

	static String firstMethod(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}

	static String secondMethod(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	static boolean thirdMethod(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}

		if (sum > 100) {
			return true;
		} else
			return false;
	}

	static double fourthMethod(double[] numbersDecimals) {
		double sumDecimals = 0;
		for (double numbersDecimal : numbersDecimals) {
			sumDecimals += numbersDecimal;
		}

		return sumDecimals / numbersDecimals.length;
	}

	static boolean fifthMethod(double[] numbersDecimalsOne, double[] numbersDecimalsTwo) {
		double sumDecimalsOne = 0;
		for (double numbersDecimalOne : numbersDecimalsOne) {
			sumDecimalsOne += numbersDecimalOne;
		}

		double sumDecimalsTwo = 0;
		for (double numbersDecimalTwo : numbersDecimalsTwo) {
			sumDecimalsTwo += numbersDecimalTwo;
		}

		double averageTwo = sumDecimalsTwo / numbersDecimalsTwo.length;
		double averageOne = sumDecimalsOne / numbersDecimalsOne.length;

		if (averageOne > averageTwo) {
			return true;
		} else
			return false;

	}

	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else 
			return false;
	}
	
	
	/* My own method, I created a method to check if someone is old enough to drink. I created this 
	method because this was the first function I created in JavaScript. It brings back memories of my 
	first days coding in early 2021*/
	
	
	static boolean canIDrink(int myAge) {
		if (myAge >= 21) {
			return true;
		} else 
			return false;
	}

}
