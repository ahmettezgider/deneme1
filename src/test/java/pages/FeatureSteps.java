package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.*;

public class FeatureSteps {
    @Given("user on hamepage")
    public void userOnHamepage() {
        open("http://opencart.abstracta.us/");
    }

    @When("user search for {string}")
    public void userSearchFor(String searchText) {
        $("div#search>input").shouldBe(Condition.appear).setValue(searchText).pressEnter();
        System.out.println("user search for {string}");
    }

    @Then("the products should be appear")
    public void theProductsShouldBeAppear() {
        $("div#content>h1").shouldBe(Condition.appear);
        System.out.println("the products should be appear");
        $$("div.product-layout").shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
