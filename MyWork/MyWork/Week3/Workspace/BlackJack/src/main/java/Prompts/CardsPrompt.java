package Prompts;

import java.util.List;

import CardDao.CardDAO;
import Models.Card;

public class CardsPrompt implements Prompt {

	private CardDAO cardDAO = CardDAO.currentImplementation;

	@Override
	public Prompt run() {

		List<Card> accounts = cardDAO.findAll();
		for (Card c : accounts) {
			System.out.println(c);
		}

		return new HomePrompt();
	}

}
