package coid.juaracoding.pcmselenium;

import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 20:13
@Last Modified Wed 20:13
Version 1.0
*/
public class MainMainan {

    public static void main(String[] args) {
        Random r = new Random();
        String strRand = "abcdefghijklmnopqrstuvwxyz";
        int intLoop = r.nextInt(5,21);
        String strResult = "";
        for (int i = 0; i < intLoop; i++) {
            strResult = strResult + strRand.charAt(r.nextInt(0,strRand.length()));
        }
        System.out.println(strResult);
    }
}