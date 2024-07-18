package coid.juaracoding.pcmselenium.page;

/**
 * Soal Ujian Unit Testing - TestNG Untuk Kelas Perhitungan
 */
public class Perhitungan {
    /** Fungsi aritmatika tambah-tambahan */
    public Integer tambah(String a, String b){
        return Integer.parseInt(a)+Integer.parseInt(b);
    }
    /** Fungsi aritmatika pengurangan */
    public Double kurang(String a, String b){
        double douKurang = Integer.parseInt(a)-Integer.parseInt(b);
        return douKurang;
    }
    /** Fungsi aritmatika perkalian */
    public Double kali(String a, String b){
        double douBagi = Integer.parseInt(a)*Double.parseDouble(b);
        return douBagi;
    }
    /** Fungsi aritmatika pembagian */
    public Double bagi(String a, String b){
        double douBagi = Integer.parseInt(a)-Double.parseDouble(b);
        return douBagi;
    }

    /** Fungsi aritmatika modulus */
    public Integer modulus(String a , String b){
        return Integer.parseInt(a)%Integer.parseInt(b);
    }
}