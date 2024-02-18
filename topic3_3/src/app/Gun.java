package app;
//Maiza Falcon Rojas
//CST-239
//02/14/2024
//I used source code from the following place  Activity 3 part 3 Word Document

/**
 * Represents a Gun, implementing the WeaponInterface.
 */
public class Gun implements WeaponInterface {

	  /**
     * Fires the gun with a specified power.
     *
     * @param power The power with which to fire the gun.
     */
public void fireWeapon(int power) {
		
		System.out.println("In Gun.fireWeapon() with a power of " + power); 
	}


/**
 * Fires the gun with a default power.
 */
public void fireWeapon() {
	
	System.out.println("In Gun.fireWeapon()"); 
}

/**
 * Activates or deactivates the gun.
 *
 * @param enable True to activate, false to deactivate.
 */
public void activate(boolean enable) {
	
	System.out.println("In the Gun.activate() with an enable of " + enable); 
}
}
