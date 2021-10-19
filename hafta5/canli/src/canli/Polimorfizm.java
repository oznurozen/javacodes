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
public class Polimorfizm {
    public static void nesneAl(Canli canlilar){
        if (canlilar instanceof Canli){
            Canli canli = canlilar;
            canli.metod();
        }
        else if (canlilar instanceof Insan){
            Insan insan = (Insan)canlilar;
            insan.metod();
        }
        else if(canlilar instanceof Hayvan){
            Hayvan hayvan = (Hayvan)canlilar;
            hayvan.metod();
        }
        else if(canlilar instanceof Bitki){
            Bitki bitki = (Bitki) canlilar;
            bitki.metod();
            
        }
    }
}
