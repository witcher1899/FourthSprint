package MainPage;
import ExpectedResults.ExpectedResults;
import Locators.LocatorsForOrder;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.junit.Test;
import Locators.LocatorsForDropDownList;
import static org.junit.Assert.assertEquals;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Parameterized.class)
public class DropDownListTest {
    private WebDriver driver;
    By dropDownListPoint;
    By dropDownListText;
    String isCorrectText;
    static LocatorsForDropDownList locator = new LocatorsForDropDownList();
    static ExpectedResults expectedResult = new ExpectedResults();
    static LocatorsForOrder orderLocator = new LocatorsForOrder();


    public DropDownListTest(By dropDownListPoint, By dropDownListText, String isCorrectText) {
        this.dropDownListPoint = dropDownListPoint;
        this.dropDownListText = dropDownListText;
        this.isCorrectText = isCorrectText;
    }

    @Parameterized.Parameters
    public static Object[][] getHints() {
        return new Object[][]{
                {locator.getFirstQuestionDropDownList(), locator.getFirstDropDownListText(), expectedResult.getFirstAnswer()},
                {locator.getSecondQuestionDropDownList(), locator.getSecondDropDownListText(), expectedResult.getSecondAnswer()},
                {locator.getThirdQuestionDropDownList(), locator.getThirdDropDownListText(), expectedResult.getThirdAnswer()},
                {locator.getFourthQuestionDropDownList(), locator.getFouthDropDownListText(), expectedResult.getFourthAnswer()},
                {locator.getFifthQuestionDropDownList(), locator.getFifthDropDownListText(), expectedResult.getFifthAnswer()},
                {locator.getSixthQuestionDropDownList(), locator.getSixthDropDownListText(), expectedResult.getSixthAnswer()},
                {locator.getSeventhQuestionDropDownList(), locator.getSeventhDropDownListText(), expectedResult.getSeventhAnswer()},
                {locator.getEighthQuestionDropDownList(), locator.getEighthDropDownListText(), expectedResult.getEighthAnswer()}
        };
    }


    @Before
    public void setup() {
        WebDriverManager.chromedriver().driverVersion("134.0.6998.35").setup(); // Автоматически настраивает chromedriver
        WebDriver driver = new ChromeDriver();
        // Драйвер для браузера Chrome
        driver.get("https://qa-scooter.praktikum-services.ru");
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(By.className("Button_Button__ra12g")));
    }


    @Test
    public void checkDropDownTest() {
        WebElement element = driver.findElement(dropDownListPoint);
        // Прокрути страницу до футера
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(dropDownListPoint).click();

        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(dropDownListText));

        assertEquals("Неверный текст в подсказке", isCorrectText, driver.findElement(dropDownListText).getText());
    }

    @Test
    public void orderViaTopButton() {

        driver.findElement(orderLocator.getOrderTopButton()).click();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(By.className("forWhomScooterHeader")));

        driver.findElement(orderLocator.getNameField()).sendKeys("Игорь");
        driver.findElement(orderLocator.getLastName()).sendKeys("Ищенко");
        driver.findElement(orderLocator.getAddressDelivery()).sendKeys("Теплый стан");
        driver.findElement(orderLocator.getMetroStation()).sendKeys("Преображенская площадь");
        driver.findElement(orderLocator.getNumber()).sendKeys("89995692346");
        driver.findElement(orderLocator.getNextButton()).click();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(orderLocator.getAboutRentButton()));


        driver.findElement(orderLocator.getDateField()).sendKeys("09.03.2024");
        driver.findElement(orderLocator.getRentalPeriodDropDown()).click();
        driver.findElement(orderLocator.getDropDownOption()).click();
        driver.findElement(orderLocator.getOrderButtonOnAboutRentPage()).click();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(orderLocator.getOrderConfirmationWindow()));

        driver.findElement(orderLocator.getYesButton()).click();
        WebElement element = driver.findElement(orderLocator.getOrderHasBeenPlacedWindow());

        String textOnOrderHasBeenPlacedWindow = "Заказ оформлен";

        assertEquals("Окно 'Заказ оформлен' не открылось", textOnOrderHasBeenPlacedWindow, driver.findElement(orderLocator.getOrderHasBeenPlacedWindow()).getText());
    }


    @Test
    public void orderBottomButton() {

        WebElement element = driver.findElement(orderLocator.getOrderBottomButton());
        // Прокрути страницу до футера
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(dropDownListPoint).click();

        driver.findElement(orderLocator.getOrderBottomButton()).click();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(By.className("forWhomScooterHeader")));

        driver.findElement(orderLocator.getNameField()).sendKeys("Игорь");
        driver.findElement(orderLocator.getLastName()).sendKeys("Ищенко");
        driver.findElement(orderLocator.getAddressDelivery()).sendKeys("Теплый стан");
        driver.findElement(orderLocator.getMetroStation()).sendKeys("Преображенская площадь");
        driver.findElement(orderLocator.getNumber()).sendKeys("89995692346");
        driver.findElement(orderLocator.getNextButton()).click();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(orderLocator.getAboutRentButton()));


        driver.findElement(orderLocator.getDateField()).sendKeys("09.03.2024");
        driver.findElement(orderLocator.getRentalPeriodDropDown()).click();
        driver.findElement(orderLocator.getDropDownOption()).click();
        driver.findElement(orderLocator.getOrderButtonOnAboutRentPage()).click();
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(orderLocator.getOrderConfirmationWindow()));

        driver.findElement(orderLocator.getYesButton()).click();
        String textOnOrderHasBeenPlacedWindow = "Заказ оформлен";

        assertEquals("Окно 'Заказ оформлен' не открылось", textOnOrderHasBeenPlacedWindow, driver.findElement(orderLocator.getOrderHasBeenPlacedWindow()).getText());
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
