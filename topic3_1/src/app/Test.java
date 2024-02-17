package app;

import java.lang.reflect.Array;
import java.util.Arrays;

//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place Activity 2 part 3 and Activity 3 part 1 Word Document

/**
 * This class represents a test scenario for the Person class, demonstrating object creation,
 * equality checks, copy constructor usage, and age comparisons.
 */
public class Test {

	
	/**
     * The main method where the test scenarios are executed.
     *
     * @param args Command-line arguments (not used in this example).
     */
	public static void main(String[] args) {
		
		//Create new Person Objects
		Person person1 = new Person("Justine", "Reha", 25);
		Person person2 = new Person("Briana", "Reha", 30);
		Person person3 = new Person("Mary", "Reha", 38); 
		Person person4= new Person("Mark", "Reha", 29); 
		//Test Object equality 
		if(person1 == person2)
			System.out.println("These persons are identical using ==");
		else 
			System.out.println("These persons are not identical using ==");
		
		//Test Object Equality
		if(person1.equals(person2))
			System.out.println("These persons are identical using equals()"); 
		else 
			System.out.println("These persons are not identical using equals()"); 
		
		// Test Copy Constructor
		if(person1.equals(person3))
			System.out.println("These copied person is identical using equals()"); 
		else 
			System.out.println("These copied person is not identical using equals()"); 
		
		
		// Make a Person walk and run 
		person1.run();
		System.out.println("Person 1 is running: " + person1.isRunning()); 
		person1.walk(); 
		System.out.println("Person 1 is running: "+ person1.isRunning()); 

		// Compare ages of the four people
        compareAges(person1, person2);
        compareAges(person2, person3);
        compareAges(person3, person4);
        compareAges(person1, person4);
    }

	/**
     * Helper method to compare ages of two persons and print the result.
     *
     * @param person1 The first person to compare.
     * @param person2 The second person to compare.
     */
		private static void compareAges(Person person1, Person person2) {
        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1.getFirstName() + " is younger than " + person2.getFirstName());
        } else if (result > 0) {
            System.out.println(person1.getFirstName() + " is older than " + person2.getFirstName());
        } else {
            System.out.println(person1.getFirstName() + " and " + person2.getFirstName() + " are the same age.");
        }
    }
}
