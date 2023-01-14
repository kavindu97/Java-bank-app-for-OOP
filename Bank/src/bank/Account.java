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
public class Account {
    private int AcNo;
    private String TypeoftheAccount;
    private String custName;
    
    
    private double balancebfpre;
    private double totaldeposit;
    private double bankchargers;
    private double totalwithdrawal;
    
    public Account(int AcNo,String TypeoftheAccount,String custName,double balancebfpre,double totaldeposit,double bankchargers,double totalwithdrawal){
        this.AcNo=AcNo;
        this.TypeoftheAccount=TypeoftheAccount;
        this.balancebfpre=balancebfpre;
        this.bankchargers=bankchargers;
        this.custName=custName;
        this.totaldeposit=totaldeposit;
        this.totalwithdrawal=totalwithdrawal;
    }
    public double balancebfpre(){
        return balancebfpre;
    }
    public double totaldeposit(){
        return totaldeposit;
    }
    public double bankchargers(){
        return bankchargers;
    }
    public double totalwithdrawl(){
        return totalwithdrawal;
    }
    public double AcNo(){
        return AcNo;
    }
    public String typeoftheacc(){
        return TypeoftheAccount;
    }
    public String custName(){
        return custName;
    }
    public double interest(){
        return (balancebfpre()+totaldeposit()-bankchargers()-totalwithdrawl())*1.2/100;
    }
    public double balancebf(){
        return balancebfpre()+totaldeposit()-bankchargers()-totalwithdrawl()+interest();
    }
}
