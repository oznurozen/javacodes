/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araba;

/**
 *
 * @author Lenovo
 */
/*Bir araba nesnesi yaratın ve arabanın km sine bir değer atayın ardından constructor
yapısını kullanarak artan kilometreyi güncelleyerek araba metodunu çalıştırınız.
*/
public class Araba {
    public double mevcutKm = 1589;
    Araba(){
        System.out.println("Aracın mevcut km'si" + mevcutKm);
    }
    Araba(double yeniKmDegeri){
        mevcutKm= yeniKmDegeri;
         System.out.println("Aracın yeni mevcut km'si" + mevcutKm); 
    }
    void calistir(){
        System.out.println("Araba çalıştı");
    }

    public static void main(String[] args) {
        Araba mevcutKm = new Araba();
        mevcutKm.calistir();
        
        Araba yeniKmDegeri = new Araba(1800);
        yeniKmDegeri.calistir();
        
    }
    
}
