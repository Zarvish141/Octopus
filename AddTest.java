package MyJunittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {


	public void Addtest() {
		Calculator junit = new Calculator();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	}
}
