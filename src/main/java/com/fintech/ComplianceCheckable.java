package com.fintech;
import java.time.LocalDateTime;
public interface ComplianceCheckable extends Auditable {
	private void log(String transactionId){
	System.out.println(LocalDateTime.now()+" "+transactionId);
	}
	public static String regulation(){
		return "regulation";
	}
	default void auditTranscation(String transactionId){
		System.out.println(transactionId);
	}
	
}