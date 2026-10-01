
package com.fintech;
import java.time.LocalDateTime;

public interface ComplaintsCheckable extends Auditable{

private void log(String transactionId){
	
LocalDateTime dateTime  = LocalDateTime.now();

System.out.println("Audit Log");
System.out.println("Time & Date :" + dateTime);
System.out.println("Transaction Id " + transactionId);


}

@Override
default public void auditTransaction(String transactionId){
	
	System.out.println("Auditing");
	
	log(transactionId);
	
}


public static String getRegulation(){
	
	
return "";	
	
	
	
}


}