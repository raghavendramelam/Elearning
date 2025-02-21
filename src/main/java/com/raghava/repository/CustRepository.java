package com.raghava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.raghava.entity.CustomerDetails;


public interface CustRepository extends JpaRepository<CustomerDetails,Integer> {
	
	public List<CustomerDetails> findBycustnameEquals(String name);
	public List<CustomerDetails> findBycustnameIs(String name);
	public List<CustomerDetails> findBycustloc(String name);
	public List<CustomerDetails> findBycustnameStartsWith(String name);
	public List<CustomerDetails> findBycustnameEndsWith(String name);
	public List<CustomerDetails> findBycustnameContaining(String name);
	public List<CustomerDetails> findByBillamtLessThan(Float amt);
	public List<CustomerDetails> findByBillamtLessThanEqual(Float amt);
	public List<CustomerDetails> findByCustidBetween(int id1,int id2);
	public List<CustomerDetails> findByCustidBetweenOrderByCustnameDesc(int id1,int id2);
	public List<CustomerDetails> findByCustidBetweenOrderByCustnameAsc(int id1,int id2);
	


}
