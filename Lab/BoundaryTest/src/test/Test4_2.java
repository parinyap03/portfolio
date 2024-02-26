package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Converter;
import main.Converter.SizeInKilo;
//intflight; //true = international flight, false = domestic flight
//flightClass; //1 = 1st class, 2 = business class, 3 = economy
//royalty; //1 = platinum, 2 = gold, 3 = silver, 0 = not a member

class Test4_2 {

	//X1=flightClass
	//Robust Testing
		@ParameterizedTest
	    @CsvSource({
	            // flightClass, royalty, expectedSize
	    		"0, 2,",
	            "1, 2, XL",
	            "2, 2, XL",
	            "3, 2, XL",
	            "4 ,2,"
	    })
	    @DisplayName("Test International flight")
	    public void testInternationalX1(int flightClass, int royalty,SizeInKilo expected) {
	        Converter converter = new Converter(true,flightClass, royalty);
	      //Converter.SizeInKilo actual = converter.convert();
	        assertEquals(expected, converter.convert());
	    }
		@ParameterizedTest
	    @CsvSource({
	            // flightClass, royalty, expectedSize
	    		"0, 2,",
	            "1, 2, XL",
	            "2, 2, L",
	            "3, 2, M",
	            "4 ,2,"
	    })
	    @DisplayName("Test domestic flight")
	    public void testDomesticX1(int flightClass, int royalty,SizeInKilo expected) {
	        Converter converter = new Converter(false,flightClass, royalty);
	      //Converter.SizeInKilo actual = converter.convert();
	        assertEquals(expected, converter.convert());
	    }
		//X2=royalty
		@ParameterizedTest
	    @CsvSource({
	            // flightClass, royalty, expectedSize
	    		"2,-1, ",
	            "2, 0, S",
	            "2, 1, XL",
	            "2, 3, M",
	            "2, 4, "
	    })
	    @DisplayName("Test Domestic flight")
	    public void testDomesticX2(int flightClass, int royalty, SizeInKilo expected) {
	        Converter converter = new Converter(false,flightClass, royalty);
	        //Converter.SizeInKilo actual = converter.convert();
	        assertEquals(expected, converter.convert());
	    }
		@ParameterizedTest
	    @CsvSource({
	            // flightClass, royalty, expectedSize
	    		"2,-1, ",
	            "2, 0, L",
	            "2, 1, XL",
	            "2, 3, M",
	            "2, 4, "
	    })
	    @DisplayName("Test International flight")
	    public void testInternationalX2(int flightClass, int royalty, SizeInKilo expected) {
	        Converter converter = new Converter(true,flightClass, royalty);
	        //Converter.SizeInKilo actual = converter.convert();
	        assertEquals(expected, converter.convert());
	    }
}
