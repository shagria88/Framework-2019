package homepage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {

    @FindBy (id = "signInBtn")
    //@FindBy (className = "btn btn-primary btn-block")
    public static WebElement signingIn;

    @FindBy (id = "password")
    public static WebElement passWord;

    public void checksigningIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signingIn.click();
    }
    public void checkpassWord(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        passWord.click();
    }



}
