package ru.stqa.pft.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import  ru.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.*;

import java.util.List;

public class ContactDeletionTest extends TestBase{


  @Test
  public void testContactDeletion () {
    if (!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("test1","test2","test3","ertert","ertet","+7888888888", "3", "March", "1983", "test1", "test3434"));
    }
    app.getNavigationHelper().goToHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();

    app.getContactHelper().selectContact(before.size()-1);
    app.getContactHelper().deleteContact("//input[@value='Delete']");
    app.getContactHelper().closeInformationPopUp();
    app.getNavigationHelper().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size()+1);
  }

}
