/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev;

/**
 *
 * @author Lenovo
 */
public class Ev {
    public void kasa(){
        System.out.println("az Gizli Kasa");
    }
    public String dokuman ="az Gizli Belge";

    public static void main(String[] args) {
        Ev baba = new Ev();
        baba.kasa();
        System.out.println(baba.dokuman);
    }
    
}
