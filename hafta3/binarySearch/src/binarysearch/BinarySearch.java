/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* int arama [] = {1,40,8,72,50,90}; dizisini oluşturun içerisinde bulunan 
        2. elemanı binarySearch ile aramasını gerçekleştirerek indisine ulaşan programı yazınız.

        int arama [] = {1,40,8,72,50,90};
        Arrays.sort(arama);//1,8,40,50,72,90
        int deger = Arrays.binarySearch(arama, 40);
        System.out.println(deger);*/
        /*Örnek: 2 dizi oluşturun ve her birinin içerisine tek karakter atayın ardından 
        eşitlik kontrolünü sağlayarak bir çıktı veriniz.

        char[] dizi={'a'};
        char[] dizi1={'z'};
        if(Arrays.equals(dizi, dizi1)==false){
            System.out.println("Eşit Değildir");
        }
        else{
            System.out.println("Eşittir");
        }*/
        
        /*Örnek: 2 dizi oluşturun ve ardından her birinin içerisine 2 adet sayısal değer 
        atayarak karşılaştırma işlemini gerçekleştiriniz.
        
        int[] i ={1,2};
        int[] j = {2,3};
        if(Arrays.equals(i, j)==false){
            System.out.println("Eşit değildir.");   
        }
        else{
            System.out.println("Eşittir.");
        }
        
        int [] sayi = {1,6,9,10};
        System.out.println(Arrays.toString(sayi));
        int dizi[][] = {{1,33}, {5,88}};
        System.out.println(dizi[1][1]);*/
        
        /*int türünde çok boyutlu bir dizi oluşturun ve tüm elemanları çıktı olarak veriniz.
        int [][] dizi= {{2,3},{4,5},{6,7}};
        for(int i=0;i<3; i++){
            System.out.println();
            for(int j=0; j<2; j++){
                System.out.print(dizi[i][j] + " ");
            }
        }*/
        
        /*String türünde çok boyutlu bir dizi oluşturun (3x3 matraisli) ve tüm elemanları 
        çıktı olarak veriniz. Abc def ghı şeklinde ilerlesin.

        Bir önceki soruda bulunan dizinin e elemanını çıktı olarak veriniz.
        */
        
        String [][] dizi = {{"a","b","c"},{"d","e","f"},{"g","h","ı"}};
        for(int i=0; i<3;i++){
            System.out.println();
            for(int j=0; j<3; j++){
                System.out.print(dizi[i][j]+ " ");
                
                
            }
        }
        System.out.println();
        System.out.println(dizi[1][1]);
    }
    
}
