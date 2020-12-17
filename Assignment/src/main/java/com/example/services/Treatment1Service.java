package com.example.services;


import java.util.List;


import com.example.demo.beans.Treatment11;
import com.example.demo.beans.TreatmentTable1;
import com.example.demo.beans.TreatmentTable2;

/**
 * The Interface Treatment1Service.
 *
 * @author user
 */
public interface Treatment1Service {
	
	
	/**
	 * Gets the treatment 1 details.
	 *
	 * @return the treatment 1 details
	 */
	public List<TreatmentTable1> getTreatment1details();
	
	/**
	 * Gets the treatment by acc no 1.
	 *
	 * @return the treatment by acc no 1
	 */
	public List<TreatmentTable1> getTreatmentByAccNo1(); 
	
	/**
	 * Gets the by holiday start date.
	 *
	 * @return the by holiday start date
	 */
	public List<TreatmentTable1> getByHolidayStartDate();
	
	/**
	 * Gets the by holiday end date.
	 *
	 * @return the by holiday end date
	 */
	public List<TreatmentTable1> getByHolidayEndDate();

	/**
	 * Gets the treatment 2 details.
	 *
	 * @return the treatment 2 details
	 */
	public List<TreatmentTable2> getTreatment2details();
	
	/**
	 * Gets the treatment by acc no.
	 *
	 * @return the treatment by acc no
	 */
	public List<TreatmentTable1> getTreatmentByAccNo();
	
	/**
	 * Gets the by payee account name.
	 *
	 * @return the by payee account name
	 */
	public List<TreatmentTable2> getByPayeeAccountName();
	
	/**
	 * Gets the by payee term.
	 *
	 * @return the by payee term
	 */
	public List<TreatmentTable2> getByPayeeTerm();
	
	/**
	 * Gets the treatmentdetails.
	 *
	 * @return the treatmentdetails
	 */
	public List<Treatment11> getTreatmentdetails();
	
	/**
	 * Gets the treatment by id.
	 *
	 * @param id the id
	 * @return the treatment by id
	 */
	public List<Treatment11> getTreatmentById(int id);
	
	/**
	 * Gets the treatment by treatmenttype.
	 *
	 * @return the treatment by treatmenttype
	 */
	public List<Treatment11> getTreatmentByTreatmenttype();
	
	/**
	 * Gets the treatment by acc no 2.
	 *
	 * @return the treatment by acc no 2
	 */
	public List<Treatment11> getTreatmentByAccNo2();

}
