package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.Converter;
import main.Converter.SizeInKilo;

//intflight; //true = international flight, false = domestic flight
//flightClass; //1 = 1st class, 2 = business class, 3 = economy
//royalty; //1 = platinum, 2 = gold, 3 = silver, 0 = not a member

class Test4_3 {
	
	//CsvFileSourceFromFile
	//X1=flightClass
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/domestic.csv", numLinesToSkip = 1)
	@DisplayName("domestic flight With Csv FileSource From File")
	void testdomestic(int flightClass, int royalty,SizeInKilo expected) {
		Converter converter = new Converter(false,flightClass, royalty);
        //Converter.SizeInKilo actual = converter.convert();
        assertEquals(expected, converter.convert());
	}
	
	
	//X2=royalty
	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/international.csv", numLinesToSkip = 1)
	@DisplayName("international flight With Csv FileSource From File")
	void testinternational(int flightClass, int royalty,SizeInKilo expected) {
		Converter converter = new Converter(true,flightClass, royalty);
        //Converter.SizeInKilo actual = converter.convert();
        assertEquals(expected, converter.convert());
	}

}
