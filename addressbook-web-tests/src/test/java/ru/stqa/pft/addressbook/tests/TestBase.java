package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;


public class TestBase extends ApplicationManager{

  protected final ApplicationManager app = new ApplicationManager();
  protected boolean acceptNextAlert = true;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.stop();

  }

  public ApplicationManager getApp() {
    return app;
  }

}
