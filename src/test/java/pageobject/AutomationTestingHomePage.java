package pageobject;

import Base.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationTestingHomePage {
    public WebDriver driver= DriverManager.getDriver();
    By menuToggle= By.xpath("//a[@class='toggle']");
    By homePage= By.linkText("HOME PAGE");
    By accordion= By.linkText("ACCORDION");
    By actions= By.linkText("ACTIONS");
    By browserTabs= By.linkText("BROWSER TABS");
    By buttons= By.linkText("BUTTONS");
    By calculatorJs= By.linkText("CALCULATOR (JS)");
    By contactUsFormTest= By.linkText("CONTACT US FORM TEST");
    By datePicker=By.linkText("DATA PICKER");
    By dropDownCheckBox=By.linkText("DROPDOWN CHECKBOX RADIO");
    By fileUpload=By.linkText("FILE UPLOAD");
    By hiddenElements=By.linkText("HIDDEN ELEMENTS");
    By iframes=By.linkText("IFRAMES");
    By loader=By.linkText("LOADER");
    By loaderTwo=By.linkText("LOADER TWO");
    By mouseMovement=By.linkText("MOUSE MOVEMENT");
    By popUpAlert=By.linkText("POP UPS & ALERTS");
    By predictiveSearch=By.linkText("PREDICTIVE SEARCH");
    By tables=By.linkText("TABLES");
    By testStore=By.linkText("TEST STORE");
    By aboutMe=By.linkText("ABOUT ME");


}