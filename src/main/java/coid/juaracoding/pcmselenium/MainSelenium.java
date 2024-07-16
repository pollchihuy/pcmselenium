package coid.juaracoding.pcmselenium;

import coid.juaracoding.pcmselenium.config.BaseConfig;

import java.util.HashMap;
import java.util.Map;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Tue 18:47
@Last Modified Tue 18:47
Version 1.0
*/
public class MainSelenium {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        String strArgs [] = new String[2];
        for (int i = 0; i < args.length; i++) {
            strArgs = args[i].split("=");
            map.put(strArgs[0], strArgs[1]);
        }

//        Print isi Map
//        for (Map.Entry<String, String> set :
//                map.entrySet()) {
//
//            // Printing all elements of a Map
//            System.out.println(set.getKey() + " = "
//                    + set.getValue());
//        }
        System.out.println("TIMEOUT : "+map.get("TIMEOUT"));
        System.out.println("BROWSER : "+map.get("BROWSER"));


    }
}
