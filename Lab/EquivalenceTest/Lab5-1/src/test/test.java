package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import main.Income;



class test {
	Income ic;
	@BeforeEach
	void beforeEach() {
		 ic = new Income();
	}
	
	@Test
	void testInComeValid() {
		
	    assertEquals(29000, ic.calculateIncome(1000,300,500 ));
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resource/csv_lab5_1.csv", numLinesToSkip = 1)
	void testInComeInvalid(int num_impeller, int num_motor, int num_cover) {
	    assertEquals(-1.0, ic.calculateIncome(num_impeller, num_motor, num_cover));
	}
     
}

