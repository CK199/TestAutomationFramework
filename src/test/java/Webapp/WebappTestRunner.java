package Webapp;

import Webapp.Features.LoginFeature;
import org.testng.TestNG;
import java.util.List;
import java.util.ArrayList;

public class WebappTestRunner {

    public static void main(String[] args) {
        TestNG runner = new TestNG();
        List<String> testSuites = new ArrayList<String>();
        testSuites.add("C:\\Users\\christian.kelly\\IdeaProjects\\TestAutomationFramework\\src\\test\\java\\Webapp\\Features\\LoginFeature");


    }


}
