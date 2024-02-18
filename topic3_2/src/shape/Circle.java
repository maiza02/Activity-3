package shape;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place  Activity 3 part 2 Word Document

import base.ShapeBase;


/**
 * Represents a Circle, a subclass of ShapeBase.
 */
public class Circle extends ShapeBase {

	
	 /**
     * Constructs a Circle with the specified name and radius.
     *
     * @param name   The name of the circle.
     * @param radius The radius of the circle.
     */
	 public Circle(String name, int radius) {
	        super(name, radius, radius);
	    }

	 
	  	/**
	     * Calculates the area of the circle.
	     *
	     * @return The area of the circle.
	     */
	    @Override
	    public int calculateArea() {
	        return (int) (Math.PI * Math.pow(width / 2, 2));  // Area of a circle
	    }
}