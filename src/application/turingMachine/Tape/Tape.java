package application.turingMachine.Tape;

import java.util.ArrayList;
import java.util.List;

/**
 * The tape class creates a tape for the turing machine.
 * It consits of a head and an arraylist representing the tape itself.
 * The head and the tape can be moved along the tape.
 *
 *
 * @author Stefan R. Bachmann on  06/11/2015
 * @version v0.1 - application.turingMachine.Tape
 */
public class Tape {

	private List<Character> tape = new ArrayList<>();
	private int headOnTape;

	private final static char HEAD = 'H';

	public Tape() {
	}

	private void setHeadOnTape(){
		this.headOnTape = tape.indexOf(HEAD);
	}

	private void initializeTape(ArrayList<Character> tape){
		tape.add(Alphabet.SPACE.getCharacter());
		tape.add(HEAD);
	}
}
