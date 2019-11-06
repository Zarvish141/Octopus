package MyJunittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulTest {

	@Test
	public void Multest() {
		Calculator junit = new Calculator();
		int result = junit.mul(10, 20);
		assertEquals(200, result);
	}
}
