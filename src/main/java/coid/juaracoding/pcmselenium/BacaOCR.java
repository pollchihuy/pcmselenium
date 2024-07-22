package coid.juaracoding.pcmselenium;

import coid.juaracoding.pcmselenium.util.GlobalFunction;
import org.testng.Assert;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Mon 21:41
@Last Modified Mon 21:41
Version 1.0
*/
public class BacaOCR {


    public static void main(String[] args) {
        /** OCR Baca data dari PDF */
        String strPDF = GlobalFunction.generateTextOCR("D:\\download-automation\\2143_agreement_1721655814.pdf");
        System.out.println(strPDF);
        System.out.println("Validasi Nama : "+strPDF.contains("PAUL PAUL PAUL"));
        System.out.println("Validasi KTP : "+strPDF.contains("3021030000007111"));
        System.out.println("Validasi BPJS : "+strPDF.contains("3216548973545"));
//        System.out.println("Validasi BPJS : "+strPDF.contains("54635464312154"));
        boolean isValid = strPDF.contains("PAUL PAUL PAUL") &&
                strPDF.contains("3021030000007111") &&
                strPDF.contains("3216548973545");
        System.out.println(isValid);
        Assert.assertTrue(isValid,"Wes Turu !!");

        // kita ambil TTD Digital Berhasil - 1
//        OR
        // Kita ambil juga Label Form Input - 2
//        OR
        // Kita ambil label nama di Form Input - 3
    }
}

