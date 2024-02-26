package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testWithStub {

	@Test
	void testButterConverter() {
		StubButter StubBut = new StubButter();
		assertEquals(454, StubBut.convert(2, "cub", "gram"));
	}
	@Test
	void testFlourConverter() {
		StubFlour StubF = new StubFlour();
		assertEquals(250, StubF.convert(2, "cub", "gram"));
	}
	@Test
	void testLiquidConverter() {
		StubLiquid StubL = new StubLiquid();
		assertEquals(500, StubL.convert(2, "cub", "ml"));
	}
	
}
