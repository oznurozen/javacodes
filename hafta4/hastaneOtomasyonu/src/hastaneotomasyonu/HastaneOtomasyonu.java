/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastaneotomasyonu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HastaneOtomasyonu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.println("Adınızı giriniz : ");
        String isim = veri.next();
        System.out.println("Soyadınızı giriniz : ");
        String soyad = veri.next();
        System.out.println("TC kimlik numaranızı giriniz : ");
        long tcKimlik = veri.nextLong();
        System.out.println("Telefon numaranızı giriniz : ");
        int telNo = veri.nextInt();
        System.out.println("1.Kardiyoloji 2.Göz Hastalıkları 3.Ortopedi 4.Dahiliye 5.Cildiye");
        System.out.println("Seçmek istediğiniz bölümün numarasını giriniz.");
        int secim = veri.nextInt();
        if(secim==1){
            System.out.println("Kardiyoloji");
        }
        else if(secim==2){
            System.out.println("Göz Hastalıkları");
        }
        else if(secim==3){
            System.out.println("Ortopedi");
        }
        else if(secim==4){
            System.out.println("Dahiliye");
        }
        else if(secim==5){
            System.out.println("Cildiye");
        }
        System.out.println("Tarih bilgisini giriniz : ");
        String tarih= veri.next();
        
         System.out.println("Saat bilgisini giriniz : ");
         String saat = veri.next();
         
         System.out.println("Randevunuz oluşturulmuştur : ");
         
         System.out.println(isim + " " + soyad + " " + tcKimlik + " " + telNo + " " + secim + " " + tarih + " " + saat);
        
        
        
        
    }
    
}
