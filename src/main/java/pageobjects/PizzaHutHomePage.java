package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PizzaHutHomePage {
  private WebDriver driver;

  @FindBy(xpath = "//title")
  private WebElement pageTitle;

  public PizzaHutHomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public String getPageTitle() {
    return pageTitle.getText();
  }

  public void open() {
    driver.get("https://www.pizzahut.com/");
  }
}
