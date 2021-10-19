/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araba1;

/**
 *
 * @author Lenovo
 */
public class Araba1 {
    private String musteri;
    private String AracSahibi;

    public String getMusteri() {
        System.out.println("Musteri islemleri:");
        cam();
        System.out.println("Musteri adi:");
        return musteri;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }

    public String getAracSahibi() {
        System.out.println("Araç Sahibi islemleri :");
        aracKullanimi();
        cam();
        System.out.println("Araç sahibi adı:");
        return AracSahibi;
    }

    public void setAracSahibi(String AracSahibi) {
        this.AracSahibi = AracSahibi;
    }
    
    Araba1(){
        System.out.println("Araç ile yolculuğa çıkıldı.");
    }
    
    private static void aracKullanimi(){
        System.out.println("Araç sahibi arabayı kullandı.");
    }
    
    private static void cam(){
        System.out.println("Camlar açıldı");
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba1 aracKullanimi = new Araba1();
        aracKullanimi.setAracSahibi("Oznur");
        System.out.println(aracKullanimi.getAracSahibi());
        
        aracKullanimi.setMusteri("mehmet");
        System.out.println(aracKullanimi.getMusteri());
    }
    
}
