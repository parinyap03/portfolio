package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.CountClump;

class testLine {

	CountClump countClumps;

	@BeforeEach
	public void setUp() throws Exception {
		countClumps = new CountClump();
	}

	@Test
	void testTC01() {
		assertEquals(2, countClumps.countClumps(new int[] { 0, 0, 3, 5, 9, 9 }));
	}

	@Test
	public void testTC02() {
		assertEquals(0, countClumps.countClumps(new int[] {}));
	}
	 @Test
	    public void testTC03() {
	        assertEquals(0, countClumps.countClumps(null));
	    }
	@Test
	public void testTC04() {
		assertEquals(0, countClumps.countClumps(new int[] { 5 }));
	}

	@Test
	public void testTC05() {
		assertEquals(0, countClumps.countClumps(new int[] { 1, 2, 3, 4 }));
	}
}
