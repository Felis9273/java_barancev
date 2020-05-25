package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
 private WebDriver wd;

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void goToGroupPage() {
    click(By.xpath("//li[3]/a"));
    if (isElementPresent(By.tagName("h1"))
            || wd.findElement(By.tagName("h1")).getText().equals("Groups")
            || isElementPresent(By.name("new"))){
      return;
  }
            click(By.linkText("groups"));
  }
  public void goToHomePage() {
  // if (isElementPresent(By.id("MainForm"))){
 //    return;
//   }

    click(By.linkText("home"));
  }

}
