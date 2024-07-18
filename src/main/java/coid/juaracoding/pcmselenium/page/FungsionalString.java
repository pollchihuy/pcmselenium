package coid.juaracoding.pcmselenium.page;

/**
 * Soal Ujian Unit Testing - TestNG Untuk Kelas Fungsional String
 */
public class FungsionalString {

    /** mengambil karakter dari index suatu string */
    public Character getCharFromString(String s, int intPointer){
        return s.charAt(intPointer);
    }

    /** mendapatkan informasi panjang string */
    public Integer getStringLength(String s){
        return s.length();
    }
}