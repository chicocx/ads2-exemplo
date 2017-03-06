/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.socket;

/**
 *
 * @author Francisco
 */
public class ExemploFinally {

    public static void metodoQualquer(int v){
        try{
            if(v > 10){
                return;
            }else{
                System.out.println("Sair...");
            }

            
        }finally{
            System.out.println("Sempre executado");
            
        }
    }
    
    public static void main(String[] args) {
        metodoQualquer(100);
    }
    
}
