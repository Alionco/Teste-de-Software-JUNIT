package Fat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilTest {
	
	@Test
	void testFatorialZero() {
		Util u = new Util();
		int res = u.fatorial(0);
		assertEquals(res,1);
	}
	
	@Test
	void testFatorialTres() {
		Util u = new Util();
		int res = u.fatorial(3);
		assertEquals(res,6);
	}
}
