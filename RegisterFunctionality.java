package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RegisterFunctionality extends Utils {
    public static void main(String[] args) {
        // Set up a path for a WebDriver
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\Updated Edgedriver\\msedgedriver.exe");
        // Create an instance for a WebDriver
        WebDriver driver = new EdgeDriver();
        // Navigate to webpage
        driver.get("https://demo.nopcommerce.com/");


        // Locate to register
        driver.findElement(By.className("ico-register")).click();


        // Locate to Gender Selection
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/label")).click();

        // Locate to Gender Selection
        driver.findElement(By.id("gender-male")).click();

        // Locate to Firstname
        driver.findElement(By.id("FirstName")).sendKeys("Nishant");

        // Locate to Lastname
        driver.findElement(By.id("LastName")).sendKeys("Dhanani");

        // Locate to DOB
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        selectValueFromDropdown(Day,"13");
        selectValueFromDropdown(Month,"June" );
        selectValueFromDropdown(Year,"1992");

        // locate to email
        driver.findElement(By.id("Email")).sendKeys("nishant.dhanani@gmail.com");

        // locate to company
        driver.findElement(By.xpath("//input[@name = 'Company']")).click();

        // Locate to password By custom xpath
        driver.findElement(By.xpath("//input[@type='password' and @id='Password']")).sendKeys("Ndnd2250");

        // Locate to confirm password By custom xpath
        driver.findElement(By.id("//input[@type='password' and @name='Password']")).sendKeys("Ndnd2250");

        // Locate to Register with custom xpath
        driver.findElement(By.xpath("//button[@type='submit'and @id='register-button']")).click();

        // Locate to close
        driver.close();
    }
}
