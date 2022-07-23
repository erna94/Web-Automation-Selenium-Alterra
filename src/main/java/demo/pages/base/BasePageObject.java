package demo.pages.base;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

import static demo.utils.Constants.timeout;
import static java.lang.Thread.sleep;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }

    public WebElement waitUntil(ExpectedCondition<WebElement> conditions, Integer timeout) {
        WebDriverWait wait = new WebDriverWait(getDriver(), timeout);
        return (WebElement) wait.until(conditions);
    }

    public void wait(int wait) {
        try {
            sleep(wait);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //menambahkan wait ketika akan pindah page, misal dari halaman login ke halaman list produk
    public void clickOn(By element) {
        waitUntil(ExpectedConditions.elementToBeClickable(element), timeout);
        getDriver().findElement(element).click();
    }

    public void typeOn(By element, String text) {
        waitUntil(ExpectedConditions.visibilityOfElementLocated(element), timeout);
        getDriver().findElement(element).sendKeys(text);
    }

    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public void scrollDown() {
        wait(1000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, 350)");
    }

    //moveTotab Buat redirec ke tab baru halaman facebook
    public void moveToTab(int index) {
        ArrayList<String> tabs = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));
        System.out.println(tabs);
    }
    //get title, ambil judul dari webnya
    public String getTitle() {
        //wait untuk menambahkan delai ketika pindah tabnya, karena pas dibuka agak lama
        wait(3000);
        return getDriver().getTitle();
    }

    public Select getSelectFilterByValue(){
        return new Select(getDriver().findElement(By.className("product_sort_container")));
    }


}
