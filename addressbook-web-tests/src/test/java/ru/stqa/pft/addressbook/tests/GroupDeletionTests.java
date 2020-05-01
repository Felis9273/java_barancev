package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;


public class GroupDeletionTests extends TestBase {


  @Test
  public void testDeletionGroup() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
