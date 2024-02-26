package test;

import main.ButterConverter;

public class StubButter extends ButterConverter {

	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 227.0;
	}
	
	
	
}
