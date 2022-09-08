package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_WebDriverBasicFf {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","C:\\Software\\Drivers\\geckodriver.exe");

        WebDriver Driver = new FirefoxDriver();


    }
}