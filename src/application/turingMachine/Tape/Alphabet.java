package application.turingMachine.Tape;

/**
 * @author Stefan R. Bachmann on  06/11/2015
 * @version v0.1 - application.turingMachine.Tape
 */
public enum Alphabet {

	SPLIT('1'), NUMBER('0'), SPACE('_');

	private char character;

	Alphabet(char character) {
		this.character = character;
	}

	public char getCharacter(){
		return this.character;
	}

	public static Alphabet getEnum(char alphabet) {
		for(Alphabet alphabetValue: Alphabet.values()){
			if(alphabetValue.getCharacter() == alphabet) {
				return alphabetValue;
			}
		}
		return null;
	}
}
