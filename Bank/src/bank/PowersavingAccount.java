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
class PowersavingAccount extends Account {
    public PowersavingAccount(int AcNo,String TypeoftheAccount,String custName,double balancebfpre,double totaldeposit,double bankchargers,double totalwithdrawal){
        super( AcNo,TypeoftheAccount,custName,balancebfpre,totaldeposit,bankchargers, totalwithdrawal);
    }
    public double bonus(){
        return interest();
    }
    @Override
    public double balancebf(){
        return balancebfpre()+totaldeposit()-bankchargers()-totalwithdrawl()+interest()-bonus();
    }
}
