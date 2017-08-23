package model;

import java.util.List;

public class Screen {

	private static Screen instance;
	private Player player;
	private Player comp;
	private List<StringBuilder> lines;

	public Screen getInstance() {
		if (instance == null) {
			instance = new Screen();
		}
		return instance;
	}

}
