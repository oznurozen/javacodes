/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metot;

/**
 *
 * @author Lenovo
 */
public class Metot {
    public static int sayi=100, sayi1=80;
    
    public static void tumIslemler(){
        toplama();
        cikarma();
        bolme();
        carpma();
    }

   public static void toplama(){ 
       System.out.println("Toplama işlemi sonucunuz: " + (sayi+sayi1)); 
   }
   public static void cikarma(){
       System.out.println("Çıkarma işlemi sonucunuz: " + (sayi-sayi1)); 
   }
   public static void carpma(){
       System.out.println("Çarpma işlemi sonucunuz: " + (sayi*sayi1)); 
   }
    public static void bolme(){
       System.out.println("Bölme işlemi sonucunuz: " + (sayi/sayi1)); 
   }
   
    public static void main(String[] args) {
        tumIslemler();
    }
    
}
