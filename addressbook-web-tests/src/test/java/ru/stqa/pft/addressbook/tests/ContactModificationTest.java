package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTest extends TestBase {


  @Test
  public void testContactModification(){
      app.getContactHelper().editContact("//td[8]//a[1]");
      app.getContactHelper().fillContactForm(new ContactData("Mario", "Plummer", "Mario", "T-Systems Slovakia", "dfsfdsdfd", "+7888888888", "10", "March", "1965", "test1"));
      app.getContactHelper().confirmContactModification("//input[22]");

  }


}
