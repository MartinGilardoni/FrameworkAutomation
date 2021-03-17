package TestSuites;


import org.testng.Assert;
import org.testng.annotations.*;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Methods;
import resources.base;

public class Levis extends base{
	public WebDriver driver;
	  JavascriptExecutor js;

	 public static Logger log =LogManager.getLogger(base.class.getName());
	 
	///Botonera////
	 By menuhombre=By.cssSelector("#cat-hombre");
	 By buttonmenuhombre2=By.xpath("/html/body/header/div/nav/ul/li[1]");

	 By menumujer=By.cssSelector("#cat-mujer");
	 By buttonmenumujer2=By.xpath("/html/body/header/div/nav/ul/li[2]");

	 By menukids=By.cssSelector("#cat-kids");
	 By buttonmenukids2=By.xpath("/html/body/header/div/nav/ul/li[3]");

	 By menusale=By.cssSelector("#cat-sale");
	 By buttonmenusale2=By.xpath("/html/body/header/div/nav/ul/li[4]");

	 By menustories=By.cssSelector("#cat-stories");
	 By menustories2=By.xpath("/html/body/header/div/nav/ul/li[5]");

	 By menulookbook=By.cssSelector("#lookbooks");
	 By buttonmenulookbook2=By.xpath("/html/body/header/div/nav/ul/li[6]");

	 By menubuscar=By.cssSelector("#search_mini_form > div");
	 By buttonmenubuscar2=By.xpath("/html/body/header/div/aside/div/form/div");

	 By menumicarrito=By.cssSelector("#boton-carrito");
	 By menumicarrito2=By.xpath("/html/body/header/div/aside/div/a");

	 By menumicuenta=By.cssSelector("#mi-cuenta > a > i.icono-Avatar-Default.icono-2x.hide-logueado");
	 By menumicuenta2=By.xpath("/html/body/header/div/aside/div/div/a/i[1]");
	 
	 
	///camisashombre///

	 By categoriacamisas=By.cssSelector("#cat-1606");
	 By categoriacamisas2=By.xpath("/html/body/main/div/div[2]/div/div/ol/li[5]");

	 By camisamandarin=By.cssSelector("#the-13995");
	 By camisamandarin2=By.xpath("/html/body/main/div/section/article[43]");
	 By camisacubanoshirt=By.cssSelector("#the-14099");
	 By camisacubanoshirt2=By.xpath("/html/body/main/div/section/article[37]");
	 By camisasunsetonepocket=By.cssSelector("#the-14861");
	 By camisasunsetonepocket2=By.xpath("/html/body/main/div/section/article[23]");

	 ///filtroscamisashombre///

	 By filtrocamisaprecio=By.cssSelector("#narrow-by-list > li.atributo-Price.acordeon.abierto > ol > li");
	 By filtrocamisaprecio2=By.xpath("/html/body/main/div/div[2]/div/ul/li[3]/ol/li");
	 By filtrocamisacolor=By.cssSelector("#narrow-by-list > li.atributo-Color.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtrocamisacolor2=By.xpath("/html/body/main/div/div[2]/div/ul/li[4]/ol/li[1]");
	 By filtrocamisatalle=By.cssSelector("#narrow-by-list > li.atributo-Talle.atributo-filtrado.acordeon.abierto > ol > li:nth-child(2)");
	 By filtrocamisatalle2=By.xpath("/html/body/main/div/div[2]/div/ul/li[5]/ol/li[2]");

	 ///sweatersbuzoshombre///

	 By categoriasweatersybuzos=By.cssSelector("#cat-1607");
	 By categoriasweatersybuzos2=By.xpath("/html/body/main/div/div[2]/div/div/ol/li[6]");

	 By sweatersybuzoscrewneck=By.cssSelector("#the-15314");
	 By sweatersybuzoscrewneck2=By.xpath("/html/body/main/div/section/article[18]");
	 By sweatersybuzosiconzip=By.cssSelector("#the-5136");
	 By sweatersybuzosiconzip2=By.xpath("/html/body/main/div/section/article[15]");
	 By sweatersybuzoscrew=By.cssSelector("#the-10596");
	 By sweatersybuzoscrew2=By.xpath("/html/body/main/div/section/article[11]");

	 ///filtrossweaterybuzos///

	 By filtrosweatershoodie=By.cssSelector("#narrow-by-list > li.atributo-Estilo.atributo-filtrado.acordeon.abierto > ol > li:nth-child(2)");
	 By filtrosweatershoodie2=By.xpath("/html/body/main/div/div[2]/div/ul/li[2]/ol/li[2]");
	 By filtrosweatersprecio=By.cssSelector("#narrow-by-list > li.atributo-Price.acordeon.abierto > ol > li");
	 By filtrosweatersprecio2=By.xpath("/html/body/main/div/div[2]/div/ul/li[3]/ol/li");
	 By filtrosweaterscolor=By.cssSelector("#narrow-by-list > li.atributo-Color.atributo-filtrado.acordeon.abierto > ol > li");
	 By filtrosweaterscolor2=By.xpath("/html/body/main/div/div[2]/div/ul/li[4]/ol/li");
	 By filtrosweaterstalle=By.cssSelector("#narrow-by-list > li.atributo-Talle.atributo-filtrado.acordeon.abierto > ol > li:nth-child(2)");
	 By filtrosweaterstalle2=By.xpath("/html/body/main/div/div[2]/div/ul/li[5]/ol/li[2]");

	 ///camperashombres///

	 By categoriacamperas=By.cssSelector("#cat-1608");
	 By categoriacamperas2=By.xpath("/html/body/main/div/div[2]/div/div/ol/li[7]");

	 By camperamotojacket=By.cssSelector("#the-7773");
	 By camperamotojacket2=By.xpath("/html/body/main/div/section/article[5]");
	 By camperamilitarjacket=By.cssSelector("#the-10406");
	 By camperamilitarjacket2=By.xpath("/html/body/main/div/section/article[8]");
	 By camperastayloose=By.cssSelector("#the-13549");
	 By camperastayloose2=By.xpath("/html/body/main/div/section/article[11]");

	 ///filtroscamperas///

	 By filtrocamperatrucker=By.cssSelector("#narrow-by-list > li.atributo-Estilo.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtrocamperatrucker2=By.xpath("/html/body/main/div/div[2]/div/ul/li[2]/ol/li[1]");
	 By filtrocamperaprecio=By.cssSelector("#narrow-by-list > li.atributo-Price.acordeon.abierto > ol > li");
	 By filtrocamperaprecio2=By.xpath("/html/body/main/div/div[2]/div/ul/li[3]/ol/li");
	 By filtrocamperacolor=By.cssSelector("#narrow-by-list > li.atributo-Color.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtrocamperacolor2=By.xpath("/html/body/main/div/div[2]/div/ul/li[4]/ol/li[1]");
	 By filtrocamperatalle=By.cssSelector("#narrow-by-list > li.atributo-Talle.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtrocamperatalle2=By.xpath("/html/body/main/div/div[2]/div/ul/li[5]/ol/li[1]");

	 ///boxersymedias///

	 By categoriaboxersymedias=By.cssSelector("#cat-1610");
	 By categoriaboxersymedias2=By.xpath("/html/body/main/div/div[2]/div/div/ol/li[8]");

	 By boxersbrief=By.cssSelector("#the-15737");
	 By boxersbrief2=By.xpath("/html/body/main/div/section/article[1]");
	 By mediasregularcut=By.cssSelector("#the-6076");
	 By mediasregularcut2=By.xpath("/html/body/main/div/section/article[5]");
	 By boxersclassic=By.cssSelector("#the-3701");
	 By boxersclassic2=By.xpath("/html/body/main/div/section/article[13]");

	 ///filtrosboxersymedias///

	 By filtroboxerssocks=By.cssSelector("#narrow-by-list > li.atributo-Estilo.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtroboxerssocks2=By.xpath("/html/body/main/div/div[2]/div/ul/li[1]/ol/li[1]");
	 By filtroboxerscolor=By.cssSelector("#narrow-by-list > li.atributo-Color.atributo-filtrado.acordeon.abierto > ol > li:nth-child(2)");
	 By filtroboxerprecio=By.cssSelector("#narrow-by-list > li.atributo-Price.acordeon.abierto > ol > li");
	 By filtroboxerprecio2=By.xpath("/html/body/main/div/div[2]/div/ul/li[4]/ol/li");
	 By filtroboxertalle=By.cssSelector("#narrow-by-list > li.atributo-Talle.atributo-filtrado.acordeon.abierto > ol > li");
	 By filtroboxertalle2=By.xpath("/html/body/main/div/div[2]/div/ul/li[5]/ol/li");


	 ////accesorioshombres///

	 By categoriaaccesorios=By.cssSelector("#cat-1502");
	 By categoriaaccesorios2=By.xpath("/html/body/main/div/div[2]/div/div/ol/li[9]");

	 By serifcap=By.cssSelector("#the-15724");
	 By serfcap=By.xpath("/html/body/main/div/section/article[2]");
	 By basictab=By.cssSelector("#the-3893");
	 By basictab2=By.xpath("/html/body/main/div/section/article[5]");
	 By basicpullup=By.cssSelector("#the-3544");
	 By basicpullup2=By.xpath("/html/body/main/div/section/article[7]");

	 ///filtrosaccesorios///

	 By filtrosbelts=By.cssSelector("#narrow-by-list > li.atributo-Estilo.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtrosbelts2=By.xpath("/html/body/main/div/div[2]/div/ul/li[1]/ol/li[1]");
	 By filtroscolor=By.cssSelector("#narrow-by-list > li.atributo-Color.atributo-filtrado.acordeon.abierto > ol > li:nth-child(1)");
	 By filtroscolor2=By.xpath("/html/body/main/div/div[2]/div/ul/li[3]/ol/li[1]");
	 By filtrosprecio=By.cssSelector("#narrow-by-list > li.atributo-Price.acordeon.abierto");
	 By filtrosprecio2=By.
	 xpath("/html/body/main/div/div[2]/div/ul/li[4]");
	 By filtrostalle=By.cssSelector("#narrow-by-list > li.atributo-Talle.atributo-filtrado.acordeon.abierto > ol > li:nth-child(3)");
	 By filtrostalle2=By.xpath("/html/body/main/div/div[2]/div/ul/li[5]/ol/li[3]");


	 ///calzadohombres///


	 By categoriacalzado=By.cssSelector("#cat-2084");
	 By categoriacalzado2=By.xpath("/html/body/main/div/div[2]/div/div/ol/li[10]");

	 By olimpicslides=By.cssSelector("#the-15814");
	 By olimpicslides2=By.xpath("/html/body/main/div/section/article[5]");
	 By batwingslides=By.cssSelector("#the-15826");
	 By batwingslides2=By.xpath("/html/body/main/div/section/article[6]");

	 ///filtroscalzados///

	 By filtroscolor22=By.cssSelector("#narrow-by-list > li.atributo-Color.atributo-filtrado.acordeon.abierto > ol > li:nth-child(2)");
	 By filtroscolor23=By.xpath("/html/body/main/div/div[2]/div/ul/li[2]/ol/li[2]");
	 By filtrosprecio24=By.cssSelector("#narrow-by-list > li.atributo-Price.acordeon.abierto > ol > li");
	 By filtrosprecio25=By.xpath("/html/body/main/div/div[2]/div/ul/li[4]/ol/li");

	 

	 
	 //////
	 By Lucy=By.xpath("/html/body/snappylabs-chat//div/div/div[1]/div[1]");
	 By EscribirLucy = By.xpath("/html/body/snappylabs-chat//div/div/div[2]/div[3]/form/div[1]");
	 By sendLucy=By.xpath("/html/body/snappylabs-chat//div/div/div[2]/div[3]/form/div[2]/div/button/svg");
	 By escribirlu=By.cssSelector("#app > div > div.sc-chat-window.opened > div:nth-child(3) > form");
	By drop1=By.cssSelector(".breadcrumbs");
	
	
	
	@BeforeTest
	public void initialize() throws IOException
	{

		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url2"));
		log.info("Navigated to Home page");
	}




	
	@Test
	
	public void a2ELevis() throws IOException
	{
		Methods me=new Methods(driver);

		//one is inheritance
		// creating object to that class and invoke methods of it
		//compare the text from the browser with actual text.- Error..
		
		
			//URL
			visit("https://www.levi.com.ar/");
			
			 JavascriptExecutor js=(JavascriptExecutor) driver;
		       String domain_name=(String) js.executeScript("return document.domain");

		               System.out.println(domain_name);
		               
		               String sText =  js.executeScript("return document.documentElement.innerText;").toString();
					   System.out.println(sText);

					   


			//Navegability
			click(Lucy);
			click(Lucy);

			type("Hola Lucy", escribirlu);
			click(sendLucy);
			click(menukids);
			click(menumujer);
			click(menuhombre);
			getText(drop1);	
			
			click(menustories);
			click(menumicarrito);
			

			//Experiments
			
			Select dropdown=new Select(driver.findElement(By.cssSelector("#cat-hombre")));
			dropdown.selectByVisibleText("Camisas");
			dropdown.selectByVisibleText("Pantalones");
			dropdown.selectByVisibleText("Bermudas");
			
			 String Dropdowns = driver.findElement(By.cssSelector("#cat-sale")).getText();
			    assertEquals(Dropdowns, driver.findElement (By.cssSelector("#cat-sale")).getText());
			    System.out.println("Sale Dropdown: " +Dropdowns);
			    System.out.println("*******************************************************************");  

					
					 System.out.println("Test completed");


		}
		@Test
				
public void Zlevis ()  {
		
		
		//URL
			visit("https://www.levi.com.ar/");
			

		  

	         
		//
		click(menumujer);
		driver.findElement(By.xpath("//img[@alt='Button Front Utulity Skirt']")).click();
	    new Select(driver.findElement(By.id("attribute537"))).selectByVisibleText("Tofu");
	    driver.findElement(By.id("swatch7540")).click();
	    new Select(driver.findElement(By.id("attribute537"))).selectByVisibleText("Snooze Ya Lose");
	    new Select(driver.findElement(By.id("attribute546"))).selectByVisibleText("24");
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.linkText("Ir al carrito")).click();
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    driver.findElement(By.id("login-email")).click();
	    driver.findElement(By.id("login-email")).clear();
	    driver.findElement(By.id("login-email")).sendKeys("jmatar@glamit.com.ar");
	    driver.findElement(By.id("login-password")).click();
	    driver.findElement(By.id("login-password")).clear();
	    driver.findElement(By.id("login-password")).sendKeys("sarasa");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	  }

		    
		 @Test
		  public void RegisterUser() throws IOException {
		    driver.get("https://tienda.mimo.com.ar/customer/account/create/");
		    driver.findElement(By.id("firstname")).click();
		    driver.findElement(By.id("firstname")).clear();
		    driver.findElement(By.id("firstname")).sendKeys("Juan");
		    driver.findElement(By.id("lastname")).clear();
		    driver.findElement(By.id("lastname")).sendKeys("Cruz");
		    driver.findElement(By.id("email_address")).clear();
		    driver.findElement(By.id("email_address")).sendKeys("jaja@ja.com");
		    driver.findElement(By.id("confirm_email")).clear();
		    driver.findElement(By.id("confirm_email")).sendKeys("jaja@ja.com");
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys("123456");
		    driver.findElement(By.id("confirmation")).clear();
		    driver.findElement(By.id("confirmation")).sendKeys("123456");
		    driver.findElement(By.id("day")).click();
		    driver.findElement(By.id("day")).clear();
		    driver.findElement(By.id("day")).sendKeys("11");
		    driver.findElement(By.id("month")).clear();
		    driver.findElement(By.id("month")).sendKeys("11");
		    driver.findElement(By.id("year")).clear();
		    driver.findElement(By.id("year")).sendKeys("1111");
		    driver.findElement(By.id("gender")).click();
		    new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Hombre");
		    driver.findElement(By.id("gender")).click();
		    driver.findElement(By.xpath("//form[@id='form-validate']/div[3]/button/span/span")).click();
		  
		    driver.findElement(By.id("year")).sendKeys("2000");
		    driver.findElement(By.xpath("//form[@id='form-validate']/div[3]/button/span/span")).click();
			driver.findElement(By.xpath("//form[@id='form-validate']/div[2]/div/label")).click();
			System.out.println("This is Test");

			
		  }

			    

				
		  @Test
		  public void aaaa() {
			driver.get("https://apitester.com/checks/new");
			driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div[1]/div/div[4]/div[1]/div/div/input")).sendKeys("testapilevis1");
			driver.findElement(By.id("/html/body/div[9]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div[1]/div/div[4]/div[2]/div[1]/div[1]/div/input")).click();
			driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/div[1]/div/div[4]/div[2]/div[1]/div[1]/div/input")).clear();
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]/div/div[1]/div/div[4]/div[2]/div[1]/div[1]/div/input")).sendKeys("https://www.levi.com.ar/js/prototype/prototype.js?q=1568640131");
			
			String response = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[3]/div[2]/div/div/div[1]/div/div/div/div/div/div[2]/div/div/div[4]/div/div/div[2]/div/pre")).getText();
			String s2Text =  js.executeScript("return document.documentElement.innerText;").toString();
			
			System.out.println(s2Text);

		  }
	


		  @Test

  public void sarasa() {
    driver.get("https://tienda.mimo.com.ar/");
    driver.manage().window().setSize(new Dimension(1296, 696));
    {
      WebDriverWait wait = new WebDriverWait(driver, 3);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#slidedown-footer > .clearfix")));
    }
    driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 3);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contenidoPopup")));
    }
    driver.findElement(By.cssSelector("#contenidoPopup > .cerrar")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("#Kids > a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#Minimimo > a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#Accesorios > a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#Calzado > a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("#Calzado li:nth-child(1) .nombrecat")).click();
  }

		  
		
		
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	

	
}
