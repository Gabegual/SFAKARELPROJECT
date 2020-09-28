/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {
		moveToPaper();
		pickBeeper();
		backHome();
		
		
	}
	public void moveToPaper() {
		move();
		turnRight();
		move();
		turnLeft();
		moveX(2);
	}
	public void backHome() {
		faceWest();
		moveX(2);
		turnRight();
		move();
		turnLeft();
		move();
	}
	public void faceEast() {
		while(!facingEast()){
			turnLeft();
		}
		
	
	}  
	public void faceWest() {
		while(!facingWest()){
			turnRight();
		}
		
	
	}  
	public void faceNorth() {
		while(!facingNorth()){
			turnRight();
		}
		
	
	}  
	public void faceSouth() {
		while(!facingSouth()){
			turnRight();
		}
		
	
	}  
	public void moveX(int i) {
		for (int a=0; a<i; a++) {
			move();
		}
		
	}
}
