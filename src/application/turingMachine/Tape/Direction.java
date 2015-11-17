package application.turingMachine.Tape;

/**
 * @author Stefan R. Bachmann on  06/11/2015
 * @version v0.1 - application.turingMachine.Tape
 */
public enum Direction {

	LEFT('L'),RIGHT('R'),STAY('S');

	private char character;

	Direction(char character) {
		this.character = character;
	}

	public char getCharacter() {
		return character;
	}

	public static Direction getEnum(char direction) {
		for(Direction directionValue: Direction.values()){
			if(directionValue.getCharacter() == direction) {
				return directionValue;
			}
		}
		return null;
	}
}
