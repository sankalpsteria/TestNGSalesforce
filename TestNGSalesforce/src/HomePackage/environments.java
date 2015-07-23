package HomePackage;

public class environments {
	//Common Env variables
		public String baseUrl = "http://test.salesforce.com/";
		public String expectedTitle = "salesforce.com - Customer Secure Login Page";
		public String actualTitle = "";
		//Prodev2 Specific
		public String expectedCsaTitle ="Force.com Home Page ~ salesforce.com - Unlimited Edition";
		public String Prodev2Username= "sfdcsysadmin@bgch.co.uk.octopus.prodev2";
		public String Prodev2Password= "Liverpool98";
		//Production Specific
		public String ProdbaseUrl = "http://login.salesforce.com/";
		public String ProdexpectedCsaTitle ="Force.com Home Page ~ salesforce.com - Unlimited Edition";
		public String ProdUsername= "sfdcsysadmin@bgch.co.uk.octopuss";
		public String ProdPassword= "Liverpool98";
		public String ProdexpectedLeadsTitle ="Leads: Home ~ salesforce.com - Unlimited Edition";
		public String ProdexpectedLeadEditTitle ="Lead Edit: New Lead ~ salesforce.com - Unlimited Edition";
		public String CustomerPackEditTitle ="Customer Pack Edit: New Customer Pack ~ salesforce.com - Unlimited Edition";
		public String AddressEditTitle ="Address Edit: New Address ~ salesforce.com - Unlimited Edition";
		public String JobEditTitle ="Job Edit: New Job ~ salesforce.com - Unlimited Edition";
		public String CurrentUrl = null;
		//Test Specific
		public String TestUsername= "sfdcsysadmin@bgch.co.uk.octopus.test";
		public String TestPassword= "Liverpool98";
		public String StageUsername= "sfdcsysadmin@bgch.co.uk.octopus.staging";
		public String StagePassword= "Liverpool98";
}
