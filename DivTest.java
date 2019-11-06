package MyJunittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivTest {

	@Test
	public void Divtest() {
		Calculator junit = new Calculator();
		int result = junit.div(600, 2);
		assertEquals(300, result);
	}

}
