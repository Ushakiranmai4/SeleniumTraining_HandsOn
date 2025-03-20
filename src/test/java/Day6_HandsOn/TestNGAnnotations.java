package Day6_HandsOn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite: Executes before the entire test suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest:s Executed before the execution of all the @test annotated methods");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: Executes before the first test method in the class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: Executes before each test method");
    }

    @Test
    public void testMethod1() {
        System.out.println("TestMethod1: Actual test execution");
    }

    @Test
    public void testMethod2() {
        System.out.println("TestMethod2: Another test execution");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod: Executes after each test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: Executes after all test methods in the class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest: Executed after the execution of all the @test annotated methods");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite: Executes after the entire test suite");
    }
}


