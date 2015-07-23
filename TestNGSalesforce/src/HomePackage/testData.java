package HomePackage;

import java.text.SimpleDateFormat;
import java.util.Date;



public class testData {

	 //Test Data here
	   
	 //  public String Fname = RandomLetters;
	
	//randomizer rdm = new randomizer();
	String Fname = randomizer.randomname();
    String Lname = "Auto Test";
    String Name = Fname+" "+Lname;
    String Mobile = randomizer.randomphone();
    String JobRN = randomizer.randomjrn();
    String JobRN1 = randomizer.randomjrn();
    String PackStandard199 = "Standard - £199";
    String PackSelfie159 = "Self Install - £159";
    String PackFrame = "Lemon Punch - Frame - £19.99";
    String PackHAH2 = "Hive 2 - Standard £249";
    String PackHAH2Selfie = "Hive 2 - Self Install - £179";
    String PackHAHDD = "HAH - £5 per month";
    String PackHAHTEST = "TEST DONOT USE HAH DELIVERY ONLY";
    String AddressLine1 = randomizer.AddressL1();
    //String AddressLine1 = "Vicarage Lodge, 81-83 Vicarage Farm Road";
    String AddressTown = "Hounslow";
    String Postcode = "TW3 4NN";
    String CardNumber = "4263971921001307";
    String CardSecurity = "123";
    String ScheduleDate = randomizer.futuredate();
    
    
    Date date = new Date();
    String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);

}
