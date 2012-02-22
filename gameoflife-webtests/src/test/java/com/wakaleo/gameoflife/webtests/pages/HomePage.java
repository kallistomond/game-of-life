package com.wakaleo.gameoflife.webtests.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://10.248.109.231:9090/home")
public class HomePage extends GameOfLifePage {

    @FindBy(linkText = "New Game")
    WebElement newGameLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNewGameLink() {
        newGameLink.click();
    }
}
