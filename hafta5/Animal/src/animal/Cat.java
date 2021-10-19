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
public class Cat extends Animal{
    Cat(String ad){
        super.setAd("Tekir");
        super.setSes("Miyav");
        super.setTur("Scottish fold"); 
    }
    public String hanyanBilgisi(){
        return super.getHayvanBilgisi();
    }
    
}
