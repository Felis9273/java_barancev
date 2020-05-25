package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest  extends TestBase{

  @Test
  public void testContactCreation() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("John", "Smith", "Alex", "T-Systems RUS", "13 linia V.O 14", "+7888888888", "3", "March", "1983", "test1", "test3434"), true);
    app.getContactHelper().submitContactCreation();
  }


}
