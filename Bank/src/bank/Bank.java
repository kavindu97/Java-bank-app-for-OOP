/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Bank {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        int num;
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        age=sc.nextInt();
        if (age<=18){
            System.out.println("select star saving as 1 and goldaccount as 2");
            num=sc.nextInt();
            switch(num){
                case 1:
            SavingsAccount star= new SavingsAccount(445445,"Starsaving","kavi",4500,450,500,500);
            System.out.println(star.AcNo()+" "+star.custName()+" "+star.typeoftheacc()+" "+star.interest()+" "+star.balancebf());
            break;
                case 2:
             GoldsavingsAccount gold= new GoldsavingsAccount(445445,"Goldsaving","radee",4500,450,500,500);
             System.out.println(gold.AcNo()+" "+gold.custName()+" "+gold.typeoftheacc()+" "+gold.interest()+" "+gold.balancebf());
             default:
                    System.out.println("error");
            }
        }
        else if (age>18){
            System.out.println("select power saving as 1 and currentaccount as 2");
            num=sc.nextInt();
           
            switch(num){
                case 1:
                     CurrentAccount cac=new CurrentAccount(445445,"SCurrent","thari",4500,450,500,500,10);
                    System.out.println(cac.AcNo()+" "+cac.custName()+" "+cac.typeoftheacc()+" "+cac.interest()+" "+cac.balancebf()+" "+cac.chequebookchargers());
                    break;
                case 2:
                    PowersavingAccount pow=new PowersavingAccount(445445,"powersaving","kavi",4500,450,500,500);
                    System.out.println(pow.AcNo()+" "+pow.custName()+" "+pow.typeoftheacc()+" "+pow.interest()+" "+pow.balancebf()+" "+pow.bonus());
                    break;
                default:
                    System.out.println("error");
            }
        
    }
    }
    
}
