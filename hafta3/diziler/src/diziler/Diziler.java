/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziler;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /* int[] dizi={1,2,3,4,5};
        String [] dizi1 ={"Mehmet","Ahmet"};
        
        int [] sayi = new int[5];
        
        int dizi2[];
        dizi2= new int[]{1,2,3,4,5};        
        
       int [] sayi= new int[5];
        sayi[0]=1;
        sayi[1]=2;
        sayi[2]=3;
        sayi[3]=4;
        sayi[4]=5;
        System.out.println(sayi[1]);*/
        
        /*Dizileri kullanarak 1’den 10’a kadar olan sayıları 
        ekrana yazdıran programı yazınız.
        int [] dizi = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<dizi.length; i++){
            System.out.println(dizi[i]);
            
        }*/
        /*Dizileri kullanarak 1’den 10 a kadar rastgele ve
        benzersiz sayıları ekrana çıktı veren programı yazınız.
        int [] dizi = new int[10];
        for(int i=0; i<10; i++){
            Random rastgele = new Random();
            int sayi = rastgele.nextInt(100)+1;
            dizi[i]= sayi;
            System.out.println(sayi);
        }*/
    /*İnt türünde bir dizi oluşturun içerisine veriler ekleyin. 
        Dizinin kaç elemandan oluştuğunu ekrana yazdıran programı yazınız.
    int [] dizi={1,2,5,6,7,8,9,4,10,8};
    System.out.println(dizi.length);*/
    
    /*Bir dizi oluşturun ve içerisine 5 adet isim atayınız ve
    ikinci atadığınız ismi ekrana çıktı veriniz.
    String [] dizi={"Oznur", "Ahmet", "Yusuf", "Ali", "Ahmet"};
    System.out.println(dizi[1]);
    
    //veya
    String [] isim = new String[5];
    isim[0]= "Oznur";
    isim[1]= "Ahmet";
    isim[2]= "Yusuf";
    isim[3]= "Ali";
    isim[4]= "Ahmet";
    System.out.println(isim[1]);*/
   
    //Gelişmiş for dongusu
    /*5 elemanlı bir dizi oluşturun ve dizinin elemanları sırasıyla 3*i şeklinde artış göstersin. Dizinin her bir
    elemanını ekrana yazdıran kodu yazınız
    int dizi[] = {1,2,3,4,5};
    for(int i:dizi){
        System.out.println(3*i);
    }*/
    //object sinif
    /*Object sınıfını kullanarak 5 elemanlı bir dizi 
    oluşturunuz ve bu dizi içerisindeki tüm elemanları ekrana yazdırınız.

    Object dizi[] = new Object[5];
    dizi[0]="Mehmet";
    dizi[1]= 5 ;
    dizi[2]= 'A';
    dizi[3]=5.9;
    dizi[4]="Ahmet";
    for( int i=0; i<dizi.length; i++){
        System.out.println(dizi[i]);
    }*/
    
    /*Sayısal veri türünde bir dizi oluşturun ve arrays sınıfını 
    projeniz içerisinde kullanarak bu verileri sıralı bir şekilde 
    ekrana yazdırınız.
    int [] siralama = {1,8,5,2};
    Arrays.sort(siralama);
    for(int i=0; i<siralama.length; i++){
        System.out.println(siralama[i]);
    }*/
    /*Metinsel veri türünde bir dizi oluşturunuz ve bu dizi içerisine 
    veriler ekleyiniz. Ardından bu metinsel değerleri sıralı bir şekilde 
    ekrana çıktı veriniz.
    */
    String [] siralama = {"Ahmet","veli", "Ali","Yusuf"};
    Arrays.sort(siralama);
    for(int i=0; i<siralama.length; i++){
        System.out.println(siralama[i]);
    }
    
    }
    
}
