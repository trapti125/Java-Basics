/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author This Pc
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ch,a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("\n 1. Addition\n 2. Subtraction \n 3. divide \n 4. Mod \n 5. Multiply \n 6.Exit ");
        System.out.println("Enter your choice: ");
        ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Addition operation will be performed");
                sum=a+b;
                System.out.println("The answer is: "+sum);
                break;
            case 2: 
                System.out.println("Subtraction operation will be performed ");
                int sub; 
                sub=a-b;
                System.out.println("the answer is: "+sub);
                break;
            case 3: 
                System.out.println("Divide operation will be performed ");
               int div;
               div=a/b;
               System.out.println("the answer is: "+div);
               break;
            case 4: 
                System.out.println("Mod operation will be performed ");
               int Mod;
               Mod=a%b;
               System.out.println("the answer is: "+Mod);
               break;
            case 5: 
                System.out.println("Mod operation will be performed ");
               int mul;
               mul=a*b;
               System.out.println("the answer is: "+mul);
               break;
            default:
                System.out.println("WRONG CHOICE!!!!!");
                break; 
        }
        }
        
        
    }
  
