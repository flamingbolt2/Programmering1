package Game.R.P.S.New;

public class Player {
	private String name = "name";
	private String choice = "choice";

	// Constructor
	public Player(String name, String choice) {
		this.name = name;

	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getChoice() {
		return choice;
	}

	// Method
	public String toString() {
		return name + " " + choice;
	}
}
