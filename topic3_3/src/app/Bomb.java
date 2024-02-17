package app;
//Maiza Falcon Rojas
//CST-239
//02/14/2024
//I used source code from the following place  Activity 3 part 3 Word Document

/**
 * Represents a Bomb, implementing the WeaponInterface.
 */
public class Bomb implements WeaponInterface {

	

    /**
     * Fires the bomb with a specified power.
     *
     * @param power The power with which to fire the bomb.
     */
	public void fireWeapon(int power) {
		
		System.out.println("In Bomb.fireWeapon() with a power of " + power); 
	}
	
	  /**
     * Fires the bomb with a default power.
     */
	public void fireWeapon() {
		
		System.out.println("In Bomb.fireWeapon()"); 
	}

	
	/**
     * Activates or deactivates the bomb.
     *
     * @param enable True to activate, false to deactivate.
     */
	@Override
	public void activate(boolean enable) {
	
		System.out.println("In the Bomb.activate() with an enable of " + enable); 
	}
} 
