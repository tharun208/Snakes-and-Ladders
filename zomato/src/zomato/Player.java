package zomato;

public class Player {
	public int id; // Indicates the ID of the player
	public int currentPosition; // Player's current position
	public int oldPosition; // Indicate's player's old position
	public int position; // Player's current position in Game
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getPosition() {
		return this.position;
	}
}
