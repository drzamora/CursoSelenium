package com.opensource.admin.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;



public class TC003_Admin_AddNewUser {
	
 @BeforeTest
 public void beforeTest() {
 }	
	
	
  @Test
  public void TC003_Admin_AddNewUser_TC() {
	  
	  //DATA GENERATION
	  int random = (int)(Math.random()*1000);
	  String userName = "Richard" + random; 
	  
	  // STEP 1
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Abrir página web OrangeHRM");
	  //Establece las propiedades del sistema y la ruta de ChromeDriver
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  // Inicializa ChromeDriver
	  WebDriver driver = new ChromeDriver();
	  //Navega a la url 
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  //Maximiza la ventana actual
	  driver.manage().window().maximize();
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  // STEP 2
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Ingrese nombre de usuario y contraseña");
	  // Inserta el texto "Admin", "admin123" y ejecuta la accion click en el bóton login
	  driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
	  driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  
	  // STEP 3
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Validar que ha iniciado sesión correctamente");
	  // Inicializa y espera hasta las condiciones esperadas :  tiempo de espera 30 segundos y/o sea visible el menu de la página
	  WebDriverWait wait = new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id = 'menu_dashboard_index']")));
	  
	
	  // STEP 4
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Click en Admin - Ir a la página de administración");
	  // Busca el elemento menu Admin y da click
	  driver.findElement(By.xpath("//a[@id = 'menu_admin_viewAdminModule']")).click();
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  // STEP 5
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Click en Agregar");
	  // Busca el elemento menu Admin y da click
	  driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	  
	  
	  // STEP 6
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Ingresar nombre de empleado válido");
	  // Busca el elemento menu Admin y da click
	  driver.findElement(By.xpath("//input[@id=\"systemUser_employeeName_empName\"]")).sendKeys("David Morris");
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 	  
	  
	  // STEP 7
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Ingresar nombre de usuario válido");
	  // Inserta  el texto Richard en el campo Username
	  driver.findElement(By.xpath("//input[@id=\"systemUser_userName\"]")).sendKeys(userName);
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	 	
	  
	  // STEP 8
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Ingresar contraseña y confirmar");
	  // Inserta  el texto Al1enw@re.2021 en el campo Password
	  driver.findElement(By.xpath("//input[@id=\"systemUser_password\"]")).sendKeys("Al1enw@re.2021");
	  // Inserta  el texto Al1enw@re.2021 en el campo Confirm Password
	  driver.findElement(By.xpath("//input[@id=\"systemUser_confirmPassword\"]")).sendKeys("Al1enw@re.2021");
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 	
	  
	  // STEP 9
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Clic en Save");
	  // Clic en el botón Save
	  driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	  
	  // STEP 10
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Buscar el nombre de usuario");
	  // Buscar el texto Richard en el campo Username
	  driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys(userName);
	  //Espera implícita se usa para decirle al controlador web que espere una cierta cantidad de tiempo.
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

	  // STEP 11
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Clic en el botón Buscar");
	  // Buscar el texto Richard en el campo Username
	  driver.findElement(By.xpath("//input[@id = 'searchBtn']")).click();
  	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//tbody")));

	  // STEP 12
	  //Reportero de TestNG es una clase incorporada en TestNG
	  Reporter.log("Verificar que el nombre de usuario exista en la tabla");
	  String actualUsername = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
      Assert.assertEquals(actualUsername, userName);
//    SoftAssert soft = new SoftAssert();
//    soft.assertEquals(actualUsername, userName);
      	
  	  // STEP 13
      //Reportero de TestNG es una clase incorporada en TestNG
  	  Reporter.log("Cerrar sesión");
  	  //Click en el menu welcome
  	  driver.findElement(By.xpath("//a[@id='welcome']")).click();
  	  //Buscar el texto Logout y dar clic
  	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  	  driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
  	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	  
  	  // STEP 14
  	  //Reportero de TestNG es una clase incorporada en TestNG
  	  Reporter.log("Cerrar Navegador");
  	  driver.close();
  	  
//  	  soft.assertAll();
  }

  @AfterTest
  public void afterTest() {
  }

}
