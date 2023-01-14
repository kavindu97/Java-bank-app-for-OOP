/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Hp
 */
 class CurrentAccount extends Account{
     private double numofcheques;
     public CurrentAccount(int AcNo,String TypeoftheAccount,String custName,double balancebfpre,double totaldeposit,double bankchargers,double totalwithdrawal, double numofcheques){
         super( AcNo, TypeoftheAccount, custName, balancebfpre, totaldeposit, bankchargers, totalwithdrawal);
         this.numofcheques=numofcheques;
     }
    public double numofcheques(){
        return numofcheques;
    }
    public double chequebookchargers(){
        return numofcheques()*50;
    }
     @Override
    public double interest(){
        return (balancebfpre()+totaldeposit()-bankchargers()-totalwithdrawl())*1.4/100;
    }
     @Override
    public double balancebf(){
       return balancebfpre()+totaldeposit()-bankchargers()-totalwithdrawl()+interest()-chequebookchargers(); 
    }
        
}
