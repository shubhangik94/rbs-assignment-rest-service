package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.beans.Treatment11;
import com.example.demo.beans.TreatmentTable1;
import com.example.demo.beans.TreatmentTable2;
import com.example.demo.implement.Treatment1ServiceImpl;




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
@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {

		SpringApplication.run(AssignmentApplication.class, args);


		Scanner sc=new Scanner(System.in);
		Treatment1ServiceImpl e=new Treatment1ServiceImpl();

		do {
			System.out.println("1.Streams To get the Treatment list for FindFirst \n "
					+ "11.Streams To get the Treatment list \n "
					+ "2.Streams To get the Treatment list for FlatMap \n."
					+ "12.Streams To get the Treatment Table list \n"
					+ "\n 3.Streams to get first Treatment with payee Account name as Rekha"
					+ "\n 4.Streams To get the Treatment1 listfrom map\n"
					+ "\n 14.Streams To get the Treatment list for Predicate \n"
					+ "\n 5.Exit ");

			switch(sc.nextInt())
			{
			case 1: System.out.println("Streams To get the Treatment list for FindFirst--------> ");
			List<Treatment11> treatments11 =new ArrayList<Treatment11>();
			treatments11.add(new Treatment11(101,"shubhangi","MPH1234"));
			treatments11.add(new Treatment11(102,"jaydeep","MPH1235"));
			treatments11.add(new Treatment11(103,"sandeep","MPH1236"));
			treatments11.add(new Treatment11(104,"manoj","MPH1237"));

			Treatment11 FindFirst=treatments11.stream().findFirst().get();
			System.out.println("FindFirst" +FindFirst );
			break;

			case 11: System.out.println("Streams To get the Treatment list  --------> ");
			List<Treatment11> treatments101 =new ArrayList<Treatment11>();
			treatments101.add(new Treatment11(101,"shubhangi","MPH1234"));
			treatments101.add(new Treatment11(102,"jaydeep","MPH1235"));
			treatments101.add(new Treatment11(103,"sandeep","MPH1236"));
			treatments101.add(new Treatment11(104,"manoj","MPH1237"));

			List<Treatment11> TreatmentList=treatments101.stream().collect(Collectors.toList());
			System.out.println("TreatmentList" +TreatmentList );

			break;

			case 2: System.out.println("Streams To get the Treatment list for FlatMap");

			List<String> FlatMap = Arrays.asList("Rekha", "Janani", "suraj", "shubhangi");
			List<String> FlatMap1 = Arrays.asList("RK", "JN", "SN" ,"SK");

			List<List<String>> flat = new ArrayList<List<String>>(); 
			flat.add(FlatMap);
			flat.add(FlatMap1);

			List<String> flatMapList = flat.stream().flatMap(hList -> hList.stream()).collect(Collectors.toList()); 
			System.out.println(flatMapList);   
			break;

			case 12: System.out.println("Streams To get the Treatment Table list ");
			List<TreatmentTable2> treatments2 =new ArrayList<TreatmentTable2>();
			treatments2.add(new TreatmentTable2("MPH12", "REKHA" ,5));
			treatments2.add(new TreatmentTable2("MPH13", "Janani" ,8));
			List<TreatmentTable2> TreatmentTableList=treatments2.stream().collect(Collectors.toList());
			System.out.println("FindFirst" +TreatmentTableList );

			break;

			case 3: System.out.println("Streams to get first Treatment with payee Account name as Rekha");
			String PayeeAccountName=sc.next();
			List<TreatmentTable2> Payee= e.getByPayeeAccountName()
					.stream().filter((b)-> b.getPayeeAccountName()
							.equalsIgnoreCase(PayeeAccountName))
					.collect(Collectors.toList());
			Payee.forEach(System.out::println);

			break;

			case 4: 	System.out.println("Streams To get the Treatment list for Map---------------> ");


			Map<Integer,String> map = new HashMap<Integer,String>(); 
			map.put(101, "MPH1234");
			map.put(102, "MPH1235");
			map.put(103, "MPH1235");
			System.out.println("\n1.  List of key ...");
			List<Integer> result = map.keySet().stream()
					.collect(Collectors.toList());

			result.forEach(System.out::println );

			break;

			case 14: 	System.out.println("Streams To get the Treatment list for Predicate---------------> ");
			List<Treatment11> treatments14 =new ArrayList<Treatment11>();
			treatments14.add(new Treatment11(101,"shubhangi","MPH1234"));
			treatments14.add(new Treatment11(102,"jaydeep","MPH1235"));
			treatments14.add(new Treatment11(103,"sandeep","MPH1236"));
			treatments14.add(new Treatment11(104,"manoj","MPH1237"));
			Predicate<Treatment11> p1 = c -> c.getId() >102;
			treatments14.stream().filter(p1).forEach(System.out::println);

			break;

			case 5:System.out.println("Thank You"); sc.close(); System.exit(0);




			default: System.out.println("invalid option");
			}
		}while(true);



	}

	private <U, T extends Object> U getTreatmenttype(T t1) {
		return null;
	}

}


