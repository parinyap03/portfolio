package test;

import main.LiquidConverter;

public class StubLiquid extends LiquidConverter {
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 250.0;
	}
}
