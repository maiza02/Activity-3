package base;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place  Activity 3 part 2 Word Document


/**
 * This class serves as a base class for shapes, implementing the ShapeInterface.
 */
public class ShapeBase implements ShapeInterface {
	
	/** Shape description*/
	protected String name; 
	protected int width, height; 
	
	
	/**
     * Constructs a ShapeBase with the specified name, width, and height.
     *
     * @param name   The name of the shape.
     * @param width  The width of the shape.
     * @param height The height of the shape.
     */
	public ShapeBase(String name, int width, int height) {
		
		this.name = name; 
		this.width = width; 
		this.height = height; 
	}
	
	
	  /**
     * Gets the name of the shape.
     *
     * @return The name of the shape.
     */
	public String getName() { 
		
		return this.name; 
	}

	
	/**
     * Calculates the area of the shape. This method is overridden in subclasses.
     *
     * @return The area of the shape.
     */
	@Override
	public int calculateArea() {

		return -1;
	}

}
