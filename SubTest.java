package MyJunittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void Subtest() {
		Calculator junit = new Calculator();
		int result = junit.sub(300, 200);
		assertEquals(100, result);
	}

}
