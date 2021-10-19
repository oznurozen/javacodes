/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumaylar;

/**
 *
 * @author Lenovo
 */
enum aylar{
    OCAK,SUBAT,MART
}
public class EnumAylar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ay = aylar.SUBAT.ordinal();
        switch(ay){
        case 0:
            System.out.println("Ocak");
            break;
        
        case 1:
            System.out.println("2. aySubat");
            break;
            
        case 2:
            System.out.println("Mart");
            break;
            
    }
        
    }
    
}
