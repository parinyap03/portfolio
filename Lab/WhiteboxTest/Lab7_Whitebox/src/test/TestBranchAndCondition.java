package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.CountClump;

class TestBranchAndCondition {

	CountClump countClumps;
	@BeforeEach
	public void setUp() throws Exception {
		countClumps = new CountClump();
	}
	@Test
    public void testTC01() {
        assertEquals(0, countClumps.countClumps(new int[]{}));
    }
	@Test
    public void testTC02() {
        assertEquals(0, countClumps.countClumps(null));
    }
	@Test
    public void testTC03() {
        assertEquals(1, countClumps.countClumps(new int[]{0,1,2,2,2}));
    }

}
