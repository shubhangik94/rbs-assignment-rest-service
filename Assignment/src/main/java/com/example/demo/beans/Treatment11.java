package com.example.demo.beans;

/**
 * The Class Treatment11.
 *
 * @author user
 */
/**
 * @author user
 *
 */
public class Treatment11 {
	 
 	/** The id. */
 	int id;
	 
 	/** The treatmenttype. */
 	String treatmenttype;
	 
 	/** The Acc no. */
 	String AccNo;
	 
 	/**
 	 * Instantiates a new treatment 11.
 	 */
 	public Treatment11() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		/**
		 * Instantiates a new treatment 11.
		 *
		 * @param id the id
		 * @param treatmenttype the treatmenttype
		 * @param accNo the acc no
		 */
		public Treatment11(int id, String treatmenttype, String accNo) {
			super();
			this.id = id;
			this.treatmenttype = treatmenttype;
			AccNo = accNo;
		}


		/**
		 * Gets the id.
		 *
		 * @return the id
		 */
		public int getId() {
			return id;
		}


		/**
		 * Sets the id.
		 *
		 * @param id the new id
		 */
		public void setId(int id) {
			this.id = id;
		}


		/**
		 * Gets the treatmenttype.
		 *
		 * @return the treatmenttype
		 */
		public String getTreatmenttype() {
			return treatmenttype;
		}


		/**
		 * Sets the treatmenttype.
		 *
		 * @param treatmenttype the new treatmenttype
		 */
		public void setTreatmenttype(String treatmenttype) {
			this.treatmenttype = treatmenttype;
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
		 * To string.
		 *
		 * @return the string
		 */
		@Override
		public String toString() {
			return "TreatmentTable [id=" + id + ", treatmenttype=" + treatmenttype + ", AccNo=" + AccNo + "]";
		}
		
		
		
		
		

	}
