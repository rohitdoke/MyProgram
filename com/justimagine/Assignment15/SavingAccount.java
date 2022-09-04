//Design another class called as SavingAccount extends Account that contain withdrawAmount. 
package com.justimagine.Assignment15;

public class SavingAccount extends Account {

	
	public void withdrawAmount(int amount)
	{
		
		
		
		if(this.getBalance()>amount)
		{
		
					
					
				
						System.out.println(" previous balance:= "+this.getBalance());
						this.setBalance((this.getBalance())-amount);
						
						
				
						System.out.println("===================================================");
						System.out.println("Account Detail="+this);
						
						System.out.println("===================================================");
						
						
						
						
				
			
						System.out.println("WithdrawAmount="+amount);
			
						System.out.println("Reamening Balance="+this.getBalance());
						System.out.println("===================================================");
						System.out.println("Amount Withdraw Successfully");
						System.out.println("===================================================");
		}
		else if(this.getBalance()==amount)
		{
			
			System.out.println("please amount should be less than "+this.getBalance());
			
			
		}
		else
		{
		
			System.out.println("Insuffcient fund to Withrdraw Amount");
			
		}
	}
}
