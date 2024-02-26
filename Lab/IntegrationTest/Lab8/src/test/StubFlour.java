package test;

import main.FlourConverter;

public class StubFlour extends FlourConverter {

	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 125.0;
	}
}
