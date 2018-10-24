package ua.pp.krotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Random;

@Test
public class Parametreler {

    String url = "\"https://demo.borland.com/InsuranceWebExtJS/";

    public static WebDriver driver;



    @Test
    public static void urlyegir()
    {

        driver.get("https://demo.borland.com/InsuranceWebExtJS/");


    }




    @Test
    public void giris()
    {

        driver.findElement(By.id("login-form:signup")).click();



    }



    @Test
    public  void driver ()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @Test
    public  void bilgilerigir ()
    {
        for (int i=1; i<=1; i++)


        driver.findElement(By.id("signup:fname")).sendKeys("Batuhan");
        driver.findElement(By.id("signup:lname")).sendKeys("Kılıçoğlu");
        driver.findElement(By.id("BirthDate")).sendKeys("12/01/2000");

        WebElement email=driver.findElement(By.id("signup:email"));
        email.click();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        email.sendKeys("username"+randomInt+"@gmail.com");




        WebElement mailing=driver.findElement(By.id("signup:street"));
        email.click();
        Random randomGeneratorr = new Random();
        int randomIntt = randomGeneratorr.nextInt(1000);
        email.sendKeys("username"+randomInt+"@gmail.com");




        driver.findElement(By.id("signup:street")).sendKeys("Avcılar");
        driver.findElement(By.id("signup:city")).sendKeys("İstanbul");
        driver.findElement(By.id("signup:state")).sendKeys("California");
        driver.findElement(By.id("signup:zip")).sendKeys("34347");
        driver.findElement(By.id("signup:password")).sendKeys("13271327");

    }

    public class Chrome {

        public void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\driver");
            WebDriver driver = new ChromeDriver();


        }


    }

}
