/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Lenovo
 */
public class Dog extends Animal {
    Dog(String ad){
        super.setAd("Karabaş");
        super.setSes("Hav Hav");
        super.setTur("Golden");
    }

    Dog(String karabaş, String kangal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String hayvanBilgisi(){
        return super.getHayvanBilgisi();
    }
    
}
