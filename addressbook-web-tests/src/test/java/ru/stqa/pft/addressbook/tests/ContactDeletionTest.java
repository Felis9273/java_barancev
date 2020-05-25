package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;

import org.openqa.selenium.*;

public class ContactDeletionTest extends TestBase{


  @Test
  public void testContactDeletion () {
    app.getContactHelper().selectContact("//tr[2]//td[1]");
    //acceptNextAlert = true;
    app.getContactHelper().deleteContact("//input[@value='Delete']");
    app.getContactHelper().closeInformationPopUp();
    app.getNavigationHelper().goToHomePage("home");
  }

}
