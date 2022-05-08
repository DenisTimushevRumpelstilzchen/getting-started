import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class searchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("ozon").pressEnter();
        $(".iUh30 tjvcx").click();
        $(".gc9").shouldHave(text("Ozon fresh"));
    }

}
