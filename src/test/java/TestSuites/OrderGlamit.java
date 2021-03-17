package TestSuites;

import static org.junit.Assert.fail;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AllMethods;
import pageObjects.Methods;
import resources.base;

public class OrderGlamit extends base{
	  JavascriptExecutor js;
	  public static Logger log =LogManager.getLogger(base.class.getName());


	  @BeforeTest
		public void initialize() throws IOException
		{

			 driver =initializeDriver();
			 log.info("Driver is initialized");
				
			driver.get(prop.getProperty("url2"));
			log.info("Navigated to Home page");
		}
	  
	  
	  @Test
	  public void Mimos() throws Exception {
	    driver.get("https://tienda.mimo.com.ar/");
	    for (int second = 0;; second++) {
	    	if (second >= 60) fail("timeout");
	    	Thread.sleep(1000);
	    

	    driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
	    driver.findElement(By.linkText("Kids")).click();
	    driver.findElement(By.linkText("Minimimo")).click();
	    driver.findElement(By.linkText("Accesorios")).click();
	    driver.findElement(By.linkText("Calzado")).click();
	    driver.findElement(By.linkText("Gift Cards")).click();
	    driver.findElement(By.linkText("Invierno")).click();
	    driver.findElement(By.xpath("//li[@id='Invierno']/ul/li/a/span")).click();
	    driver.findElement(By.xpath("//dl[@id='narrow-by-list']/li/dt")).click();
	    String catalog = driver.findElement(By.xpath("//dl[@id='narrow-by-list']/li/dd/ol/li")).getText();
	    driver.findElement(By.xpath("//dl[@id='narrow-by-list']/li[8]/dt")).click();
	    driver.findElement(By.linkText("4")).click();
	    driver.findElement(By.linkText("6")).click();
	    driver.findElement(By.id("product-price-346865")).click();
	    new Select(driver.findElement(By.id("attribute349"))).selectByVisibleText("Army Claro");
	    	Thread.sleep(1000);
	    

	    driver.findElement(By.id("swatch5061")).click();
	    driver.findElement(By.xpath("//img[contains(@src,'https://statics.glamit.com.ar/media/catalog/product/cache/55/thumbnail/92x108/9df78eab33525d08d6e5fb8d27136e95/m/i/mimo_i20j4007_6u_4.jpg')]")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.findElement(By.id("attribute390")).click();
	    new Select(driver.findElement(By.id("attribute390"))).selectByVisibleText("03 (2-3 años)");
	    driver.findElement(By.id("attribute390")).click();
	    new Select(driver.findElement(By.id("attribute349"))).selectByVisibleText("Army Claro");
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.findElement(By.linkText("Ver carrito de compras")).click();
	    driver.findElement(By.id("coupon_code")).click();
	    driver.findElement(By.id("coupon_code")).clear();
	    driver.findElement(By.id("coupon_code")).sendKeys("testing");
	    driver.findElement(By.name("pin_number")).clear();
	    driver.findElement(By.name("pin_number")).sendKeys("testing");
	    driver.findElement(By.name("security_code")).clear();
	    driver.findElement(By.name("security_code")).sendKeys("testing");
	    driver.findElement(By.name("use_amount")).clear();
	    driver.findElement(By.name("use_amount")).sendKeys("testing");
	    driver.findElement(By.xpath("(//input[@value='Validar'])[2]")).click();
	  }
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  }

	  
	  }
	

