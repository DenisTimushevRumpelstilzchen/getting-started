import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class searchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $("[name=q]").setValue("ozon").pressEnter();
        $("[id=search]").$(byText("ozon")).click();
        $("[id=__ozon]").shouldHave(text("Ozon fresh"));
    }

}
