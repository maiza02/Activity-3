package app;
//Maiza Falcon Rojas
//CST-239
//02/14/2024
//I used source code from the following place  Activity 3 part 3 Word Document

/**
 * This interface defines the behavior for a weapon, including firing the weapon,
 * adjusting firing power, and activating or deactivating the weapon.
 */
public interface WeaponInterface {
	
	 /**
     * Fires the weapon with a default power.
     */
	public void fireWeapon(); 
	 /**
     * Fires the weapon with a specified power.
     *
     * @param power The power with which to fire the weapon.
     */
	public void fireWeapon(int power); 
    /**
     * Activates or deactivates the weapon.
     *
     * @param enable True to activate, false to deactivate.
     */
	public void activate(boolean enable); 

}
