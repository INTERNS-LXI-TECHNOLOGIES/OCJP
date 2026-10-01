package com.fintech;

public enum Currency{


USD("$"),GBP("£"),EUR("€"),INR("₹");


public String symbol;



 Currency(String symbol){
	
	this.symbol = symbol;
	
	
}


  public String getSymbol() {
	  
	  
	  return this.symbol;
	  
        
    }



}