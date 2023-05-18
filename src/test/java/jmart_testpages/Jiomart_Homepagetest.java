package jmart_testpages;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jiomartpages.Jiomart_Objectpage;

public class Jiomart_Homepagetest extends Jiomart_Objectpage
{
	Jiomart_Objectpage obj ; 
	static ExtentTest log ;
	static ExtentReports report ;
	
	@BeforeSuite
	public void startTest()
	{
		report = new ExtentReports("C:\\Users\\skumari\\.jenkins\\workspace\\Jiomart\\homepage.html",true);
 	}
	
	@BeforeClass
	public void Homepage() throws IOException
	{
		Launchpage();
		obj = new Jiomart_Homepagetest();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test(priority=1)
	void verifyLogo() throws InterruptedException
	{
		log = report.startTest("Verify Jio Mart logo is displayed");
		boolean logo = obj.logo().isDisplayed();
        System.out.println(logo);
		log.log(LogStatus.PASS, "Test Case passed");
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	void verifyTitle()
	{
		log = report.startTest("Verify Title for Jio Mart is visible ");
		String ExpectedTtile = "JioMart: India's online shopping destination";
		Assert.assertEquals(ExpectedTtile, driver.getTitle());
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=3)
	void checkHeadermenu() throws InterruptedException
	{
		log = report.startTest("Verify Location text is displayed");
		boolean Locationtext = obj.Locationtext().isDisplayed();
		System.out.println("Location text is visible : "+Locationtext);
		boolean search = obj.Searchbutton().isDisplayed();
		System.out.println("Search button is visible : "+search);
		Assert.assertEquals(driver.getTitle(), "JioMart: India's online shopping destination");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=4)
	void checkHeaderButton()
	{
		log = report.startTest("Verify Cartbutton & sign in button is displayed");
		boolean verifycart = obj.Cartbutton().isDisplayed();
		System.out.println("Cart button is visible : "+verifycart);
		boolean verifySignin = obj.Signinbutton().isDisplayed();
		System.out.println("Signin button is visible : "+verifySignin);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=5)
	void groceryButton() throws InterruptedException
	{
		log = report.startTest("Verify Groceries button is functional");
		boolean item1 = obj.clickitem1().isDisplayed();
		System.out.println("grocery button navigate to next page : "+item1);
		obj.clickitem1().click();
		Assert.assertEquals(driver.getTitle(), "JioMart - Best Online Grocery Store for Your Daily Needs");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=6)
	void fruitsButton() throws InterruptedException
	{
		log = report.startTest("Verify Premium fruits button is functional");
		boolean item2 = obj.clickitem2().isDisplayed();
		System.out.println("Premium fruits button navigate to next page : "+item2);
		obj.clickitem2().click();
		Assert.assertEquals(driver.getTitle(), "Premiumfruits - JioMart");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=7)
	void homeKitchenButton() throws InterruptedException
	{
		log = report.startTest("Verify Home & Kitchen button is functional");
		boolean item3 = obj.clickitem3().isDisplayed();
		System.out.println("home and kitchen button navigate to next page : "+item3);
		obj.clickitem3().click();
		Assert.assertEquals(driver.getTitle(), "Homeandkitchen - JioMart");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=8)
	void fashionButton() throws InterruptedException
	{
		log = report.startTest("Verify Fashion button is functional");
		boolean item4 = obj.clickitem4().isDisplayed();
		System.out.println("fashion button navigate to next page : "+item4);
		obj.clickitem4().click();
		Assert.assertEquals(driver.getTitle(), "JioMart Online Shopping - Fashion Apparel for Men, Women and Kids");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=9)
	void electronicsButton() throws InterruptedException
	{
		log = report.startTest("Verify Electronics button is functional");
		boolean item5 = obj.clickitem5().isDisplayed();
		System.out.println("Electronics button navigate to next page : "+item5);
		obj.clickitem5().click();
		Assert.assertEquals(driver.getTitle(), "JioMart Electronic Online Shopping");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=10)
	void beautyButton() throws InterruptedException
	{
		log = report.startTest("Verify Beauty button is functional");
		boolean item6 = obj.clickitem6().isDisplayed();
		System.out.println("Beauty button navigate to next page : "+item6);
		obj.clickitem6().click();
		Assert.assertEquals(driver.getTitle(), "JioMart - Beauty Products Online Shopping");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=11)
	void homeImproveButton() throws InterruptedException
	{
		log = report.startTest("Verify Home improvement button is functional");
		boolean item7 = obj.clickitem7().isDisplayed();
		System.out.println("Home improvement button navigate to next page : "+item7);
		obj.clickitem7().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/homeimprovement/8583");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=12)
	void sportsToyButton() throws InterruptedException
	{
		log = report.startTest("Verify Sports Toy&Luggage button is functional");
		boolean item8 = obj.clickitem8().isDisplayed();
		System.out.println("Sports Toy&Luggage button navigate to next page : "+item8);
		obj.clickitem8().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/c/sportstoysluggage/8584");
		Thread.sleep(2000);
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=13,enabled=false)
	void checkSlidebutton() throws InterruptedException
	{
		log = report.startTest("Verify Nextslide button is working");
		Thread.sleep(2000);
		obj.clicknextslide().click();
		obj.clicknextslide().click();
		System.out.println("Next slide button working properly ");
		Thread.sleep(2000);
		obj.clickpreviousslide().click();
		obj.clickpreviousslide().click();
		System.out.println("Previous slide button working properly ");
		Assert.assertEquals(driver.getTitle(), "JioMart: India's online shopping destination");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=14,enabled=false)
	void getTimer()
	{
		log = report.startTest("Verify Timer is working");
		String timer = obj.gettimer().getText();
		System.out.println("Sale starts in : "+timer);
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
		log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=15)
	void countFooterMenu1()
	{
	log = report.startTest("Count total items from footer menu1 ");
	int menu1 = obj.getfootermenu1().size();
	System.out.println("All items from All Categories : "+menu1);
	for(WebElement allitems :obj.getfootermenu1())
	{
		System.out.println(allitems.getText());
	}
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=16)
	void countFooterMenu2()
	{
	log = report.startTest("Count total items from footer menu2 ");
	int menu2 = obj.getfootermenu2().size();
	System.out.println("All items from Popular Categories : "+menu2);
	for(WebElement allitems :obj.getfootermenu2())
	{
		System.out.println(allitems.getText());
	}
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=17)
	void countFooterMenu3()
	{
	log = report.startTest("Count total items from footer menu3 ");
	int menu3 = obj.getfootermenu3().size();
	System.out.println("All items from Customer Account : "+menu3);
	for(WebElement allitems :obj.getfootermenu3())
	{
		System.out.println(allitems.getText());
	}
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=18)
	void countFooterMenu4()
	{
	log = report.startTest("Count total items from footer menu4 ");
	int menu4 = obj.getfootermenu4().size();
	System.out.println("All items from Help & Support : "+menu4);
	for(WebElement allitems :obj.getfootermenu4())
	{
		System.out.println(allitems.getText());
	}
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.jiomart.com/");
	log.log(LogStatus.PASS, "Test Case passed");
	}
	
	@Test(priority=19)
	void checkLink1() throws InterruptedException
	{
		log = report.startTest("Verify link1 is working ");
		obj.clicklink1().click();
		Assert.assertEquals(driver.getTitle(), "JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	@Test(priority=20,enabled=false)
	void checkLink2() throws InterruptedException
	{
		log = report.startTest("Verify link2 is working ");
		Thread.sleep(2000);
		obj.clicklink2().click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Kitchen_fest_2_25_11 - JioMart");
		log.log(LogStatus.PASS, "Test Case passed");
		driver.navigate().back();
	}
	
	
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			log.log(LogStatus.FAIL, "Test Case failed"+result.getName());
			log.log(LogStatus.FAIL, "Test Case failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			log.log(LogStatus.SKIP, "Test Case failed"+result.getName());
			log.log(LogStatus.SKIP, "Test Case failed"+result.getThrowable());
		}
	}
	
	@AfterSuite
	void EndTest()
	{
	report.endTest(log);	
	report.flush();
	// report.close();
	obj.close();
	}
}
