//package demo.steps_definition;
//
//import demo.pages.base.page_object.SearchTugasPages;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//
//public class SearchTugasStep {
//    SearchTugasPages tugasSearchPages = new SearchTugasPages();
//
//    @Given("user click dropdown sort product")
//    public void clickDropdownSortProduct() {
//        tugasSearchPages.clickDropdownSortProduct();
//    }
//
//    @When("user select the product by value <{string}>")
//    public void selectProductByValue(String value) {
//        tugasSearchPages.selectProductByValue(value);
//    }
//
//    @Then("user succsess can see the product list by value")
//    public void succsessCanSeeTheProductListByValue() {
//        Assert.assertTrue(tugasSearchPages.isSuccsessCanSeeTheProductList());
//    }
//    @And("user click add to cart2")
//    public void userClickAddToCart2() {
//        tugasSearchPages.clickAddToCart2();
//    }
//    @Then("user success can see the shopping cart added")
//    public void userSuccsessCanSeeTheShoppingCartAdded() {
//        tugasSearchPages.isSuccessAddToCart2();
//    }
//    //tambahan
//    @And("user click shopping cart2")
//    public void userClickShoppingCart() {
//        tugasSearchPages.clickShoppingCart();
//    }
//    @Then("user can see page your cart")
//    public void userCanSeeRedirectToPageYourCart() {
//        Assert.assertTrue(tugasSearchPages.isSuccessRedirectToPageYourCart());
//    }
//}

