package Deliverable_3;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye
 * @modifier Austin Priest, Emre Erdonmez, Jaycob Bond
 */
public abstract class Card {

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override
	public abstract String toString();
        
        public abstract void setRank(int num);
        
        public abstract int getRank();
        
        

}