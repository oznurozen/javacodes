/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumkavrami;

/**
 *
 * @author Lenovo
 */
enum araba{
    AUDİ(200),BMW(190),FIAT(150);
    public int hiz;
    araba(int hiz){
        this.hiz= hiz;
    }
}
public class EnumKavrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(araba.AUDİ.hiz);
       System.out.println(araba.BMW.hiz);
       araba.FIAT.hiz=180;
       System.out.println(araba.FIAT.hiz);
    }
    
}
