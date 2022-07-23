package demo.steps_definition;

import demo.pages.base.page_object.TugasAltaPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TugasAltaStep {
    TugasAltaPages tugasAltaPages = new TugasAltaPages();

    @When("user select product by value az")
    public void userSelectProductByValueAz(){
        tugasAltaPages.valueNameAZ();
    }
    @And("user add product to cart")
    public void userAddProductToCart() {
        tugasAltaPages.Btnaz();
    }
    @And ("user select product by value za")
    public void userSelectProductByValueZa(){
        tugasAltaPages.valueNameZA();
    }

    @And("user add product2 to cart")
    public void userAddProduct2ToCart() {
        tugasAltaPages.Btnza();
    }
    @And("user click button cart")
    public void userClickButtonCart(){
        tugasAltaPages.Cartbtn();
    }
    @And("user remove second item")
    public void userRemoveSecondItem(){
        tugasAltaPages.remove2();
    }
    @And("user click continue shopping")
    public void userClickContinueShopping(){
        tugasAltaPages.continueShopping();
    }
    @Then("user back to shopping list")
    public void userBackToShoppingList(){
        tugasAltaPages.BacktoShop();
    }
}
