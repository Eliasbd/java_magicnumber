/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic;

/**
 *
 * @author Hosanna
 */

import java.util.Scanner;

        
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        int opc;
        int times = 0;
        
        
        
        cont = (int) (Math.random() * 10) + 1;
        
        
        
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese el numero magico =   ");
        opc = tec.nextInt();
        
        
        
            
            while(cont != opc){
                if((opc - 1) == cont || (opc - 2) == cont){
                    System.out.println("Caliente");
                    times ++;
                    
                    
                    System.out.println("Ingrese el numero magico =   ");
                    opc = tec.nextInt();
                    
                }else if((opc + 1) == cont || (opc + 2) == cont){
                    System.out.println("Caliente");
                    times++;
                    
                    
                    System.out.println("Ingrese el numero magico =   ");
                    opc = tec.nextInt();
                    
                }else{
                    System.out.println("Frio");
                    times++;
                     
                    
                    System.out.println("Ingrese el numero magico =   ");
                        opc = tec.nextInt();
                }
                    
                    
                }
                    if(opc == cont){
                        times++;
                        
                    System.out.println("Felicidades ☺☺☻☻♥♦♣");
                    System.out.println("Intentos     " +     times);
                    
                    
                   
                    
                }
            
            
                    
                    
                
        
        
        
        
            
        } 
        
        
     
        
        
        
        
      
    }
    

    

