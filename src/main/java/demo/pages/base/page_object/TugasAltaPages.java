package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TugasAltaPages extends BasePageObject {
    public void ClickSelect() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
        clickOn(element);
    }

    public void valueNameAZ() {
        Select valueNameAZ = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        valueNameAZ.selectByValue("az");
        wait(2000);
    }

    public void Btnaz() {
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
        wait(2000);
    }

    public void valueNameZA() {
        Select valueNameZA = new Select(getDriver().findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")));
        valueNameZA.selectByValue("za");
        wait(2000);
    }

    public void Btnza() {
        By element = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
        clickOn(element);
        wait(2000);
    }

    public void Cartbtn() {
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
        clickOn(element);
        wait(2000);
    }
    public void remove2() {
        By element = By.id("remove-test.allthethings()-t-shirt-(red)");
        clickOn(element);
        wait(2000);
    }
    public void continueShopping(){
        By element = By.id("continue-shopping");
        clickOn(element);
        wait(2000);
    }
    public boolean BacktoShop() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        return isPresent(element);
    }
}

