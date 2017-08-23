package util;

import exception.DimensionsException;


public class CardValidity {

	public void setCardSize(int cardSizeX, int cardSizeY) throws DimensionsException {
		if (cardSizeX < 6 || cardSizeY < 6) {
			throw new DimensionsException("Minimal length of card is 6*6");
		}
	}
}
