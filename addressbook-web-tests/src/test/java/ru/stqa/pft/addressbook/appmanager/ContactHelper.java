package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }
    public void submitContactCreation() {
      wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillContactForm(ContactData contactData,boolean creation) {
      type(By.name("firstname"), contactData.getName());
      type(By.name("lastname"), contactData.getLastname());
      type(By.name("nickname"), contactData.getNickname());
      type(By.name("company"), contactData.getCompany());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getFonenumber());
      wd.findElement(By.name("bday")).click();
      new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthday());
      wd.findElement(By.xpath("//option[@value='3']")).click();
      wd.findElement(By.name("bmonth")).click();
      new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getMonth());
      wd.findElement(By.xpath("//option[@value='March']")).click();
      type(By.name("byear"), contactData.getYear());
      type(By.name("notes"), contactData.getAddInfo());

      if (creation){
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
      }  else {
        Assert.assertFalse(isElementPresent(By.name("new_group")));
      }
    }


  public void initContactCreation() {
      wd.findElement(By.linkText("add new")).click();
    }



  public void closeInformationPopUp() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact(String s) {
    wd.findElement(By.xpath(s)).click();
  }

  public void selectContact(int index) {
    wd.findElements(By.xpath("//*[@name='selected[]']")).get(index).click();
  }

  public void editContact(int index) {
    wd.findElements(By.xpath("//td[8]/a/img")).get(index).click();
  }

  public void confirmContactModification(String xpathExpression) {
    wd.findElement(By.xpath(xpathExpression)).click();
  }

  public void createContact(ContactData contact) {
    initContactCreation();
    fillContactForm(contact,true);
    submitContactCreation();

  }

  public boolean isThereAContact() {
    return isElementPresent(By.xpath("//tr[2]//td[1]"));
  }

  public int getContactCount() {
   return wd.findElements(By.xpath("//*[@name='selected[]']")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.xpath("//tr//td[2]"));
//    List<WebElement> elemen = wd.findElements(By.xpath("//tr//td[3]"));
    for (WebElement element: elements){
      String Lastname = element.getText();
      ContactData contact = new ContactData(null, Lastname, null, null, null, null, null, null, null, null, null);
      contacts.add(contact);
    }

    return contacts;
  }
}
