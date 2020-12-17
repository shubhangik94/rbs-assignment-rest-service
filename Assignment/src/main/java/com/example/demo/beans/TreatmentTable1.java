package com.example.demo.beans;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;


/**
 * The Class TreatmentTable1.
 *
 * @author user
 */
/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
/**
 * @author user
 *
 */
public class TreatmentTable1 {
	
	 /** The Acc no. */
 	String AccNo;
	 
 	/** The Holiday start date. */
 	LocalDate HolidayStartDate;
	 
 	/** The Holiday end date. */
 	LocalDate HolidayEndDate;
	 
 	/** The treatment. */
 	Treatment11 treatment;
	 
 	/**
 	 * Instantiates a new treatment table 1.
 	 *
 	 * @param i the i
 	 * @param string the string
 	 * @param string2 the string 2
 	 */
 	public TreatmentTable1(int i, String string, String string2) {
			super();
			// TODO Auto-generated constructor stub
		}


		/**
		 * Instantiates a new treatment table 1.
		 *
		 * @param accNo the acc no
		 * @param holidayStartDate the holiday start date
		 * @param holidayEndDate the holiday end date
		 * @param treatment the treatment
		 */
		public TreatmentTable1(String accNo, LocalDate holidayStartDate, LocalDate holidayEndDate, Treatment11 treatment) {
			super();
			AccNo = accNo;
			HolidayStartDate = holidayStartDate;
			HolidayEndDate = holidayEndDate;
			this.treatment = treatment;
		}




	

		public TreatmentTable1(String string, LocalDate of, LocalDate of2) {
			// TODO Auto-generated constructor stub
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
		 * Gets the holiday start date.
		 *
		 * @return the holiday start date
		 */
		public LocalDate getHolidayStartDate() {
			return HolidayStartDate;
		}


		/**
		 * Sets the holiday start date.
		 *
		 * @param holidayStartDate the new holiday start date
		 */
		public void setHolidayStartDate(LocalDate holidayStartDate) {
			HolidayStartDate = holidayStartDate;
		}


		/**
		 * Gets the holiday end date.
		 *
		 * @return the holiday end date
		 */
		public LocalDate getHolidayEndDate() {
			return HolidayEndDate;
		}


		/**
		 * Sets the holiday end date.
		 *
		 * @param i the new holiday end date
		 */
		public void setHolidayEndDate(LocalDate HolidayEndDate) {
			HolidayEndDate = getHolidayEndDate() ;
		}


		/**
		 * Gets the treatment.
		 *
		 * @return the treatment
		 */
		public Treatment11 getTreatment() {
			return treatment;
		}


		/**
		 * Sets the treatment.
		 *
		 * @param treatment the new treatment
		 */
		public void setTreatment(Treatment11 treatment) {
			this.treatment = treatment;
		}


		/**
		 * To string.
		 *
		 * @return the string
		 */
		@Override
		public String toString() {
			return "TreatmentTable1 [AccNo=" + AccNo + ", HolidayStartDate=" + HolidayStartDate + ", HolidayEndDate="
					+ HolidayEndDate + ", treatment=" + treatment + "]";
		}


		/**
		 * Gets the id.
		 *
		 * @return the id
		 */
		public String getId() {
			// TODO Auto-generated method stub
			return null;
		}


		
		
		
		

	}
