package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;

import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getNavigationHelper().gotoNewContactPage();
        app.getContactHelper().fillContact(new ContactData("test", "test", "test", "test", "test", "test", "test" ,"test"));
        app.getContactHelper().submitContactCreation();
        app.getNavigationHelper().returnHomePage();
        app.logout();
    }

}
