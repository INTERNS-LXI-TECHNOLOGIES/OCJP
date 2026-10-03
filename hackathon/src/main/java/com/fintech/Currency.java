	package com.fintech;


	public enum Currency  {

		INR("₹"),
		USD("$"),
		GBP("£"),
		CHF("Fr.");
		
		private String symbol ;
		
	     Currency (String symbol) {
			
			this.symbol = symbol;
			
		}
		
		
		
	public String getSymbol() {
		
		return symbol;
		
	}	

	}