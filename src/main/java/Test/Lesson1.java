package Test;

import org.testng.annotations.*;

public class Lesson1 {
@Parameters({"URL","Website"})
@Test(dependsOnMethods ={"Demo2"} )
public void Demo(String urlname,String Websiteatsuitelevel){

    System.out.println("My first test1 "+urlname+" " +"and"+Websiteatsuitelevel);
}

@Test(enabled = true, dataProvider = "getData", groups = {"Smoke"})
    public void Demo2(String username,String pwd){

    System.out.println("My Test2");
    System.out.println("username"+username);
    System.out.println("Password"+pwd);

}
    @BeforeMethod
    public void BeforeLS1(){

        System.out.println("Before Everymethid LS1");

    }
    @AfterMethod
    public void AfterLS1(){

        System.out.println("After Everymethid LS1");

    }
    @DataProvider
    public Object getData(){
    Object[][] data=new Object[3][2];
    data[0][0]="firstusername";
    data[0][1]="pass1";
        data[1][0]="secondusername";
        data[1][1]="pass2";
        data[2][0]="thirdusername";
        data[2][1]="pass3";
        return data;
    }
}
