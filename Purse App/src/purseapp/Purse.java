/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purseapp;

/**
 *
 * @author Steve
 */
public class Purse implements Comparable{
    
    int dollars;
    int quarters;
    int nickels;
    int dimes;
    int pennies;
    
    public void SetDollarAmount(int dollars) {
        this.dollars = dollars;
    }
    
    public void SetQuarterAmount(int quarters) {
        this.quarters = quarters;
    }
   
    public void SetNickelAmount(int nickels) {
        this.nickels = nickels;
    }
    
    public void SetDimeAmount(int dimes) {
        this.dimes = dimes;
    }
    
    public void SetPennyAmount(int pennies) {
        this.pennies = pennies;
    }
    
     
    public Purse(){
        this.dollars = 0;
        this.quarters = 0;
        this.nickels = 0;
        this.dimes = 0;
        this.pennies = 0;
    }
    
    public Purse(int NumDollars,int NumQuarter,int NumNickels,int NumDimes,int NumPennies){
        this.dollars = NumDollars;
        this.quarters = NumQuarter;
        this.nickels = NumNickels;
        this.dimes = NumDimes;
        this.pennies = NumPennies;
    }
    
    public Purse(Purse purse){
        this.dollars = purse.dollars;
        this.quarters = purse.quarters;
        this.nickels = purse.nickels;
        this.dimes = purse.dimes;
        this.pennies = purse.pennies;
    }
    
    public String toString(){
        return "There are "+dollars+" dollars "+quarters+" quarter "+nickels+" nickels "+dimes+" dimes and "+pennies+" pennies in the largest purse ";
    }
    
    public int compareTo(Purse p) {
        if((this.dollars + this.quarters * .25 + this.dimes * .1 + this.nickels * .05 + this.pennies * .01) > (p.dollars + p.quarters * .25 + p.dimes * .1 + p.nickels * .05 + p.pennies * .01) ){
            return 1;   
        }
        else if((this.dollars + this.quarters * .25 + this.dimes * .1 + this.nickels * .05 + this.pennies * .01) < (p.dollars + p.quarters * .25 + p.dimes * .1 + p.nickels * .05 + p.pennies * .01)){
            return -1;
        }
        return 0; 
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}