//package demo.pages.base.page_object;
//
//import demo.pages.base.BasePageObject;
//import org.openqa.selenium.By;
//
//public class SearchTugasPages extends BasePageObject{
//    public void clickDropdownSortProduct(){
//        By element = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]");
//        clickOn(element);
//    }
////    public void selectProductByValue() {
////        By element = By.xpath("//option[contains(text(),'Name (Z to A)')]");
////        clickOn(element);
////    }
//
//    public void selectProductByValue(String value) {
//        getSelectFilterByValue().selectByValue(value);
//    }
//
//    public boolean isSuccsessCanSeeTheProductList() {
//        By element = By.className("inventory_item_name");
//        return isPresent(element);
//    }
//    public void clickAddToCart2() {
//        By element = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
//        clickOn(element);
//    }
//    public boolean isSuccessAddToCart2() {
//        By element = By.xpath("//span[contains(text(),'2')]");
//        return isPresent(element);
//    }
//    //tambahan
//    public void clickShoppingCart(){
//        By element = By.id("shopping_cart_container");
//        clickOn(element);
//    }
//    public boolean isSuccessRedirectToPageYourCart() {
//        By element = By.xpath("//span[contains(text(),'Your Cart')]");
//        return isPresent(element);
//    }
//        //span[contains(text(),'Your Cart')]
//
//    //body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[2]/span[1]/select[1]
////    public void clickAddToCart() {
////        By element = By.id("add-to-cart-sauce-labs-backpack");
////        clickOn(element);
////    }
//
//
//}
