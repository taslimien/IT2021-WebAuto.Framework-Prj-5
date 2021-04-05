package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;

public class NewsPage extends CommonAPI {

    @Test
    public void test1(){
        System.out.println(driver.getTitle());

    }
}
