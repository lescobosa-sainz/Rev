package BankDriver;

import Screens.HomeScreen;
import Screens.Screen;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Screen currentScreen = new HomeScreen();
		while(true) {
			currentScreen = currentScreen.run();
}
		
	}

}
