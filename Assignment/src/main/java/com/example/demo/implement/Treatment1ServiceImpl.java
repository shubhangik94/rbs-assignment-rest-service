package com.example.demo.implement;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.beans.Treatment11;
import com.example.demo.beans.TreatmentTable1;
import com.example.demo.beans.TreatmentTable2;
import com.example.services.Treatment1Service;



// TODO: Auto-generated Javadoc
/**
 * The Class Treatment1ServiceImpl.
 *
 * @author user
 */
public class Treatment1ServiceImpl implements Treatment1Service {



	/** The treatments 2. */
	static List<TreatmentTable2> treatments2 =new ArrayList<TreatmentTable2>();



	/**
	 * Gets the treatment 2 details.
	 *
	 * @return the treatment 2 details
	 */
	@Override
	public List<TreatmentTable2> getTreatment2details() {
		// TODO Auto-generated method stub
		return treatments2;
	}

	/**
	 * Gets the by payee account name.
	 *
	 * @return the by payee account name
	 */
	@Override
	public List<TreatmentTable2> getByPayeeAccountName() {
		// TODO Auto-generated method stub
		return treatments2;
	}

	/**
	 * Gets the by payee term.
	 *
	 * @return the by payee term
	 */
	@Override
	public List<TreatmentTable2> getByPayeeTerm() {
		// TODO Auto-generated method stub
		return treatments2;
	}

	@Override
	public List<TreatmentTable1> getTreatment1details() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TreatmentTable1> getTreatmentByAccNo1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TreatmentTable1> getByHolidayStartDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TreatmentTable1> getByHolidayEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TreatmentTable1> getTreatmentByAccNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Treatment11> getTreatmentdetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Treatment11> getTreatmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Treatment11> getTreatmentByTreatmenttype() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Treatment11> getTreatmentByAccNo2() {
		// TODO Auto-generated method stub
		return null;
	}


}
