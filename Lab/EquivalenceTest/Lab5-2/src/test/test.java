package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;


import org.junit.jupiter.params.provider.MethodSource;


import main.ShippingVehicle;
//import test.resources.MyArguments;



class test {
	ShippingVehicle sh;
	@BeforeEach
	void beforeEach() {
		sh = new ShippingVehicle();
	}
	
    @ParameterizedTest(name = "{index} => smallSize={0}, mediumSize={1}, largeSize={2}, expected={3}")
    @MethodSource("shippingTest")
    public void testShippingCalculator(int smallSize, int mediumSize, int largeSize, List<Integer> expected) {
        List<Integer> actual = sh.calculate(smallSize, mediumSize, largeSize);
        assertEquals(expected, actual);
    }
    private static List<Arguments> shippingTest() {
        return Arrays.asList(
            // กลุ่มที่ 1: ขนาดทั้งหมดเท่ากับ 0 
            Arguments.of(0, 0, 0, Arrays.asList(0,0,0)),

            // กลุ่มที่ 2: ขนาด smallSize เป็นค่าบวก 
            Arguments.of(1, 0, 0, Arrays.asList(0,0, 1)),

            // กลุ่มที่ 3: ขนาด mediumSize เป็นค่าบวก 
            Arguments.of(0, 5, 0, Arrays.asList(0, 1, 0)),

            // กลุ่มที่ 4: ขนาด largeSize เป็นค่าบวก 
            Arguments.of(0, 0, 10, Arrays.asList(1, 0, 0)),

            // กลุ่มที่ 5: ขนาดทั้งหมดเป็นค่าบวก 
            Arguments.of(3, 7, 15, Arrays.asList(2, 1, 0)),
            Arguments.of(10,20, 20, Arrays.asList(5, 0, 0)),
            Arguments.of(1,5, 10, Arrays.asList(1, 1, 1)),
            
            // กลุ่มที่ 6: 	ขนาดทั้งหมดมีเป็นค่าติดลบ 
            Arguments.of(-3, -7, -15, Arrays.asList(-1)),
            
            // กลุ่มที่ 7: ขนาด smallSize เป็นค่าลบ 
            Arguments.of(-1, 0, 0, Arrays.asList(-1)),

            // กลุ่มที่ 8: ขนาด mediumSize เป็นค่าลบ 
            Arguments.of(0, -5, 0, Arrays.asList(-1)),

            // กลุ่มที่ 9: ขนาด largeSize เป็นค่าลบ 
            Arguments.of(0, 0, -10, Arrays.asList(-1))
          
        );
    }
	
    
}
