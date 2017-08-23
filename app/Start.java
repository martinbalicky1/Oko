package app;

import java.util.ArrayList;
import java.util.List;

import exception.DimensionsException;
import model.Card;
import model.CardFactory;
import model.Constants;
import model.Player;
import util.CardValidity;
import util.CardsUtil;

public class Start {
	public static void main(String[] args) {

		CardValidity cv = new CardValidity();

		try {
			cv.setCardSize(Constants.CARD_SIZE_X, Constants.CARD_SIZE_Y);
		} catch (DimensionsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CardFactory factory = new CardFactory();

		Card testCard1 = factory.createClubs7();
		Card testCard2 = factory.createDiamonds10();
		Card testCard3 = factory.createSpades10();
		Card testCard4 = factory.createClubs10();

		Player player = new Player();

		List<Card> playerCards = new ArrayList<>();
		playerCards.add(testCard1);
		playerCards.add(testCard2);
		playerCards.add(testCard3);
		playerCards.add(testCard4);
		player.setCard(playerCards);


		Card testCard5 = factory.createClubs7();
		Card testCard6 = factory.createDiamonds10();
		Card testCard7 = factory.createSpades7();
		Card testCard8 = factory.createSpades8();

		Player comp = new Player();

		List<Card> playerCards2 = new ArrayList<>();
		playerCards2.add(testCard5);
		playerCards2.add(testCard6);
		playerCards2.add(testCard7);
		playerCards2.add(testCard8);
		comp.setCard(playerCards2);


		CardsUtil cu2 = new CardsUtil();
		cu2.drawPlayers(player, comp);


	}

}
