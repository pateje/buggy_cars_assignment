package com.example.buggy_cars_assignment;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;

public class BuggyCarMainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://buggy.justtestit.org/");
    }

    /*Test registration*/
    @Test
    public void userRegistration() {

    }

    /*Test login*/
    @Test
    public void userLogin() {

    }

    /*Test update profile details*/
    @Test
    public void updateProfileDetails(){

    }

    /*Test vote with comment*/
    @Test
    public void voteWithComment(){

    }

    /*Test vote without comment*/
    @Test
    public void voteWithoutComment(){

    }

    /*Test Log out from main page*/
    @Test
    public void logOutFromMainPage(){}

}