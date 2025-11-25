package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowsePO {
    @FindBy(xpath = "//button[@id='cbg_ccp_cookie_allow_all_btn' and text()='Allow all']")

    private WebElement refuseOptionalCokkies;


    @FindBy(xpath = "//*[@data-testid='confirm-action']")

    private WebElement ageRestrictedYes;


    @FindBy(xpath = "//ul[@data-testid='action-menu-group']//*[@data-testid='login-action-item']")

    private WebElement btn_login;


    @FindBy(xpath = "//input[@id='i0116']")

    private WebElement login_text;


    @FindBy(xpath = "//input[@id='idSIButton9']")

    private WebElement btn_next;


    @FindBy(xpath = "//input[@type='password']")

    private WebElement input_pass;


    @FindBy(xpath = "//input[@type='submit']")

    private WebElement btn_submit;


    @FindBy(xpath = "//input[@id='idBtn_Back']")

    private WebElement btn_no;


    @FindBy(xpath = "//button[@data-testid='delivery-date-confirm-cta']")

    private WebElement btn_deliverydateconfirm;


}
