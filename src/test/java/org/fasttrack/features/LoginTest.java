package org.fasttrack.features;


import org.fasttrack.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(Constants.USER_NAME);
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIL);
        loginSteps.setPassword(Constants.USER_PASS+"a");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }

}
