/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canli;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Canli canli = new Canli();
        Insan insan = new Insan();
        Hayvan hayvan = new Hayvan();
        Bitki bitki = new Bitki();
        
        Polimorfizm.nesneAl(canli);
        Polimorfizm.nesneAl(insan);
        Polimorfizm.nesneAl(hayvan);
        Polimorfizm.nesneAl(bitki);
    }
}
