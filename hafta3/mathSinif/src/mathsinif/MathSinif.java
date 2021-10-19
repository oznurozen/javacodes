/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsinif;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MathSinif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  System.out.println("Abs: " + Math.abs(-8));
        System.out.println("Ceil: " + Math.ceil(8.1));
        System.out.println("Round: " + Math.round(9.5));
        System.out.println("floor: " + Math.floor(5.5));
        System.out.println("max: " + Math.max(5, 9));
        System.out.println("min: " + Math.min(5, 9));
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);
        System.out.println("pow: " + Math.pow(2, 3));
        System.out.println("sqrt: " + Math.sqrt(25));
        System.out.println("random: " + Math.random());*/
        
        /*Kullanıcıdan 2 sayı alınız. biri negatif bir sayı olsun. Ardından kullanıcıya hangi
        işlemi yaptırmak istediğini sorunuz ve seçime göre işlemin çıktısını ekrana veriniz.
*/
        Scanner kullaniciVerisi =new Scanner(System.in);
        System.out.println("Negatif bir sayi giriniz: ");
        int sayi1 = kullaniciVerisi.nextInt();
        System.out.println("Bir sayi daha giriniz: ");
        int sayi2 = kullaniciVerisi.nextInt();
        System.out.println("1.abs  2.ceil  3.round");
        System.out.println("Seçmek istediğiniz islemi giriniz.");
        int islem = kullaniciVerisi.nextInt();
        if(islem==1){
            System.out.println("Abs: " + Math.abs(sayi1));
            System.out.println("Abs: " + Math.abs(sayi2));
        }
        else if(islem==2){
            System.out.println("ceil: " + Math.ceil(sayi1));
            System.out.println("ceil: " + Math.ceil(sayi2));
        }
        else if(islem==3){
            System.out.println("Round: " + Math.round(sayi1));
            System.out.println("Round: " + Math.round(sayi2));
        }
        
        
    }
    
}
