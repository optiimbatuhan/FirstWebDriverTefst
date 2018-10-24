package ua.pp.krotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Random;

public class BorlandTest extends Parametreler {
    String url = "\"https://demo.borland.com/InsuranceWebExtJS/";


    @Test
    public void SiteyeGirisyap() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");


            urlyegir();
            giris();
            bilgilerigir();
        driver.findElement(By.id("signup:signup")).click();
        driver.findElement(By.id("signup:continue")).click();
        driver.findElement(By.partialLinkText("Home")).click();
        driver.findElement(By.id("logout-form:details")).click();





    }
















}



