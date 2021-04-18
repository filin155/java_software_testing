package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContact(new ContactData("test", "test", "test", "test", "test", "test", "test" ,"test"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnHomePage();
        app.logout();
    }
}
