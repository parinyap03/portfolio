package test;

import main.IngredientConverter;

public class DriverIngrediant {
	
	public static void main(String[] args)
	{
		double originalvalue = 2.0 ;
		double convertedValue = 0.0;
		String choice = "butter";
		String from = "cup";
		String to = "gram" ;
		
		IngredientConverter Inconverter = new IngredientConverter();
		
		convertedValue = Inconverter.convert(originalvalue, choice, from, to);
		System.out.println("Converter "+ choice +" : from " + originalvalue + " " + from + " = " + convertedValue + " " + to);
		choice = "flour" ;
		convertedValue = Inconverter.convert(originalvalue, choice, from, to);
		System.out.println("Converter "+ choice +" : from " + originalvalue + " " + from + " = " + convertedValue + " " + to);
		choice = "liquid" ;
		to = "ml";
		convertedValue = Inconverter.convert(originalvalue, choice, from, to);
		System.out.println("Converter "+ choice +" : from " + originalvalue + " " + from + " = " + convertedValue + " " + to);
		
		
		
		
		
	}
	

}
