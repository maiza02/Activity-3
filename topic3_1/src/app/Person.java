package app;

import java.util.Objects;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place Activity 2 part 3 and Activity 3 part 1 Word Document


/**
 * Represents a person with first name, last name, and age.
 * Implements {@link PersonInterface} for walking, running functionality,
 * and {@link Comparable} for age-based comparisons.
 */
public class Person implements PersonInterface, Comparable<Person> {
	
	// Instance variables
	private String firstName = "Mark";
	private String lastName = "Reha"; 
	private int age;
	private boolean walking;
	private boolean running;

	  /**
     * Constructor with parameters for first name, last name, and age.
     *
     * @param firstName The first name of the person.
     * @param lastName  The last name of the person.
     * @param age       The age of the person.
     */
	public Person(String firstName, String lastName, int age) {
		
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.age = age; 
	}

	 /**
     * Constructs a person by copying the information from another person.
     *
     * @param person The person to copy information from.
     */
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName(); 
		 this.age = person.getAge();
	}
	

	 /**
     * Gets the first name of the person.
     *
     * @return The first name of the person.
     */
	public String getFirstName() {
		
		return firstName; 
	}
	
	
	 /**
     * Gets the last name of the person.
     *
     * @return The last name of the person.
     */
	public String getLastName() {
		
		return lastName; 
	}
	
	/**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
	 public int getAge() {
	        return age;
	    }

	 
	 /**
	     * Compares this person to another based on first name, last name, and age.
	     *
	     * @param other The other person to compare with.
	     * @return True if the persons are equal, false otherwise.
	     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Person person = (Person) other;
        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName) && this.age == person.age;
    }
    

    /**
     * Generates a hash code for this person based on first name, last name, and age.
     *
     * @return The hash code for this person.
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    
    /**
     * Returns a string representation of this person.
     *
     * @return A string representation of this person.
     */
    @Override
    public String toString() {
        return "My Class is " + getClass().getName() + " " + this.firstName + " " + this.lastName + " Age: " + this.age;
    }


    /**
     * Makes the person walk.
     */
	@Override
	public void walk() {
		System.out.println("I am walking"); 
		running = false; 
		
	}

	
	/**
     * Makes the person run.
     */
	@Override
	public void run() {
		System.out.println("I am running"); 
		running = true;
	}

	
	/**
     * Checks if the person is running.
     *
     * @return True if the person is running, false otherwise.
     */
	@Override
	public boolean isRunning() {

		return running;
	}

	/**
     * Compares this person to another person based on age.
     *
     * @param p The person to compare to.
     * @return A negative integer if this person is younger,
     *         a positive integer if older, and 0 if the same age.
     */
	@Override
	public int compareTo(Person p) {
		 // Compare persons based on age
        return Integer.compare(this.age, p.age);
		}
	
	}
	




