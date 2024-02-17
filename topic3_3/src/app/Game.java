package app;
//Maiza Falcon Rojas
//CST-239
//02/14/2024
//I used source code from the following place  Activity 3 part 3 Word Document


/**
 * Represents a Game scenario with weapon firing and activation.
 */
public class Game {
	
	
	 /**
     * Fires a weapon, prints if the weapon is a Bomb.
     *
     * @param weapon The weapon to fire.
     */
	private static void fireWeapon(WeaponInterface weapon) {
		
		if (weapon instanceof Bomb)
			System.out.println("----------> I am a Bomb"); 
		
		weapon.activate(true);
		weapon.fireWeapon(5); 
	   }
	
	
	/**
     * The main method where the game scenario is executed.
     *
     * @param args Command-line arguments (not used in this example).
     */
	public static void main(String[] args) {
		
		// Create an array of WeaponINterface and initialize to specific Weapon of Bomb and Gun
		WeaponInterface[] weapons = new WeaponInterface[2]; 
		weapons[0] = new Bomb(); 
		weapons[1] = new Gun(); 
		
		// For all Weapons fire them 
		for(int x=0;x < weapons.length;++x) {
			
			fireWeapon(weapons[x]); 
		}
	
	}
}
