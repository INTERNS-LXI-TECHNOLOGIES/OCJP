	package com.fintech;

	import java.sql.Timestamp;
	import java.time.LocalDateTime;

	public interface ComplianceCheckable extends Auditable {

		
		private void log (String transactionId) {
		
			LocalDateTime timestamp = LocalDateTime.now();
			
			System.out.println(
			
				timestamp + " | " + getRegulation() + " | " + transactionId
			
			);
		
		}


		static String getRegulation() {
		
			return "Fintech Regulation";
		
		}


		default void auditTransactionId (String transactionId) {
		
			log(transactionId);
		
		}





	}