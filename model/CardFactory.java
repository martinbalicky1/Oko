package model;

import model.card.Color;
import model.card.Value;

public class CardFactory {
	// hearts
	public Card createHearts7() {
		return new Card(Color.HEARTS, Value.SEVEN);
	}

	public Card createHearts8() {
		return new Card(Color.HEARTS, Value.EIGHT);
	}

	public Card createHearts9() {
		return new Card(Color.HEARTS, Value.NINE);
	}

	public Card createHearts10() {
		return new Card(Color.HEARTS, Value.TEN);
	}

	public Card createHeartsJ() {
		return new Card(Color.HEARTS, Value.JACK);
	}

	public Card createHeartsQ() {
		return new Card(Color.HEARTS, Value.QUEEN);
	}

	public Card createHeartsK() {
		return new Card(Color.HEARTS, Value.KING);
	}

	public Card createHeartsA() {
		return new Card(Color.HEARTS, Value.ACE);
	}

	// spades
	public Card createSpades7() {
		return new Card(Color.SPADES, Value.SEVEN);
	}

	public Card createSpades8() {
		return new Card(Color.SPADES, Value.EIGHT);
	}

	public Card createSpades9() {
		return new Card(Color.SPADES, Value.NINE);
	}

	public Card createSpades10() {
		return new Card(Color.SPADES, Value.TEN);
	}

	public Card createSpadesJ() {
		return new Card(Color.SPADES, Value.JACK);
	}

	public Card createSpadesQ() {
		return new Card(Color.SPADES, Value.QUEEN);
	}

	public Card createSpadesK() {
		return new Card(Color.SPADES, Value.KING);
	}

	public Card createSpadesA() {
		return new Card(Color.SPADES, Value.ACE);
	}

	// clubs
	public Card createClubs7() {
		return new Card(Color.CLUBS, Value.SEVEN);
	}

	public Card createClubs8() {
		return new Card(Color.CLUBS, Value.EIGHT);
	}

	public Card createClubs9() {
		return new Card(Color.CLUBS, Value.NINE);
	}

	public Card createClubs10() {
		return new Card(Color.CLUBS, Value.TEN);
	}

	public Card createClubsJ() {
		return new Card(Color.CLUBS, Value.JACK);
	}

	public Card createClubsQ() {
		return new Card(Color.CLUBS, Value.QUEEN);
	}

	public Card createClubsK() {
		return new Card(Color.CLUBS, Value.KING);
	}

	public Card createClubsA() {
		return new Card(Color.CLUBS, Value.ACE);
	}

	// diamonds
	public Card createDiamonds7() {
		return new Card(Color.DIAMONDS, Value.SEVEN);
	}

	public Card createDiamonds8() {
		return new Card(Color.DIAMONDS, Value.EIGHT);
	}

	public Card createDiamonds9() {
		return new Card(Color.DIAMONDS, Value.NINE);
	}

	public Card createDiamonds10() {
		return new Card(Color.DIAMONDS, Value.TEN);
	}

	public Card createDiamondsJ() {
		return new Card(Color.DIAMONDS, Value.JACK);
	}

	public Card createDiamondsQ() {
		return new Card(Color.DIAMONDS, Value.QUEEN);
	}

	public Card createDiamondsK() {
		return new Card(Color.DIAMONDS, Value.KING);
	}

	public Card createDiamondsA() {
		return new Card(Color.DIAMONDS, Value.ACE);
	}
	// Do triedy Card som pridal este nasledujucu dvojicu konstruktorov
	/*
	 * public Card(Color color){ this.color = color; } public Card(Value value){
	 * this.value = value; }
	 */

}
