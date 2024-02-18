package shape;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place  Activity 3 part 2 Word Document
import base.ShapeBase;



/**
 * Represents a Rectangle, a subclass of ShapeBase.
 */
public class Rectangle extends ShapeBase {
	
	
	/**
     * Constructs a Rectangle with the specified name, width, and height.
     *
     * @param name   The name of the rectangle.
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
	public Rectangle(String name, int width, int height) {
		
		super(name, width, height); 
	}

	/**
     * Calculates the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
	@Override 
	public int calculateArea() {
		
		return width * height; 
	}
}
