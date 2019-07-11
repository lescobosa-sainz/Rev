package BlackJackDriver;

import Prompts.HomePrompt;
import Prompts.Prompt;


public class BlackJackDriver {

	public static void main(String[] args) {

		
		Prompt currentPrompt = new HomePrompt();
		while(true) {
			currentPrompt = currentPrompt.run();
}
	}

}
