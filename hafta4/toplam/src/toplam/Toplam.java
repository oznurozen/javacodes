/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplam;

/**
 *
 * @author Lenovo
 */
/*Varsayılan bir toplama işlemi yaptırın ardından iki tane yeni sayı girişi yaparak toplamayı 
gerçekleştiriniz.
*/
public class Toplam {

    /**
     * @param args the command line arguments
     */
    public int sayi1 = 15;
    public int sayi2 = 20;
    
    Toplam(){
        System.out.println("Toplam : " + (sayi1+sayi2));
    }
    
    Toplam(int yeniSayi1, int yeniSayi2){
        sayi1 = yeniSayi1;
        sayi2 = yeniSayi2;
        System.out.println("Yeni toplam: " + (sayi1+sayi2));
    }
    
    void toplama(){
        System.out.println("Toplama işlemi yapıldı");
    }
    
    public static void main(String[] args) {
        Toplam toplamaIslemi = new Toplam();
        toplamaIslemi.toplama();
        
        Toplam toplamaIslemi2 = new Toplam(80,70);
        toplamaIslemi2.toplama();
    }
    
}
