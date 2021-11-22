package mainCode_E_learning;

	import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import e_learningPageObjects.E_learningLogin;
	import resources_E_learning.Base;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.And;
	
	
	public class MainCode_E_learning extends Base {
	
		
		
		 @Given("^Initialize the browser with chrome$")
		    public void initialize_the_browser_with_chrome() throws Throwable {
		        driver = initializeDriver();
		        
		    }

		 @Given("^Navigate to \"([^\"]*)\"$")
		    public void navigate_to_something(String url) throws Throwable {    
	            driver.get(url);
	            driver.manage().window().maximize();
	            
		    }

		    @When("^User enters (.+) and (.+) and login$")
		    public void user_enters_and_and_login(String username, String password) throws Throwable {
		    	E_learningLogin El= new E_learningLogin(driver);
	    		
				El.getAccount().sendKeys(username);
				El.getPassword().sendKeys(password);
		        El.getNext().click();
		        System.out.println("Login failed due to incorrect details");
		        //
		        
		   
		    }

		    @Then("^Verify that login is succesful completed$")
		    public void verify_that_login_is_succesful_completed() throws Throwable {
		       
		    }

		    @Then("^close the window$")
		    public void close_the_window() throws Throwable {
		       //driver.quit();
		    }
		    
		    
		  //Sign in
		    
		    @When("^User click on signup new page should open$")
		    public void user_click_on_signup_new_page_should_open() throws Throwable {
		        E_learningLogin El1= new E_learningLogin(driver);
		        
		        //El1.getSignin().click();
		        //El1.getOption1().click();
		      
		    }
		    
		    @When("^User should be able to enter  (.+), (.+)$")
		    public void user_should_be_able_to_enter_(String newusername, String newpassword) throws Throwable {
		    	// code to follow the course
		      
		    	E_learningLogin El1= new E_learningLogin(driver); 
		    	El1.getAccount().sendKeys(newusername);
				El1.getPassword().sendKeys(newpassword);
		        El1.getNext().click();
			    
		        
			    //SortCourses
 			    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			    El1.getSortCourse().click();
			    El1.getDescription().click();
			    El1.getEdit().click();
			    El1.getCreate().click();
			    El1.getName().sendKeys("Java Tutorial");
			    El1.getAdd().click();
			    
			     
			   
			    
	 // Course history
			    El1.getHome().click();
			    El1.getHistory().click();
			    El1.getDisplayCourse().click();
			    El1.getTesting().click();
			    
			    El1.getCoursedescription().click();
			    //Assert.assertTrue(driver.findElementEisDisplayed());
			    driver.navigate().back();
			    
			    El1.getAgenda().click();
			    driver.navigate().back();
			    
			    El1.getDocument().click();  //Documents
			    El1.getDoc().sendKeys("Dbms");
 			    El1.getD().click();
 			    El1.getClick1().click();
			    
			    El1.getLearningpath().click();//Learning
			    driver.navigate().back();
			    
			    El1.getLinks1().click();  // Links
			    driver.navigate().back();
			    
			    El1.getTests().click();   // Tests
			    El1.getMtest().click();
			     
			    El1.getPrTest().click();
			    El1.getBack1().click();
			     
			    El1.getAnnouncements().click();  //Announcements
			    driver.navigate().back();
			    
			    El1.getForums().click();         //Forums
			    El1.getForumsThread().click();
			    El1.getBackTo().click();               
			    El1.getGroupdoc().click();                  
			    El1.getSearchbox1().sendKeys("Chat");
			    
			    El1.getSubmit().click();
			   
			    El1.getChatfile().click();
			    
			    El1.getBack2().click(); 
			    
			    El1.getDropbox().click();                        //Dropbox
			    El1.getShare().click();
			    El1.getBack12().click();
			     
			    
			    El1.getUsers().click();                          //User
			    El1.getPgclick().click();
			    El1.getBack123().click();
			    
			    
			    El1.getGroups().click();                        //Groups
			    El1.getSearchbox().sendKeys("Group 0005");
			    El1.getSearchclick().click();
			    El1.getBack123().click();
			    //driver.findElement(By.linkText(""))
			     
			    
			    El1.getAssignments().click();                   //Assignments
			    El1.getAni().click();
			    El1.getBack20().click();
			    
			    
			    El1.getSurveys().click();                        //Survey
			    driver.navigate().back();
			    
			    El1.getWiki().click();                          //Wiki
			    El1.getAllpages().click();
			    El1.getLatestchanges().click();
			    El1.getBack03().click();
			    
			    
			    El1.getAssessments().click();                   //Assessment
			    El1.getDownload().click();
			    El1.getBack04().click();
			    
			    
			    El1.getGlossary().click();                     //Glossary
			    El1.getExport().click();
			    El1.getDownloadd().click();
			    driver.navigate().back();
			    El1.getLineview().click();
			    El1.getBack123().click();
			    
			    El1.getNotebook().click();                       //Notebook
			    El1.getCreatenote().click();
			    El1.getNotetitle().sendKeys("Automation Training");
			    El1.getAddnote().click();
			    El1.getBack123().click();
			    
			    El1.getSeliniumproject().click();                //SeliniumProject
			    El1.getWelcome().click();
			    El1.getBack123().click();
			        
			    
		    }


		    @Then("^User should be able to complete regsistration$")
		    public void user_should_be_able_to_complete_regsistration() throws Throwable {
		      
		    }

		}
								

	
