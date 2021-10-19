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
public abstract class GeometrikSekil {
    private String isim;
    
    public void isimEkle(String isim){
        this.isim=isim;
    }
    public String isimGoster(){
        return this.isim;
    }
    
    public abstract double alanHesap();

    /**
     * @param args the command line arguments
     */

    
}
