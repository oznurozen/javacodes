/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometriksekil;

/**
 *
 * @author Lenovo
 */
public class Main {
        public static void main(String[] args) {
       
            Ucgen ucgen = new Ucgen();
            ucgen.ozellikler(70, 10);
            System.out.println(ucgen.isimGoster()+ " : " + ucgen.alanHesap());
            
            Kare kare = new Kare();
            kare.ozellikler(5);
            System.out.println(kare.isimGoster() + " : " + kare.alanHesap());
            
            Dikdortgen dikdortgen = new Dikdortgen();
            dikdortgen.ozellikler(5, 10);
            System.out.println(dikdortgen.isimGoster() + " : " + dikdortgen.alanHesap());
    }
}
