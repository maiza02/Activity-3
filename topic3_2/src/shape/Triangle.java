package shape;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place  Activity 3 part 2 Word Document

import base.ShapeBase;

/**
 * Represents a Triangle, a subclass of ShapeBase.
 */
public class Triangle extends ShapeBase {
	

    /**
     * Constructs a Triangle with the specified name, width, and height.
     *
     * @param name   The name of the triangle.
     * @param width  The width of the triangle.
     * @param height The height of the triangle.
     */
	public Triangle(String name, int width, int height) { 
		
		super(name, width, height); 
	}
	 
	
	  /**
     * Calculates the area of the triangle.
     *
     * @return The area of the triangle.
     */
	@Override
	public int calculateArea() { 
		
		return width * height/2; 
	}
	

}
