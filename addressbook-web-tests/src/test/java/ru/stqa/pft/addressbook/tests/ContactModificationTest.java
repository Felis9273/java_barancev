package ru.stqa.pft.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;


public class ContactModificationTest extends TestBase {


  @Test
  public void testContactModification(){
     if (!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("test1","test2","test3","ertert","ertet","+7888888888", "3", "March", "1983", "test1", "test3434"));
    }
      app.getNavigationHelper().goToHomePage();
      List<ContactData> before = app.getContactHelper().getContactList();
      app.getContactHelper().selectContact(before.size()-1);
      app.getContactHelper().editContact(before.size()-1);
      app.getContactHelper().fillContactForm(new ContactData("Mario", "Plummer", "Mario", "T-Systems Slovakia", "dfsfdsdfd", "+7888888888", "10", "March", "1965", "test1",null),false);
      app.getContactHelper().confirmContactModification("//input[22]");
      app.getNavigationHelper().goToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());
  }


}
