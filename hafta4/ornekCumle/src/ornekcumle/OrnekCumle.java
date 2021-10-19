/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornekcumle;

/**
 *
 * @author Lenovo
 */  
/*Metotları kullanarak bir cümle oluşturunuz. Örneğin bu «Merhaba Java Dunyasi» 
        olsun. İçindeki boşluk sayısı, harf sayısı, tersten yazılışı, kelime sayısını
        bulan programı yazınız.*/
public class OrnekCumle {
    
    /**
     */
    public static String cumle = "Merhaba Java Dunyasi";
    
    public static void harf(){
        int uzunluk =cumle.length();
        for(int i=0; i<uzunluk; i++){
            if(cumle.charAt(i)==' '){
                uzunluk--;
            }
        }
        System.out.println("Harf sayısı : " + uzunluk);   
    }
    public static void boslukSayisi(){
        char bosluk =' ';
        int boslukSayisi =0;
        for(int i=0; i<cumle.length(); i++){
            if(bosluk==cumle.charAt(i)){
                boslukSayisi++;
            }
        }
        System.out.println("Boşluk Sayısı : " + boslukSayisi);
    }
    public static void kelime(){
        int kelimeSayisi =1;
        for(int i=0; i<cumle.length(); i++){
            if(cumle.charAt(i)==' '){
                kelimeSayisi++;
            }
        }
        System.out.println("Kelime Sayisi : " + kelimeSayisi);
        
    }
    public static void ters(){
        String tersSonuc = "";
        for(int i=cumle.length()-1; i>=0; i--){
            tersSonuc+=cumle.charAt(i);
        }
        System.out.println(tersSonuc);
    }
    
    
    public static void main(String[] args) {
        harf();
        boslukSayisi();
        kelime();
        ters();
      
    }
    
}
