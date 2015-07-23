package HomePackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
import org.testng.annotations.*;
//import org.testng.annotations.Test;

public class HomeClass {

	WebDriver driver = new FirefoxDriver(); 
	environments env = new environments();
	testData testd = new testData();

	@BeforeTest
	public void openSalesforce() {
		driver.get(env.baseUrl);
		env.actualTitle = driver.getTitle();
		// Confirm if Salesforce Login page is open
		Assert.assertEquals(env.actualTitle,env.expectedTitle);

	}

	@Test(priority = 0)
	public void loginSalesforce(){
		//Identify and Enter Username
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys(env.StageUsername);

		//Identify and Enter Password
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(env.StagePassword);

		//Identify Login button
		WebElement LoginButton = driver.findElement(By.id("Login"));
		LoginButton.click();

		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, env.ProdexpectedCsaTitle);	



	}
	@Test(priority = 1)
	public void createLead(){
		//Open Leads tab   
		WebElement LeadsTab = driver.findElement(By.linkText("Leads"));
		LeadsTab.click();
		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, env.ProdexpectedLeadsTitle);

		//Open Lead Edit page
		WebElement NewButtonLead= driver.findElement(By.xpath(".//*[@id='hotlist']/table/tbody/tr/td[2]/input"));
		NewButtonLead.click();
		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, env.ProdexpectedLeadEditTitle);
		// Fill up Leads page
		Select LeadSalutaion= new Select(driver.findElement(By.xpath(".//*[@id='name_salutationlea2']")));
		LeadSalutaion.selectByVisibleText("Mr");

		WebElement FName = driver.findElement(By.xpath(".//*[@id='name_firstlea2']"));
		FName.sendKeys(testd.Fname);

		WebElement LName = driver.findElement(By.xpath(".//*[@id='name_lastlea2']"));
		LName.sendKeys(testd.Lname);

		WebElement email = driver.findElement(By.xpath(".//*[@id='lea11']"));
		email.sendKeys(testd.Fname+"@yopmail.com");

		WebElement phone = driver.findElement(By.xpath(".//*[@id='lea8']"));
		phone.sendKeys(testd.Mobile);

		WebElement mobile = driver.findElement(By.xpath(".//*[@id='lea9']"));
		mobile.sendKeys(testd.Mobile);

		WebElement ucrn = driver.findElement(By.xpath(".//*[@id='00N20000009XwH9']"));
		ucrn.sendKeys(testd.Mobile);

		Select ContactType= new Select(driver.findElement(By.xpath(".//*[@id='00N200000096vA4']")));
		ContactType.selectByVisibleText("Landlord");

		Select LeadSource= new Select(driver.findElement(By.xpath(".//*[@id='lea5']")));
		LeadSource.selectByVisibleText("Direct");

		Select ExistingBgCustomer= new Select(driver.findElement(By.xpath(".//*[@id='00N20000009XwHA']")));
		ExistingBgCustomer.selectByVisibleText("Both");

		Select CardPaymentType= new Select(driver.findElement(By.xpath(".//*[@id='00N20000009YcO5']")));
		CardPaymentType.selectByVisibleText("Pre-Auth");

		WebElement doNotCall = driver.findElement(By.xpath(".//*[@id='lea27']"));
		doNotCall.click();

		WebElement doNotMail = driver.findElement(By.xpath(".//*[@id='00N200000096vEu']"));
		doNotMail.click();

		WebElement saveButtonLead = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
		saveButtonLead.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void verifyLeadCreated(){

		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");
		//Add More code to verify some values autopopulated on the lead
	}


	@Test(priority = 3)
	public void AddCustomerPack(){

		WebElement LeadNewCustomerPack = driver.findElement(By.name("new_customer_pack"));
		LeadNewCustomerPack.click();

		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, env.CustomerPackEditTitle);

		WebElement Pack = driver.findElement(By.xpath(".//*[@id='CF00N20000009XIx9']"));
		Pack.sendKeys(testd.PackHAH2);

		//Select PackOption= new Select(driver.findElement(By.xpath(".//*[@id='00N20000009YYPs']")));
		//PackOption.selectByVisibleText("Single Channel"); 

		WebElement CustomerPackSave = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
		CustomerPackSave.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");

	}

	@Test(priority = 4)
	public void AddCustomerPackSelfie(){

		WebElement LeadNewCustomerPack = driver.findElement(By.name("new_customer_pack"));
		LeadNewCustomerPack.click();

		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, env.CustomerPackEditTitle);

		WebElement Pack = driver.findElement(By.xpath(".//*[@id='CF00N20000009XIx9']"));
		Pack.sendKeys(testd.PackHAH2Selfie);

			Select PackOption= new Select(driver.findElement(By.xpath(".//*[@id='00N20000009YYPs']")));
		PackOption.selectByVisibleText("Single Channel"); 

		WebElement CustomerPackSave = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
		CustomerPackSave.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");

	}

	@Test(priority = 5)
	public void AddAddress(){

		WebElement LeadNewAddress = driver.findElement(By.name("newaddressfromlead"));
		LeadNewAddress.click();

		// env.actualTitle = driver.getTitle();
		//	Assert.assertEquals(env.actualTitle, env.AddressEditTitle);

		WebElement AdressLine1 = driver.findElement(By.xpath(".//*[@id='pgAddress:frmMain:pgbAddressDetail:pgbAddressInformation:line1']"));
		AdressLine1.sendKeys(testd.AddressLine1);

		WebElement AddressTown = driver.findElement(By.xpath(".//*[@id='pgAddress:frmMain:pgbAddressDetail:pgbAddressInformation:city']"));
		AddressTown.sendKeys(testd.AddressTown);

		WebElement Postcode = driver.findElement(By.xpath(".//*[@id='pgAddress:frmMain:pgbAddressDetail:pgbAddressInformation:postcode']"));
		Postcode.sendKeys(testd.Postcode);

		// WebElement PCAnywhere = driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div[1]"));
		//	PCAnywhere.click(); 	



		//	WebElement HiddenAdressLine1 = driver.findElement(By.xpath(".//*[@id='Name']"));
		// HiddenAdressLine1.sendKeys(testd.AddressLine1);	


		// Select AddressType = new Select(driver.findElement(By.xpath(".//*[@id='00N20000008R5wL_unselected']")));
		// AddressType.selectByVisibleText("Installation");
		// AddressType.selectByVisibleText("Billing");
		// WebElement AddressTypePicklistRightArrow = driver.findElement(By.xpath(" .//*[@id='00N20000008R5wL_right_arrow']"));
		// AddressTypePicklistRightArrow.click();

		WebElement AddressSave = driver.findElement(By.xpath(".//*[@id='pgAddress:frmMain:pgbAddressDetail:j_id28']/input[1]"));
		AddressSave.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Boolean CustomerPackRelatedList = driver.findElement(By.linkText("HAH - £199")).isDisplayed();
		 	Assert.assertEquals(CustomerPackRelatedList, "True");
		 	System.out.println(CustomerPackRelatedList);*/
		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");


	}

	@Test(priority = 6)
	public void AddJobLead(){

		WebElement LeadNewJob = driver.findElement(By.name("newjobfromleadandopportunity"));
		LeadNewJob.click();

		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, env.JobEditTitle);

		WebElement JobRefNum = driver.findElement(By.xpath(".//*[@id='00N20000008NxhZ']"));
		JobRefNum.sendKeys(testd.JobRN);

		// WebElement JobAddress = driver.findElement(By.xpath(".//*[@id='CF00N20000009XwH8']"));
		//JobAddress.sendKeys(testd.AddressLine1);
        System.out.println(testd.ScheduleDate);
		WebElement JobSchDate = driver.findElement(By.xpath(".//*[@id='00N200000096fOo']"));
		JobSchDate.sendKeys(testd.ScheduleDate);

		WebElement JobSchSlot = driver.findElement(By.xpath(".//*[@id='00N200000096fOy']"));
		JobSchSlot.sendKeys("AM");

		WebElement JobSave = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
		JobSave.click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");

	} 

	/*
   @Test(priority = 6)
	public void AddJobLead1(){

		WebElement LeadNewJob = driver.findElement(By.name("newjobfromleadandopportunity"));
			LeadNewJob.click();

		 env.actualTitle = driver.getTitle();
		 	Assert.assertEquals(env.actualTitle, env.JobEditTitle);

		 WebElement JobRefNum = driver.findElement(By.xpath(".//*[@id='00N20000008NxhZ']"));
		 JobRefNum.sendKeys(testd.JobRN1);

		// WebElement JobAddress = driver.findElement(By.xpath(".//*[@id='CF00N20000009XwH8']"));
		 //JobAddress.sendKeys(testd.AddressLine1);

		 WebElement JobSchDate = driver.findElement(By.xpath(".//*[@id='00N200000096fOo']"));
		 JobSchDate.sendKeys(testd.ScheduleDate);

		 WebElement JobSchSlot = driver.findElement(By.xpath(".//*[@id='00N200000096fOy']"));
		 JobSchSlot.sendKeys("AM");

		 WebElement JobSave = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[1]"));
		 	JobSave.click();

		 	 try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
				  e.printStackTrace();
				}
		 	env.actualTitle = driver.getTitle();
			Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");

	} */
	/*
   @Test(priority = 7)
	public void ProcessPayment(){

		WebElement ProcessPaymentLead = driver.findElement(By.name("processpayment"));
		ProcessPaymentLead.click();

	    WebElement PaymentTitle = driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock']/div[1]/table/tbody/tr/td[1]"));
		 env.actualTitle = PaymentTitle.getText();

		 Select CardType= new Select(driver.findElement(By.name("thePage:paymentForm:paymentBlock:newSection:CardType")));
		 CardType.selectByVisibleText("Visa");


		 WebElement CardNumber = driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock:newSection:cardNumber']"));
		 CardNumber.sendKeys(testd.CardNumber);

		 WebElement CardSecurity = driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock:newSection:securityCode']"));
		 CardSecurity.sendKeys(testd.CardSecurity);

		 Select CardExpiryMonth= new Select(driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock:newSection:dateSectionItem:expiryMonth']")));
		 CardExpiryMonth.selectByVisibleText("12");

		 Select CardExpiryYear= new Select(driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock:newSection:dateSectionItem:expiryYear']")));
		 CardExpiryYear.selectByVisibleText("2020");

		 WebElement CardHoldername = driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock:newSection:cardHolderName']"));
		 CardHoldername.sendKeys(testd.Name);


		 WebElement TakePayment = driver.findElement(By.xpath(".//*[@id='thePage:paymentForm:paymentBlock:theButton:MakePayment']"));
		 	TakePayment.click();

		 	 try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
				  e.printStackTrace();
				}
		 	env.actualTitle = driver.getTitle();
			Assert.assertEquals(env.actualTitle, "Lead: Mr "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");

	} 
	 */

	@Test(priority = 8)
	public void ConvertLead(){
		WebElement LeadConvertButton = driver.findElement(By.xpath(".//*[@id='topButtonRow']/input[6]"));
		LeadConvertButton.click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		env.actualTitle = driver.getTitle();
		Assert.assertEquals(env.actualTitle, "Account: "+testd.Fname+" "+testd.Lname+" ~ salesforce.com - Unlimited Edition");
		System.out.println(env.actualTitle);

		/*//Code to fetch ID	
		env.CurrentUrl= driver.getCurrentUrl();
		//System.out.println(env.CurrentUrl);
		String Id= env.CurrentUrl.replace("https://emea.salesforce.com/","").replace("https://cs18.salesforce.com/","").substring(0,15);
		//String Trid= Id.substring(0,15);
		System.out.println("ID is: "+Id);

		 */

	}

/*	@Test(priority = 9)
	public void VerifyAccountRelatedLists(){

		//Code to fetch ID	
		env.CurrentUrl= driver.getCurrentUrl();
		String Id= env.CurrentUrl.replace("https://emea.salesforce.com/","").replace("https://cs18.salesforce.com/","").substring(0,15);
		System.out.println(Id);

		//Oppty Related List	
		WebElement AccRlOpptyName = driver.findElement(By.xpath(".//*[@id='"+Id+"_RelatedOpportunityList_body']/table/tbody/tr[2]/th/a"));
		Assert.assertEquals(AccRlOpptyName.getText(), testd.Name+" - "+testd.modifiedDate);

		WebElement AccRlOpptyStage = driver.findElement(By.xpath(".//*[@id='"+Id+"_RelatedOpportunityList_body']/table/tbody/tr[2]/td[2]"));
		Assert.assertEquals(AccRlOpptyStage.getText(), "Closed Won");

		WebElement AccRlOpptyAmount = driver.findElement(By.xpath(".//*[@id='"+Id+"_RelatedOpportunityList_body']/table/tbody/tr[2]/td[3]"));
		Assert.assertEquals(AccRlOpptyAmount.getText(), "£199.00");


		//WebElement AccRlOpptyCloseDate = driver.findElement(By.xpath(".//*[@id='"+Id+"_RelatedOpportunityList_body']/table/tbody/tr[2]/td[4]"));
		//Assert.assertEquals(AccRlOpptyCloseDate.getText(), date);
		System.out.println("All is Well");	

		AccRlOpptyName.click();



	}

*/

	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
}
