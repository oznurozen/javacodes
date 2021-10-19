/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomobil;

/**
 *
 * @author Lenovo
 */
public interface Otomobil {
    void hizlan();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.hizlan();
    }
    
}
