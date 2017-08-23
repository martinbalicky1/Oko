package model.card;

import model.Constants;

public enum Color {

	SPADES(Constants.SPADES), CLUBS(Constants.CLUBS), HEARTS(Constants.HEARTS), DIAMONDS(Constants.DIAMONDS);

	private final char color;

	private Color(char color) {
		this.color = color;
	}

	public char getColor() {
		return this.color;
	}
}
