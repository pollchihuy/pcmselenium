package coid.juaracoding.pcmselenium.impl;

import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        String rootProject = System.getProperty("user.dir");
        TestNG runner = new TestNG();
        runner.setOutputDirectory(rootProject+"\\output-testng\\selenium\\"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss")));
        List<String> suitefiles = new ArrayList<String>();
        suitefiles.add(rootProject+"\\loginpositif.xml");
        suitefiles.add(rootProject+"\\loginnegatif.xml");
        suitefiles.add(rootProject+"\\practicetestexception.xml");
        runner.setTestSuites(suitefiles);
        runner.run();
    }
}