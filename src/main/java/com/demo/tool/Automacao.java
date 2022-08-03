package com.demo.tool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automacao {
	
	protected WebDriver webdriver;
	protected String nomenavegador;
	protected WebElement elemento;
	
	public Automacao() {
		webdriver=null;
		nomenavegador=null;
		elemento=null;
		this.configuracao();
	}
	
	public void configuracao() {
		WebDriverManager.chromedriver().setup();
		
	}
	
	public Boolean abrirnavegador(String tiponavegador) {
		if(tiponavegador.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.webdriver", "C:\\Users\\Notebook\\Projetos\\drivers\\chromedriver.exe");
			webdriver=new ChromeDriver();
		}
		webdriver.manage().window().maximize();
		return true;
	}
	
	public Boolean irparapagina(String urlsite) {
		
		System.out.println(urlsite);
		webdriver.get(urlsite);
	
		WebElement make = webdriver.findElement(By.id("make"));
		Select selectMake = new Select(make);
		selectMake.selectByIndex(1);
		
		WebElement model = webdriver.findElement(By.id("model"));
		Select selectModel = new Select(model);
		selectModel.selectByIndex(3);
		
		WebElement cylinder_capacity = webdriver.findElement(By.id("cylindercapacity"));
		cylinder_capacity.sendKeys("10");
		
		WebElement engine_performance = webdriver.findElement(By.id("engineperformance"));
		engine_performance.sendKeys("20");
		
		WebElement dateofmanufacture = webdriver.findElement(By.id("dateofmanufacture"));
		dateofmanufacture.sendKeys("11/22/2002");
		
		WebElement numberofseats = webdriver.findElement(By.id("numberofseats"));
		Select selectnumberofseats = new Select(numberofseats);
		selectnumberofseats.selectByIndex(3);
		
		WebElement righthanddriveyes=webdriver.findElement(By.id("righthanddriveyes"));
		WebElement parent = righthanddriveyes.findElement(By.xpath("./.."));
		parent.click();
		
		WebElement numberofseatsmotorcycle = webdriver.findElement(By.id("numberofseatsmotorcycle"));
		Select selectnumberofseatsmotorcycle = new Select(numberofseatsmotorcycle);
		selectnumberofseatsmotorcycle.selectByIndex(2);
			
		WebElement fuel_type = webdriver.findElement(By.id("fuel"));
		Select selectfuel_type = new Select(fuel_type);
		selectfuel_type.selectByIndex(2);
			
		WebElement payload = webdriver.findElement(By.id("payload"));
		payload.sendKeys("34");
			
		WebElement totalweight = webdriver.findElement(By.id("totalweight"));
		totalweight.sendKeys("150");
		
		WebElement listprice = webdriver.findElement(By.id("listprice"));
		listprice.sendKeys("600");
		
		WebElement licenseplatenumber = webdriver.findElement(By.id("licenseplatenumber"));	
		licenseplatenumber.sendKeys("76");
		
		WebElement annualmileage = webdriver.findElement(By.id("annualmileage"));
		annualmileage.sendKeys("500");

		WebElement nextenterinsurantdata = webdriver.findElement(By.id("nextenterinsurantdata"));
		nextenterinsurantdata.click();
		
		WebElement firstname = webdriver.findElement(By.id("firstname"));
		firstname.sendKeys("Luana");
			
		WebElement lastname= webdriver.findElement(By.id("lastname"));
		lastname.sendKeys("daFrancaVieira");
	
		WebElement birthdate = webdriver.findElement(By.id("birthdate"));
		birthdate.sendKeys("11/22/2002");
		
		WebElement gendermale=webdriver.findElement(By.id("gendermale"));
		WebElement parent2 = gendermale.findElement(By.xpath("./.."));
		parent2.click();
		
		WebElement streetaddress= webdriver.findElement(By.id("streetaddress"));
		streetaddress.sendKeys("Pituba");
		
		WebElement country = webdriver.findElement(By.id("country"));
		Select selectcountry = new Select(country);
		selectcountry.selectByIndex(2);
		
		WebElement zipcode= webdriver.findElement(By.id("zipcode"));
		zipcode.sendKeys("8115000");
		
		WebElement city= webdriver.findElement(By.id("city"));
		city.sendKeys("Salvador");
	
		WebElement occupation = webdriver.findElement(By.id("occupation"));
		Select selectoccupation = new Select(occupation);
		selectoccupation.selectByIndex(1);
		
		WebElement speeding=webdriver.findElement(By.id("speeding"));
		WebElement parent3 = speeding.findElement(By.xpath("./.."));
		parent3.click();
		
		WebElement website= webdriver.findElement(By.id("website"));
		website.sendKeys("www.google.com.br");
	
		WebElement picturecontainer= webdriver.findElement(By.id("picturecontainer"));
		picturecontainer.sendKeys("C:\\Users\\Notebook\\eclipse-workspace\\POM\\DEUS.png");
		
		WebElement nextenterproductdata = webdriver.findElement(By.id("nextenterproductdata"));
		nextenterproductdata.click();
		
		WebElement startdate = webdriver.findElement(By.id("startdate"));
		startdate.sendKeys("07/07/2024");
				
		WebElement insurancesum = webdriver.findElement(By.id("insurancesum"));
		Select selectinsurancesum = new Select(insurancesum);
		selectinsurancesum.selectByIndex(1);
		
		
		WebElement meritrating = webdriver.findElement(By.id("meritrating"));
		Select selectmeritrating = new Select(meritrating);
		selectmeritrating.selectByIndex(1);
		
		
		WebElement damageinsurance = webdriver.findElement(By.id("damageinsurance"));
		Select selectdamageinsurance = new Select(damageinsurance);
		selectdamageinsurance.selectByIndex(2);
	
		
		WebElement EuroProtection=webdriver.findElement(By.id("EuroProtection"));
		WebElement parent4 = EuroProtection.findElement(By.xpath("./.."));
		parent4.click();
		
		WebElement courtesycar = webdriver.findElement(By.id("courtesycar"));
		Select selectcourtesycar = new Select(courtesycar);
		selectcourtesycar.selectByIndex(2);
		
		WebElement nextselectpriceoption= webdriver.findElement(By.id("nextselectpriceoption"));
		nextselectpriceoption.click();
		
		
		WebElement selectgold=webdriver.findElement(By.id("selectgold"));
		WebElement parent5 = selectgold.findElement(By.xpath("./.."));
		parent5.click();
		
		//WebElement content=webdriver.findElement(By.id("downloadquote"));
		//WebElement parent6 = content.findElement(By.xpath("./.."));
	    //parent6.click();
		
		//WebElement content=webdriver.findElement(By.id("viewquote"));
		//content.click();
		
		WebElement content=webdriver.findElement(By.id("downloadquote"));
		content.click();
		
		//WebElement content=webdriver.findElement(By.id("site-content"));
		//content.click();
		
		//WebElement viewquote = webdriver.findElement(By.id("downloadquote"));
		//Select selectviewquote = new Select(viewquote);
		//selectviewquote.selectByIndex(0);
		
		//id="site-content"
				
				
		WebElement nextsendquote= webdriver.findElement(By.id("nextsendquote"));
		nextsendquote.click();
		
	
		WebElement email= webdriver.findElement(By.id("email"));
		email.sendKeys("luanafvieira@yahoo.com.br");
		
		WebElement phone= webdriver.findElement(By.id("phone"));
		phone.sendKeys("997307010");
		
		WebElement username= webdriver.findElement(By.id("username"));
		username.sendKeys("luanafvieira");
		
		WebElement password= webdriver.findElement(By.id("password"));
		password.sendKeys("Accenture#156");
		
		
		WebElement confirmpassword= webdriver.findElement(By.id("confirmpassword"));
		confirmpassword.sendKeys("Accenture#156");
		
		return true;
			
	}
	
	public void fecharnavegador() {
		webdriver.quit();
		
	}

}
