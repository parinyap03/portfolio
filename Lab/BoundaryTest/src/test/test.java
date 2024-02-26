package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Converter;
import main.Converter.SizeInKilo;

class test {


	@ParameterizedTest
    @CsvSource({
            // domestic flight, flightClass, royalty, expectedSize
            "false, 3, 0, XS",
            "false, 3, 3, S",
            "false, 3, 2, M",
            "false, 3, 1, L",
            
            "false, 2, 0, S",
            "false, 2, 3, M",
            "false, 2, 2, L",
            "false, 2, 1, XL",
            
            "false, 1, 0, M",
            "false, 1, 3, L",
            "false, 1, 2, XL",
            "false, 1, 1, XL",
            
    })
    @DisplayName("Test domestic flight")
    public void testdomestic(boolean domeflight, int flightClass, int royalty, SizeInKilo expected) {
        Converter converter = new Converter(domeflight, flightClass, royalty);
        //Converter.SizeInKilo actual = converter.convert();
        assertEquals(expected, converter.convert());
    }
	
	@ParameterizedTest
    @CsvSource({
            // international, flightClass, royalty, expectedSize
            "true, 3, 0, M",
            "true, 3, 3, L",
            "true, 3, 2, XL",
            "true, 3, 1, XL",
            
            "true, 2, 0, L",
            "true, 2, 3, XL",
            "true, 2, 2, XL",
            "true, 2, 1, XL",
            
            "true, 1, 0, XL",
            "true, 1, 3, XL",
            "true, 1, 2, XL",
            "true, 1, 1, XL",
            
    })
    @DisplayName("Test international flight")
    public void testinternational(boolean intflight, int flightClass, int royalty, SizeInKilo expected) {
        Converter converter = new Converter(intflight, flightClass, royalty);
        //Converter.SizeInKilo actual = converter.convert();
        assertEquals(expected, converter.convert());
    }

//	@ParameterizedTest
//    @CsvSource({
//            // intflight, flightClass, royalty, expectedSize
//            "true, 10, 0",
//            "true, 1, 10",
//            "false, 10, 0",
//            "false, 1, 10",
//            "true, -10, 0",
//            "false, 1,-10",
//            "true, -10, -10"
//            
//            //"true, 1, 1, XXX"
//          
//    })
//    @DisplayName("Test invalid input")
//    public void testinvalid(boolean intflight, int flightClass, int royalty) {
//        Converter converter = new Converter(intflight, flightClass, royalty);
//        //Converter.SizeInKilo actual = converter.convert();
//        assertEquals(null, converter.convert());
//    }
	
}
