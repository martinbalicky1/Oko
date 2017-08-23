package model.card;

import model.Constants;

public enum Value {
	SEVEN(Constants.SEVEN), EIGHT(Constants.EIGHT), NINE(Constants.NINE), TEN(Constants.TEN), JACK(
			Constants.JACK), QUEEN(Constants.QUEEN), KING(Constants.KING), ACE(Constants.ACE);

	private final String label;

	Value(String label) {
		this.label = label;
	}

	public String getLabel() {
		return this.label;
	}

}
