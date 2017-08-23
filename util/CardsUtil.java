package util;

import model.Constants;
import model.Player;

public class CardsUtil {
	/**method returned top line of cards for Player
	 * 
	 */
	public String drawTopLine(Player comp) {
		StringBuilder line = new StringBuilder();
		int cardCount = comp.getCard().size();

		line.append(Constants.TLC);
		for (int i = 0; i < cardCount; i++) {
			if (i == 0) {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2; j++) {
					line.append(Constants.HL);
				}
			} else {
				line.append(Constants.TJ).append(Constants.HL).append(Constants.HL);
			}

		}

		line.append(Constants.TRC);

		return line.toString();
	}

	
	/**method returned bottom line of cards for Player
	 * 
	 */
	public String drawBottomLine(Player comp) {
		StringBuilder line = new StringBuilder();
		int cardCount = comp.getCard().size();

		line.append(Constants.BLC);
		for (int i = 0; i < cardCount; i++) {
			if (i == 0) {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2; j++) {
					line.append(Constants.HL);
				}
			} else {
				line.append(Constants.BJ).append(Constants.HL).append(Constants.HL);
			}

		}

		line.append(Constants.BRC);

		return line.toString();
	}

	
	/**method returned number line of cards for Player
	 * 
	 */
	public String drawNumberLine(Player comp) {
		StringBuilder line = new StringBuilder();
		int cardCount = comp.getCard().size();

		line.append(Constants.VL);
		for (int i = 0; i < cardCount; i++) {
			String cardLabel = comp.getCard().get(i).getValue().getLabel();
			int cardLabelLength = cardLabel.length();

			if (cardLabelLength == 1) {
				if (i == 0) {
					line.append(cardLabel);
					for (int j = 0; j < Constants.CARD_SIZE_X - 4; j++) {
						line.append(Constants.SP);
					}
					line.append(cardLabel).append(Constants.VL);
				} else {
					line.append(Constants.SP).append(cardLabel).append(Constants.VL);
				}
			} else {
				if (i == 0) {
					line.append(cardLabel);
					for (int j = 0; j < Constants.CARD_SIZE_X - 6; j++) {
						line.append(Constants.SP);
					}
					line.append(cardLabel).append(Constants.VL);
				} else {
					line.append(cardLabel).append(Constants.VL);
				}

			}
		}

		return line.toString();
	}

	
	/**method returned color line of cards for Player
	 * 
	 */
	public String drawColorLine(Player comp) {
		StringBuilder line = new StringBuilder();
		int cardCount = comp.getCard().size();

		line.append(Constants.VL);
		for (int i = 0; i < cardCount; i++) {
			char cardLabel = comp.getCard().get(i).getColor().getColor();

			if (i == 0) {
				line.append(Constants.SP).append(cardLabel);
				for (int j = 0; j < Constants.CARD_SIZE_X - 6; j++) {
					line.append(Constants.SP);
				}
				line.append(cardLabel).append(Constants.SP).append(Constants.VL);
			} else {
				line.append(cardLabel).append(Constants.SP).append(Constants.VL);
			}
		}
		return line.toString();
	}

	
	/**method returned empty line of cards for Player
	 * 
	 */
	public String drawEmptyLine(Player comp) {
		StringBuilder line = new StringBuilder();
		int cardCount = comp.getCard().size();

		line.append(Constants.VL);
		for (int i = 0; i < cardCount; i++) {
			char SP = Constants.SP;

			if (i == 0) {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2; j++) {
					line.append(SP);
				}
			} else {
				line.append(Constants.VL).append(SP).append(SP);
			}

		}
		line.append(Constants.VL);
		return line.toString();
	}

	

	/**method returned top line of cards for Player
	 * 
	 */
	public String drawTopLine2(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCard().size();

		line.append(Constants.TLC);
		for (int i = 0; i < cardCount; i++) {
			if (i < cardCount - 1) {
				line.append(Constants.HL).append(Constants.HL).append(Constants.TJ);
			} else {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2; j++) {
					line.append(Constants.HL);
				}
			}
		}

		line.append(Constants.TRC);

		return line.toString();
	}

	
	/**method returned bottom line of cards for Player
	 * 
	 */
	public String drawBottomLine2(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCard().size();

		line.append(Constants.BLC);
		for (int i = 0; i < cardCount; i++) {
			if (i < cardCount - 1) {
				line.append(Constants.HL).append(Constants.HL).append(Constants.BJ);
			} else {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2; j++) {
					line.append(Constants.HL);
				}
			}
		}
		line.append(Constants.BRC);

		return line.toString();
	}

	
	/**method returned number line of cards for Player
	 * 
	 */
	public String drawNumberLine2(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCard().size();

		line.append(Constants.VL);
		for (int i = 0; i < cardCount; i++) {
			String cardLabel = player.getCard().get(i).getValue().getLabel();
			int cardLabelLength = cardLabel.length();

			if (cardLabelLength == 1) {
				if (i != cardCount - 1) {
					line.append(cardLabel).append(Constants.SP).append(Constants.VL);
				} else if (i == cardCount - 1) {
					line.append(cardLabel);
					for (int j = 0; j < Constants.CARD_SIZE_X - 4; j++) {
						line.append(Constants.SP);
					}
					line.append(cardLabel).append(Constants.VL);
				}

			} else if (cardLabelLength == 2) {
				if (i != cardCount - 1) {
					line.append(cardLabel).append(Constants.VL);
				} else if (i == cardCount - 1) {
					line.append(cardLabel);
					for (int j = 0; j < Constants.CARD_SIZE_X - 6; j++) {
						line.append(Constants.SP);
					}
					line.append(cardLabel).append(Constants.VL);
				}

			}

		}
		return line.toString();
	}

	
	/**method returned color line of cards for Player
	 * 
	 */
	public String drawColorLine2(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCard().size();

		line.append(Constants.VL);
		for (int i = 0; i < cardCount; i++) {
			char cardLabel = player.getCard().get(i).getColor().getColor();
			int cardLabelLength = 1;
			line.append(Constants.SP);
			for (int j = 0; j < 2 - cardLabelLength; j++) {
				line.append(cardLabel);
			}
			if (i == cardCount - 1) {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2 * (1 + cardLabelLength) - 2; j++) {
					line.append(Constants.SP);
				}
				line.append(cardLabel);
				line.append(Constants.SP);
			}
			line.append(Constants.VL);
		}
		return line.toString();
	}
	
	
/**method returned empty line of cards for Player
	 * 
	 */
	public String drawEmptyLine2(Player player) {
		StringBuilder line = new StringBuilder();
		int cardCount = player.getCard().size();

		line.append(Constants.VL);
		for (int i = 0; i < cardCount; i++) {
			char SP = Constants.SP;
			int cardLabelLength = 1;

			line.append(SP);
			for (int j = 0; j < 2 - cardLabelLength; j++) {
				line.append(Constants.SP);
			}
			if (i == cardCount - 1) {
				for (int j = 0; j < Constants.CARD_SIZE_X - 2 * (1 + cardLabelLength) - 1; j++) {
					line.append(Constants.SP);
				}
				line.append(SP);
			}
			line.append(Constants.VL);
		}
		return line.toString();
	}

	
	/**method returned space between cards of Players
	 * 
	 */
	public String spaceBetweenCards() {
		StringBuilder line = new StringBuilder();

		for (int i = 0; i < 50; i++) {
			line.append(Constants.SP);
		}
		return line.toString();
	}

	
	/** method for printing both cards
	 * 
	 */
	public void drawPlayers(Player player, Player comp) {
		System.out.println(drawTopLine(player) + spaceBetweenCards() + drawTopLine2(comp));
		System.out.println(drawNumberLine(player) + spaceBetweenCards() + drawNumberLine2(comp));
		System.out.println(drawColorLine(player) + spaceBetweenCards() + drawColorLine2(comp));
		for (int i = 0; i < Constants.CARD_SIZE_Y - 6; i++) {
			System.out.println(drawEmptyLine(player) + spaceBetweenCards() + drawEmptyLine2(comp));
			}
		System.out.println(drawColorLine(player) + spaceBetweenCards() + drawColorLine2(comp));
		System.out.println(drawNumberLine(player) + spaceBetweenCards() + drawNumberLine2(comp));
		System.out.println(drawBottomLine(player) + spaceBetweenCards() + drawBottomLine2(comp));
	}
	
}

