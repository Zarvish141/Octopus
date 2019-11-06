package MyJunittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCattest {

	@Test
	public void ConCattest() {
		Calculator junit = new Calculator();
		String result = junit.ConCat("Sunil", "Rajput");
		assertEquals("SunilRajput", result);
	}

}
