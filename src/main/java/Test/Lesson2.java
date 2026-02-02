package Test;

import org.testng.annotations.*;

public class Lesson2 {

    @Test
    public void Loan1(){

        System.out.println("MyBankLoad project");
    }

    @Test
    public void Loan2(){

        System.out.println("MyMobile project");

    }
    @Test(groups = {"Smoke"})
    public void IncludeThismethod(){

        System.out.println("Including this method in project");

    }
    @Parameters({"URL"})
    @BeforeTest
    public void PreRequisite(String urlname){

        System.out.println("Prerequisite"+urlname);

    }
    @AfterSuite(groups = {"Smoke"})
    public void Post(){

        System.out.println("Testing Complete");

    }
    @BeforeMethod
    public void BeforeLS2(){

        System.out.println("Before Everymethid LS2");

    }
    @AfterMethod
    public void AfterLS2(){

        System.out.println("After Everymethid LS2");

    }
}
