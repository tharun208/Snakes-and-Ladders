package zomato;

import java.util.HashMap;
import java.util.Map;

public class GameBoard {
	public static Map<Integer, Integer> ladderandSnakePosition = new HashMap<>();
	public static void initializeSnakeandLadderPositions() {
		// constructed ladders
		ladderandSnakePosition.put(5,25);
		ladderandSnakePosition.put(10,29);
		ladderandSnakePosition.put(22,41);
		ladderandSnakePosition.put(28,55);
		ladderandSnakePosition.put(44,95);
		ladderandSnakePosition.put(70,89);
		ladderandSnakePosition.put(79,81);
        // constructed snakes
		ladderandSnakePosition.put(37,17);
		ladderandSnakePosition.put(31,14);
		ladderandSnakePosition.put(73,53);
		ladderandSnakePosition.put(78,39);
		ladderandSnakePosition.put(92,35);
		ladderandSnakePosition.put(99,7);
	}
}
