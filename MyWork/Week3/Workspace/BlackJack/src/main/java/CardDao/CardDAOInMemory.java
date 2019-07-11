package CardDao;

import java.util.LinkedList;
import java.util.List;

import Models.Card;

public class CardDAOInMemory implements CardDAO {
	
	
	private List<Card> cards;

	public CardDAOInMemory() {
		cards = new LinkedList<>();
		cards.add(new Card(2, "2h"));
		cards.add(new Card(3, "3h"));
		cards.add(new Card(4, "4h"));
		cards.add(new Card(5, "5h"));
		cards.add(new Card(6, "6h"));

	}

	
	
	
	
	
	

	@Override
	public List<Card> findAll() {
		return cards;
}
	

}
