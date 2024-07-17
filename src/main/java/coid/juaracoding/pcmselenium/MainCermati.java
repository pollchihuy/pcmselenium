package coid.juaracoding.pcmselenium;

import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 22:09
@Last Modified Wed 22:09
Version 1.0
*/
public class MainCermati {
    public static void main(String[] args) {
        String rootProject = System.getProperty("user.dir");
        TestNG runner = new TestNG();
        runner.setOutputDirectory(rootProject+"\\output-testng\\selenium\\"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss")));
        List<String> suitefiles = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            suitefiles.add(rootProject+"\\registrasi.xml");
            runner.setTestSuites(suitefiles);
        }
        runner.run();
    }

}
