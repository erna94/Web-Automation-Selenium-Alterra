package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class NavigateToFacebook extends BasePageObject {

    public void scrollToBottomPage(){
        scrollDown();
    }

    public void clickButtonFacebook() {
        By element = By.xpath("//a[contains(text(),'Facebook')]");
        clickOn(element);
    }
    //panggil fungsi moveToTab yg sudah di definisikan di class BasePagesObject
    public void moveToTab() {
        //indexnya 1 itu halaman web facebook,
        //kalo index 0 itu halaman utama sauce code demo, yg ada button facebooknya
        moveToTab(1);
    }

    //definisikan fungsi untuk getTitleFacebook
    public String getTitleFacebook() {
        return getTitle();
    }

}
