package HomePackage;

public class environments {
	//Common Env variables
		public String baseUrl = "http://test.salesforce.com/";
		public String expectedTitle = "Login | Salesforce";
		public String actualTitle = "";
		//Prodev2 Specific
		public String expectedCsaTitle ="Force.com Home Page ~ Salesforce - Unlimited Edition";
		public String Prodev2Username= "sfdcsysadmin@bgch.co.uk.octopus.prodev2";
		public String Prodev2Password= "Liverpool98";
		//Production Specific
		public String ProdbaseUrl = "http://login.salesforce.com/";
		public String ProdexpectedCsaTitle ="Force.com Home Page ~ Salesforce - Unlimited Edition";
		public String ProdUsername= "sfdcsysadmin@bgch.co.uk.octopuss";
		public String ProdPassword= "Liverpool98";
		public String ProdexpectedLeadsTitle ="Leads: Home ~ Salesforce - Unlimited Edition";
		public String ProdexpectedLeadEditTitle ="Lead Edit: New Lead ~ Salesforce - Unlimited Edition";
		public String CustomerPackEditTitle ="Customer Pack Edit: New Customer Pack ~ Salesforce - Unlimited Edition";
		public String AddressEditTitle ="Address Edit: New Address ~ Salesforce - Unlimited Edition";
		public String JobEditTitle ="Job Edit: New Job ~ Salesforce - Unlimited Edition";
		public String CurrentUrl = null;
		//Test Specific
		public String TestUsername= "sfdcsysadmin@bgch.co.uk.octopus.test";
		public String TestPassword= "Liverpool98";
		public String StageUsername= "sfdcsysadmin@bgch.co.uk.octopus.staging";
		public String StagePassword= "Liverpool98";
		public String UatUsername= "sfdcsysadmin@bgch.co.uk.octopus.uat";
		public String UatPassword= "Liverpool98";
		public String V6Username= "deepak.gupta@bgch.co.uk.octopus.v6";
		public String V6Password= "bgch@12345";
}
