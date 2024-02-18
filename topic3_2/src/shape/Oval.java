package shape;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place  Activity 3 part 2 Word Document
import base.ShapeBase;


/**
 * Represents an Oval, a subclass of ShapeBase.
 */
public class Oval extends ShapeBase {
	
	
	 /**
     * Constructs an Oval with the specified name, semi-major axis, and semi-minor axis.
     *
     * @param name           The name of the oval.
     * @param semiMajorAxis  The semi-major axis of the oval.
     * @param semiMinorAxis  The semi-minor axis of the oval.
     */
	public Oval(String name, int semiMajorAxis, int semiMinorAxis) {
        super(name, semiMajorAxis, semiMinorAxis);
    }

	
	 /**
     * Calculates the area of the oval.
     *
     * @return The area of the oval.
     */
    @Override
    public int calculateArea() {
        return (int) (Math.PI * width * height);  
    }
}


