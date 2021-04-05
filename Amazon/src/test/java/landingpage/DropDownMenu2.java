package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownMenu2 extends CommonAPI {

    @Test
    public void dropDownMenu2(){
        List<String> menuList = getListOfText(".nav-search-dropdown.searchSelect option");
        for (String value:menuList){
            System.out.println(value);

        }
    }
}
