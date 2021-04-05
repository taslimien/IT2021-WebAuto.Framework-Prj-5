package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SearchPage extends CommonAPI {

    @Test
    public void test2() throws InterruptedException{
        driver.findElement(By.id("gh-ac")).sendKeys("Books", Keys.ENTER);
        Thread.sleep(3000);

    }
}
