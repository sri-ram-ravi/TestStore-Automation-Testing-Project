package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationTestingHomePage {
    public WebDriver driver;
    By menuToggle = By.xpath("//a[@class='toggle']");
    By homePage = By.linkText("HOME PAGE");
    By accordion = By.linkText("ACCORDION");
    By actions = By.linkText("ACTIONS");
    By browserTabs = By.linkText("BROWSER TABS");
    By buttons = By.linkText("BUTTONS");
    By calculatorJs = By.linkText("CALCULATOR (JS)");
    By contactUsFormTest = By.linkText("CONTACT US FORM TEST");
    By datePicker = By.linkText("DATA PICKER");
    By dropDownCheckBox = By.linkText("DROPDOWN CHECKBOX RADIO");
    By fileUpload = By.linkText("FILE UPLOAD");
    By hiddenElements = By.linkText("HIDDEN ELEMENTS");
    By iframes = By.linkText("IFRAMES");
    By loader = By.linkText("LOADER");
    By loaderTwo = By.linkText("LOADER TWO");
    By mouseMovement = By.linkText("MOUSE MOVEMENT");
    By popUpAlert = By.linkText("POP UPS & ALERTS");
    By predictiveSearch = By.linkText("PREDICTIVE SEARCH");
    By tables = By.linkText("TABLES");
    By testStore = By.linkText("TEST STORE");
    By aboutMes = By.linkText("ABOUT ME");
    By cookie = By.cssSelector(".close-cookie-warning > span");

    public AutomationTestingHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getToggle() {
        return driver.findElement(menuToggle);
    }

    public WebElement getHomepageLink() {
        return driver.findElement(homePage);
    }

    public WebElement getAccordionLink() {
        return driver.findElement(accordion);
    }

    public WebElement getActionLink() {
        return driver.findElement(actions);
    }

    public WebElement getBrowserTabLink() {
        return driver.findElement(browserTabs);
    }

    public WebElement getButtonLink() {
        return driver.findElement(buttons);
    }

    public WebElement getCalcLink() {
        return driver.findElement(calculatorJs);
    }

    public WebElement getContactUsLink() {
        return driver.findElement(contactUsFormTest);
    }

    public WebElement getDatePickerLink() {
        return driver.findElement(datePicker);
    }

    public WebElement getDropdownLink() {
        return driver.findElement(dropDownCheckBox);
    }

    public WebElement getFileUploadLink() {
        return driver.findElement(fileUpload);
    }

    public WebElement getHiddenElementsLink() {
        return driver.findElement(hiddenElements);
    }

    public WebElement getIframeLink() {
        return driver.findElement(iframes);
    }

    public WebElement getLoaderLink() {
        return driver.findElement(loader);
    }

    public WebElement getLoginPortalLink() {
        return driver.findElement(loaderTwo);
    }

    public WebElement getMouseLink() {
        return driver.findElement(mouseMovement);
    }

    public WebElement getPopupLink() {
        return driver.findElement(popUpAlert);
    }

    public WebElement getPredictiveLink() {
        return driver.findElement(predictiveSearch);
    }

    public WebElement getTablesLink() {
        return driver.findElement(tables);
    }

    public WebElement getTestStoreLink() {
        return driver.findElement(testStore);
    }

    public WebElement getAboutMeLink() {
        return driver.findElement(aboutMes);
    }

    public WebElement getCookie(){
        return driver.findElement(cookie);
    }

}