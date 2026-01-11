package week4;

public class week4homework {
	 public static void main(String[] args) {
	        // 1. Create an array of int called ages
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	        
	        // 1a. Subtract first element from last element programmatically
	        int result1a = ages[ages.length - 1] - ages[0];
	        System.out.println("1a. Result: " + result1a);
	        
	        // 1b. Create ages2 with 9 elements
	        int[] ages2 = {5, 12, 18, 25, 30, 45, 50, 60, 75};
	        
	        // 1b.ii. Repeat subtraction with ages2
	        int result1b = ages2[ages2.length - 1] - ages2[0];
	        System.out.println("1b. Result: " + result1b);
	        
	        // 1c. Calculate average age using a loop
	        int sum = 0;
	        for (int i = 0; i < ages.length; i++) {
	            sum += ages[i];
	        }
	        double averageAge = (double) sum / ages.length;
	        System.out.println("1c. Average age: " + averageAge);
	        
	        // 2. Create an array of String called names
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	        
	        // 2a. Calculate average number of letters per name
	        int totalLetters = 0;
	        for (int i = 0; i < names.length; i++) {
	            totalLetters += names[i].length();
	        }
	        double averageLetters = (double) totalLetters / names.length;
	        System.out.println("2a. Average letters per name: " + averageLetters);
	        
	        // 2b. Concatenate all names separated by spaces
	        String concatenatedNames = "";
	        for (int i = 0; i < names.length; i++) {
	            concatenatedNames += names[i];
	            if (i < names.length - 1) {
	                concatenatedNames += " ";
	            }
	        }
	        System.out.println("2b. Concatenated names: " + concatenatedNames);
	        
	        // 3. How do you access the last element of any array?
	        System.out.println("3. Access last element: array[array.length - 1]");
	        
	        // 4. How do you access the first element of any array?
	        System.out.println("4. Access first element: array[0]");
	        
	        // 5. Create nameLengths array and populate with name lengths
	        int[] nameLengths = new int[names.length];
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }
	        
	        // 6. Calculate sum of all elements in nameLengths
	        int sumLengths = 0;
	        for (int i = 0; i < nameLengths.length; i++) {
	            sumLengths += nameLengths[i];
	        }
	        System.out.println("6. Sum of name lengths: " + sumLengths);
	        
	        // 7. Test concatenate method
	        System.out.println("7. " + concatenateWord("Hello", 3));
	        
	        // 8. Test full name method
	        System.out.println("8. " + getFullName("John", "Doe"));
	        
	        // 9. Test sum greater than 100 method
	        System.out.println("9. " + isSumGreaterThan100(ages));
	        
	        // 10. Test average method
	        double[] numbers = {5.5, 10.2, 15.8, 20.1};
	        System.out.println("10. Average: " + getAverage(numbers));
	        
	        // 11. Test compare averages method
	        double[] array1 = {10.0, 20.0, 30.0};
	        double[] array2 = {5.0, 10.0, 15.0};
	        System.out.println("11. First average greater: " + isFirstAverageGreater(array1, array2));
	        
	        // 12. Test willBuyDrink method
	        System.out.println("12. Will buy drink: " + willBuyDrink(true, 12.00));
	        
	        // 13. Average weapon values
	        double[] weaponNumbers = {5.9, 10.2, 3.0, 59.7};
	        System.out.println("13. The average weapon value of exampleWeapon across all plugins is: " + getAverageWeaponValue(weaponNumbers));
	    }
	    
	    // 7. Method that concatenates a word to itself n times
	    public static String concatenateWord(String word, int n) {
	        String result = "";
	        for (int i = 0; i < n; i++) {
	            result += word;
	        }
	        return result;
	    }
	    
	    // 8. Method that returns full name
	    public static String getFullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }
	    
	    // 9. Method that returns true if sum of array is greater than 100
	    public static boolean isSumGreaterThan100(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	        return sum > 100;
	    }
	    
	    // 10. Method that returns average of double array
	    public static double getAverage(double[] array) {
	        double sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	        return sum / array.length;
	    }
	    
	    // 11. Method that compares averages of two arrays
	    public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
	        double avg1 = getAverage(array1);
	        double avg2 = getAverage(array2);
	        return avg1 > avg2;
	    }
	    
	    // 12. Method willBuyDrink
	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }
	    // 13. Finds the average value of a list of weapon damage values from several different plugins, as represented by an array. G
	    public static double getAverageWeaponValue(double[] array) {
	        double sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	        return sum / array.length;
	    }
	    
}
