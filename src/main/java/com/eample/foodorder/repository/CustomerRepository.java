package com.eample.foodorder.repository;

import com.eample.foodorder.model.Customer;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
