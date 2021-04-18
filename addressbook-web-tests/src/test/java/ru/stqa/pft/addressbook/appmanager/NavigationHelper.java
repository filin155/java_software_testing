package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupsPages() {
        click(By.linkText("groups"));
    }

    public void gotoNewContactPage() {
        click(By.linkText("add new"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

}
