package HomePackage;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

public class randomizer {
	//Name Randomizer Plan to use it to generate FName and LName. Not my Code I am not a Genius
		static private class CharacterFrequency 
		   { 
		      public float frequency; 
		      public char character; 
		      
		      public CharacterFrequency(char c, float f) 
		      { 
		         character = c; 
		         frequency = f; 
		      } 
		   } 
		    
		   static private CharacterFrequency[] frequencies; 
		    
		   static 
		   { 
		      frequencies = new CharacterFrequency[] 
		      { 
		         new CharacterFrequency('f', 0.8f), 
		         new CharacterFrequency('g', 0.4f), 
		         new CharacterFrequency('h', 0.2f), 
		         new CharacterFrequency('i', 0.6f),
		         new CharacterFrequency('j', 0.10f),
		         // ... 
		         // Add as many as you need 
		      }; 
		   } 
		    
		   private static char getRandomCharacter() 
		   { 
		      float v = (float)Math.random(); 
		      
		      char c = frequencies[0].character; 
		      float f = frequencies[0].frequency; 
		      
		      for (CharacterFrequency cf : frequencies) 
		      { 
		         if (v < cf.frequency && cf.frequency < f) 
		         { 
		            c = cf.character; 
		            f = cf.frequency; 
		         } 
		      } 
		      
		      return c; 
		   } 
		    
		   public static String randomname() 
		   { 
		      int desired_length = 6; 
		      
		      StringBuffer buf = new StringBuffer(desired_length); 
		      
		      for (int i = 0; i < desired_length; ++i) 
		      { 
		         buf.append(getRandomCharacter()); 
		      } 
		      
		 String Random = buf.toString(); 
		 
		 return(Random);
		   } 
		   
		 public static String randomphone(){
			 
			 String randomNumbers = RandomStringUtils.randomNumeric(9);
			 String phNo = "07"+randomNumbers; 
			 return(phNo);
			 
		 }
		 
 public static String AddressL1(){
			 
			 String randomNumbers = RandomStringUtils.randomNumeric(3);
			 String addl1 = randomNumbers+" Vicarage Farms Road"; 
			 return(addl1);
			 
		 }
 
 public static String randomjrn(){
	 
	 String randomNumbers = RandomStringUtils.randomNumeric(8);
	 String jrn = "19"+randomNumbers; 
	 return(jrn);
	 
 }
 
public static String futuredate(){
	 
	Date today = new Date();
	Date newdate = new Date(today.getTime() + (96));
	String scheduledate = newdate.toString();
	 return(scheduledate);
	 
 }
		   
}
