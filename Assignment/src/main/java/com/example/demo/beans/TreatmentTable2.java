package com.example.demo.beans;


/**
 * The Class TreatmentTable2.
 *
 * @author user
 */
public class TreatmentTable2 {
	 
 	/** The Acc no. */
 	String AccNo;
	 
 	/** The Payee account name. */
 	String PayeeAccountName;
	 
 	/** The Payee term. */
 	int PayeeTerm;
	 
 	/** The treatmenttable 1. */
 	TreatmentTable1 treatmenttable1;
		
		/**
		 * Instantiates a new treatment table 2.
		 */
		public TreatmentTable2() {
			super();
			// TODO Auto-generated constructor stub
		}


		/**
		 * Instantiates a new treatment table 2.
		 *
		 * @param accNo the acc no
		 * @param payeeAccountName the payee account name
		 * @param payeeTerm the payee term
		 */
		public TreatmentTable2(String accNo, String payeeAccountName, int payeeTerm) {
			super();
			AccNo = accNo;
			PayeeAccountName = payeeAccountName;
			PayeeTerm = payeeTerm;
			this.treatmenttable1 = treatmenttable1;
		}


		/**
		 * Gets the acc no.
		 *
		 * @return the acc no
		 */
		public String getAccNo() {
			return AccNo;
		}


		/**
		 * Sets the acc no.
		 *
		 * @param accNo the new acc no
		 */
		public void setAccNo(String accNo) {
			AccNo = accNo;
		}


		/**
		 * Gets the payee account name.
		 *
		 * @return the payee account name
		 */
		public String getPayeeAccountName() {
			return PayeeAccountName;
		}


		/**
		 * Sets the payee account name.
		 *
		 * @param payeeAccountName the new payee account name
		 */
		public void setPayeeAccountName(String payeeAccountName) {
			PayeeAccountName = payeeAccountName;
		}


		/**
		 * Gets the payee term.
		 *
		 * @return the payee term
		 */
		public int getPayeeTerm() {
			return PayeeTerm;
		}


		/**
		 * Sets the payee term.
		 *
		 * @param payeeTerm the new payee term
		 */
		public void setPayeeTerm(int payeeTerm) {
			PayeeTerm = payeeTerm;
		}


		/**
		 * Gets the treatmenttable 1.
		 *
		 * @return the treatmenttable 1
		 */
		public TreatmentTable1 getTreatmenttable1() {
			return treatmenttable1;
		}


		/**
		 * Sets the treatmenttable 1.
		 *
		 * @param treatmenttable1 the new treatmenttable 1
		 */
		public void setTreatmenttable1(TreatmentTable1 treatmenttable1) {
			this.treatmenttable1 = treatmenttable1;
		}


		/**
		 * To string.
		 *
		 * @return the string
		 */
		@Override
		public String toString() {
			return "TreatmentTable2 [AccNo=" + AccNo + ", PayeeAccountName=" + PayeeAccountName + ", PayeeTerm=" + PayeeTerm
					+ ", treatmenttable1=" + treatmenttable1 + "]";
		}
		
		
		
		
		
		
		

	}
