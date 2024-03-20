package ru.netology.bank;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;


public class AppOrderPositiveTest {


    @Test
    public void shouldBeSuccessFullForm() {
        open("http://localhost:9999");
        SelenideElement form = $ ("[class=App_appContainer__3jRx1]");
        form.$("[data-test-id=name] input").setValue("Иванов");
        form.$("[data-test-id=phone] input").setValue("+79064564545");
        form.$("[data-test-id=agreement]").click();
        form.$("button.button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));


    }
}
