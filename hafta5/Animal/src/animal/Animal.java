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
public class Animal {

    String ad;
    private String ses,tur,hayvanBilgisi;

    public String getHayvanBilgisi() {
        return hayvanBilgisi;
    }

    public void setHayvanBilgisi(String hayvanBilgisi) {
        this.hayvanBilgisi = hayvanBilgisi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
   
    Animal(){
        System.out.println("Animal Constructor.");
    }
    Animal(String ad, String ses, String tur){
        this.ad = ad;
        this.ses= ses;
        this.tur=tur;
        
    }
    public static void main(String[] args) {
        Animal dog = new Dog("Karabaş", "Kangal");
        Animal cat = new Cat("Tekir");
        
        System.out.println(dog.getHayvanBilgisi());
        System.out.println(cat.getHayvanBilgisi());
    }
    
}
