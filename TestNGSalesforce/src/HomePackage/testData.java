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
    String PackStandard199 = "Hive 1 - Standard - £199";
    String PackSelfie159 = "Self Install - £159";
    String PackRHCReady99 = "RHC Ready (Hub Only) - £99";
    String PackFrame = "Lemon Punch - Frame - £19.99";
    String PackFrame1 = "Luscious Lime - Frame - £19.99";
    String PackFrame2 = "Moroccan Flame - Frame - £19.99";
    String PackHAH2 = "Hive 2 - Standard £249";
    String PackHAH2Selfie = "Hive 2 - Self Install - £179";
    String PackHAH2NoDeliverySelfie = "Hive 2 - No Delivery Self Install - £179";
    String PackStand = "Hive 2 - Stand - £19.99";
    String PackHAH2UpgradeSelfie = "Hive 2 - HAH Upgrade Self Install - £99";
    String PackHAHDD = "HAH - £5 per month";
    String PackHAHTEST = "TEST DONOT USE HAH DELIVERY ONLY";
    String PackPMZ1 = "PMZ - Extra Zone - £99";
    String PackPMZSelfie = "PMZ - Self Install Extra Zone - £99";
    String AddressLine1 = randomizer.AddressL1();
    //String AddressLine1 = "Vicarage Lodge, 81-83 Vicarage Farm Road";
    String AddressTown = "Hounslow";
    String Postcode = "TW3 4NN";
    String CardNumber = "4263971921001307";
    String CardSecurity = "123";
    String ScheduleDate = randomizer.futuredate();
    String VoucherTradeRetail = "TRADE";
    String VoucherAmazonRetail = "retailHAH2";
    
    Date date = new Date();
    String modifiedDate= new SimpleDateFormat("dd/MM/yyyy").format(date);

}
