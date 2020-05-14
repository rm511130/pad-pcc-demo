package io.pivotal.repo.jpa;

import io.pivotal.domain.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository("JpaCustomerRepository")
public interface CustomerRepository extends JpaRepository<Customer, String> {

	//@Query("SELECT e FROM customer e WHERE e.email LIKE %?1%")
	List<Customer> findByEmail(final String email);
}
