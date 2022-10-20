/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial3;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class PARCIAL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int ht,s=0,he=0,a,i=0;
        do{
            System.out.println("Cantidad de horas trabajadas");
            ht=sc.nextInt();
            
            if(ht>35){
              he=ht-35;
              s=(he*22)+(35*15);
            }if(ht<=35){
                s=ht*15;
            }
            System.out.println("Su salario es $: "+s);
            System.out.println("Busca conocer otro salario:");
            System.out.println("{1] SI");
            System.out.println("[2] NO");
            a=sc.nextInt();
            i++;
        }while(a==1);
                    
        }
    }
    


