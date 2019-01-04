package zomato;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {
	@Test
	void testForcheckSetId() {
		Player player = new Player();
		player.setId(5);
		assertEquals(5, player.getId());
	}
	@Test
	void testForcheckSetPosition() {
		Player player = new Player();
		player.setPosition(15);
		assertEquals(15, player.getPosition());
	}
}
