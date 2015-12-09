package com.somnath;

/**
 * Open Chrome browser using Selenium Webdriver!
 *
 */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.util.*;
import java.lang.Exception;

public class App {
    public static void main(String[] args) throws Throwable
    {
    	System.out.println("Launching the Browser");
        
        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        //driver.get("http://www.google.com");
       //Opens the given URL
    driver.get("https://www.ultimatix.net");
    Thread.sleep(1000);  // Let the user actually see something!
    System.out.println("Fetching the Title");
    System.out.println("Please Wait!!");
  //Returns the Title of Current Page
    String sTitle = driver.getTitle();
    System.out.println("My First Selenium Program");
    System.out.println("Title is = '"+sTitle+"'" );
    WebElement usernameBox = driver.findElement(By.id("USER"));
    usernameBox.sendKeys("OttoDrone@2015");
    Thread.sleep(500);
    WebElement passwordBox = driver.findElement(By.id("PASSWORD"));
    passwordBox.sendKeys("#February#2015");
    Thread.sleep(500);
    WebElement submitButton = driver.findElement(By.id("login_button"));
    submitButton.click();
    String loginTitle = driver.getTitle();
    System.out.println("Current Title is: '"+loginTitle+"'");
    System.out.println("Signing Off!!");

   //Closing the Browser
    
    /**try{
       System.out.println("Do u want to close?(Yes/No):");
       Scanner scan = new Scanner(System.in);
       String UserIp = scan.nextLine();
       if(UserIp == "Yes"){
       	driver.close();
       }
      }catch(Exception e){
    	e.printStackTrace();
    }*/
    System.exit(0);
}
}