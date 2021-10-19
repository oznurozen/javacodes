/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hayvan;

/**
 *
 * @author Lenovo
 */
public class Hayvan {
    public void yemeIcme(){
        System.out.println("Yeme içme faaliyetleri");
    }

  
    public static void main(String[] args) {
        Surungen surungen = new Surungen();
        surungen.yemeIcme();
        System.out.println("Sürünür.");
    }
    
}
