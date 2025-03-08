//ИЗМЕНИТЬ НЕЙМИНГ ПЕРЕМЕННЫХ

package Locators;
import org.openqa.selenium.By;

public class LocatorsForOrder {
    //кнопка "Заказать" вверху
    By orderTopButton = By.className("Header_Nav__AGCXC");
    public By getOrderTopButton() {
        return orderTopButton;
    }

    //кнопка "Заказать" снизу
    By orderBottomButton = By.className("Button_Button__ra12g");
    public By getOrderBottomButton() {
        return orderBottomButton;
    }

    //поле "Имя" (доработать локатор)
    By nameField = By.className("Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN");
    public By getNameField() {
        return nameField;
    }

    //поле "Фамилия" (доработать локатор)
    By lastName = By.className("Input_Input__1iN_Z Input_Error__1Tx5d Input_Responsible__1jDKN");
    public By getLastName() {
        return lastName;
    }

    //поле "Адресс доставки" (доработать локатор)
    By addressDelivery = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN");
    public By getAddressDelivery() {
        return addressDelivery;
    }

    //поле "Станция метро"
    By metroStation = By.className("select-search__value");
    public By getMetroStation() {
        return metroStation;
    }

    //поле "Номер телефона" (доработать локатор)
    By number = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN");
    public By getNumber() {
        return number;
    }

    //кнопка "Далее" (доработать локатор)
    By nextButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    public By getNextButton() {
        return nextButton;
    }

    //хедер "Про аренду" (доработать локатор)
    By aboutRentButton = By.className("Order_Header__BZXOb");
    public By getAboutRentButton() {
        return aboutRentButton;
    }

    //кнопка "Заказать" на экране "Про аренду" (доработать локатор)
    By orderButtonOnAboutRentPage = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    public By getOrderButtonOnAboutRentPage() {
        return orderButtonOnAboutRentPage;
    }

    //Поле "Когда привезти самокат" (доработать локатор)
    By dateField = By.className("Input_Input__1iN_Z Input_Responsible__1jDKN react-datepicker-ignore-onclickoutside");
    public By getDateField() {
        return dateField;
    }

    //Выпадающий список срока доставки
    By rentalPeriodDropDown = By.className("Dropdown-arrow");
    public By getRentalPeriodDropDown() {
        return rentalPeriodDropDown;
    }

    //Срок доставки
    By dropDownOption = By.className("Dropdown-option");
    public By getDropDownOption() {
        return dropDownOption;
    }

    //кнопка "Да"
    By yesButton = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    public By getYesButton() {
        return yesButton;
    }

    //Окно "Хотите оформить заказ?"
    By orderConfirmationWindow = By.className("Order_ModalHeader__3FDaJ");
    public By getOrderConfirmationWindow() {
        return orderConfirmationWindow;
    }

    //Окно "Заказ оформлен"
    By orderHasBeenPlacedWindow = By.className("Order_ModalHeader__3FDaJ");
    public By getOrderHasBeenPlacedWindow() {
        return orderHasBeenPlacedWindow;
    }

    //Заголовок "Для кого самокат"
    By forWhomScooterHeader = By.className("Order_Header__BZXOb");
    public By getForWhomScooterHeader() {
        return forWhomScooterHeader;
    }
}
