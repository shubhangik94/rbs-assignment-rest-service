package com.example.demo.beans;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * The Class Treatment11Test.
 *
 * @author user
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class Treatment11Test {

	 /**
 	 * Inits the.
 	 */
 	@Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }

	 /**
 	 * Test treatment 11.
 	 */
 	@Test
	 public void testTreatment11()
	 {
		 Treatment11 Treatment = new Treatment11();
		 Treatment.getAccNo();
		 Treatment.setAccNo("MPH101");
		 Treatment.getId();
		 Treatment.setId(10);
		 Treatment.getTreatmenttype();
		 Treatment.setTreatmenttype("treatmenttype");
	 }

	 /**
 	 * Test treatment table 1.
 	 */
 	@Test
	 public void testTreatmentTable1()
	 {
		 
		 TreatmentTable1 treatmentTable1 = new TreatmentTable1(null, null, null, null);
		 treatmentTable1.getAccNo();
		 treatmentTable1.setAccNo("accNo");
		 treatmentTable1.getHolidayEndDate();
		 treatmentTable1.setHolidayStartDate(LocalDate.now());
		 treatmentTable1.setHolidayEndDate(LocalDate.now());
		 treatmentTable1.getHolidayEndDate();
		 treatmentTable1.getTreatment();
		 treatmentTable1.setTreatment(null);
		 
	 }
	 
	 /**
 	 * Test treatment table 2.
 	 */
 	@Test
	 public void testTreatmentTable2()
	 {
		 TreatmentTable2 TreatmentTable = new TreatmentTable2();
		 TreatmentTable.getAccNo();
		 TreatmentTable.setAccNo("accNo");
		 TreatmentTable.getPayeeAccountName();
		 TreatmentTable.setPayeeAccountName("payeeAccountName");
		 TreatmentTable.getPayeeTerm();
		 TreatmentTable.setPayeeTerm(100000);
		 TreatmentTable.getTreatmenttable1();
		 TreatmentTable.setTreatmenttable1(null);
		 
				 
	 }
	 
}
