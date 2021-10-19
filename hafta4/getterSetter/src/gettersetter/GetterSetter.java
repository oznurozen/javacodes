/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettersetter;

/**
 *
 * @author Lenovo
 */
public class GetterSetter {
    private int yas;
    private String ad;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public static void main(String[] args) {
        GetterSetter kisi = new GetterSetter();
        kisi.setYas(20);
        System.out.println(kisi.getYas());
        
        kisi.setAd("oznur");
        System.out.println(kisi.getAd());
        
    }
    
}
