/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphizm;

/**
 *
 * @author Lenovo
 */
class UstSinif{
    public void yaz(){
        System.out.println("Ust Sınıf");
    }
  
 }   
 
class AltSinif1 extends UstSinif{
     @Override
     public void yaz(){
         System.out.println("Alt Sınıf1");
     }
     
 }

class AltSinif2 extends UstSinif{
    @Override
    public void yaz(){
        System.out.println("Alt Sınıf2");
    }
}
 
 

public class Polymorphizm {
    public static void nesneOlustur(UstSinif nesne){
        nesne.yaz();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UstSinif u1 = new UstSinif();
       AltSinif1 a1 = new AltSinif1();
       AltSinif2 a2 = new AltSinif2();
       
       nesneOlustur(u1);
       nesneOlustur(a1);
       nesneOlustur(a2);
       
       
    }
    
}
