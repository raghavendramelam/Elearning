package com.raghava.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raghava.repository.CustRepository;
@Component
public class TestRunner implements CommandLineRunner {
  @Autowired	
  private CustRepository cr;
	@Override
	public void run(String... args) throws Exception {

	//	cr.findBycustnameEquals("Raghava").forEach(System.out::println);
	//	cr.findBycustnameIs("Raghava").forEach(System.out::println);
	//	cr.findBycustloc("Bangalore").forEach(System.out::println);
	//	cr.findBycustnameStartsWith("Ra").forEach(System.out::println);
	//	cr.findBycustnameEndsWith("a").forEach(System.out::println);
		//cr.findBycustnameContaining("va").forEach(System.out::println);
	//	cr.findByBillamtLessThan(80000f).forEach(System.out::println);
	//	cr.findByBillamtLessThanEqual(30000f).forEach(System.out::println);
	//	cr.findByCustidBetween(3, 9).forEach(System.out::println);
	//	cr.findByCustidBetweenOrderByCustnameDesc(3, 9).forEach(System.out::println);
		cr.findByCustidBetweenOrderByCustnameAsc(3, 9).forEach(System.out::println);
		
		
	
	}

}
