/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodulkeler;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class MethodUlkeler {

    /**
     * @param args the command line arguments
     * Ülkeler, iller ve ilçeler adında 3 adet metot oluşturun ve bu metotların
     * içerisine 3 ila 5 arasında karışık olarak veri giriniz, bu veriler bir bütün
     * şeklinde olsun. Ülkeleri, illeri, ilçeleri ve her tanımladığınız metot içerisinde 
     * kaç tane veri olduğunu ekrana veren programı yazınız.

     */
    public static void ulkeler(){
        String [] ulke = {"Türkiye", "Almanya", "Rusya"};
        System.out.println("Ülkeler : "+ Arrays.toString(ulke) + " Ülke sayıyı: " + ulke.length);
        iller();
        ilçeler();
  
    }
    public static void iller(){
        String [] il = {"istanbul", "Ankara", "Zonguldak"};
        System.out.println("iller : "+ Arrays.toString(il) + " İl sayıyı: " + il.length);
        
    }
    public static void ilçeler(){
        String [] ilce = {"a", "b", "c","d","e"};
        System.out.println("ilçeler : "+ Arrays.toString(ilce) + " İlçe sayıyı: " + ilce.length);
        
    }
    public static void main(String[] args) {
        ulkeler();
    }
    
}
