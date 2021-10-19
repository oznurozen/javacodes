/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calisan;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
       //işci
       Isci isci =new Isci();
       isci.calisanBolumu();
       isci.ucretBelirleme(5000.95);
       System.out.println("Maaşı : " + isci.ucret());
       
       //müdür
       Mudur mudur = new Mudur();
       mudur.calisanBolumu();
       mudur.ucretBelirleme(6000.8);
       System.out.println("Maaşı : " + mudur.ucret());
       
       //satış elemanı
       
       SatisElemani satisElemani = new SatisElemani();
       satisElemani.calisanBolumu();
       satisElemani.ucretBelirleme(1000.18);
       satisElemani.satisPrimiBelirleme(2000);
       System.out.println("Prim ücreti :" + satisElemani.prim);
       System.out.println("Maaşı : " + satisElemani.ucret());
       
    } 
    
}
