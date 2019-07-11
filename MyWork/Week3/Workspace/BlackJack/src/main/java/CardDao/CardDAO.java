package CardDao;

import java.util.List;

import Models.Card;

public interface CardDAO {
	
	
	CardDAO currentImplementation = new CardDAOInMemory();

	

	List<Card> findAll();

	
}
