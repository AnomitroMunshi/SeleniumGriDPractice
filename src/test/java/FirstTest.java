package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class FirstTest extends SomeTest {

    @Test
    public void CheckTitleTest(){
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"A fresh approach to customer engagement");
    }

    @Test
    public void countLinksTest(){
        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println("list count= "+list.size());
       // Assert.assertEquals(list.size(),177);
    }

}
