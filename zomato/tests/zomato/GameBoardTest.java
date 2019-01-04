package zomato;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class GameBoardTest {
	@Test
	public void testForSnake() {
	  GameBoard.initializeSnakeandLadderPositions();
	  Map<Integer, Integer> ladderandSnakePosition = GameBoard.ladderandSnakePosition;
	  assertEquals("25",String.valueOf(ladderandSnakePosition.get(5)));
	  assertEquals("95",String.valueOf(ladderandSnakePosition.get(44)));
	}
	@Test
	public void testForLadder() {
	  GameBoard.initializeSnakeandLadderPositions();
	  Map<Integer, Integer> ladderandSnakePosition = GameBoard.ladderandSnakePosition;
	  assertEquals("17",String.valueOf(ladderandSnakePosition.get(37)));
	  assertEquals("7",String.valueOf(ladderandSnakePosition.get(99)));
	}
	@Test
	public void testForNoSnakesandNoLadder() {
	GameBoard.initializeSnakeandLadderPositions();
	Map<Integer, Integer> ladderandSnakePosition = GameBoard.ladderandSnakePosition;
	assertEquals(null,ladderandSnakePosition.get(3));
	}
}
