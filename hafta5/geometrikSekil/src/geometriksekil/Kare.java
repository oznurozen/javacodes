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
public class Kare extends GeometrikSekil {
    private double kenar;
    
    public void ozellikler(double kenar){
        isimEkle("kare");
        this.kenar = kenar;
        
    }

    @Override
    public double alanHesap() {
        return kenar*kenar;
    }
    
}
