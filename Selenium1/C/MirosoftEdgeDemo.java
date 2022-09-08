package Selenium1.C;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MirosoftEdgeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Software\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
    }

}
