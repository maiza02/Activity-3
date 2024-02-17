package test;
//Maiza Falcon Rojas
//CST-239
//02/13/2024
//I used source code from the following place  Activity 3 part 2 Word Document
import base.ShapeBase;
import shape.Circle;
import shape.Oval;
import shape.Rectangle;
import shape.Triangle;


/**
 * This class contains a main method to test various shapes and display their areas.
 */
public class Test {
	
	 /**
     * Displays the area of a given shape.
     *
     * @param shape The shape to display the area for.
     */
	private static void displayArea(ShapeBase shape) {
		
		System.out.println("This is a shape named " + shape.getName() + " with an area of " + shape.calculateArea()); 
				
	}

	 /**
     * The main method where the test scenarios are executed.
     *
     * @param args Command-line arguments (not used in this example).
     */
	public static void main(String[] args) {
		
		// Create an array of Base Shape and initialize to specific Shape 
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Rectangle("Rectangle", 10, 200); 
		shapes[1] = new Triangle("Triangle", 10, 50); 
		shapes[2] = new Circle("circle", 20); 
		shapes[3] = new Oval("Oval", 8,12);
		
		// For all Shapes display its area 
		for(int x=0;x < shapes.length;++x) {
			
			displayArea(shapes[x]); 
		}
		

	}

}
