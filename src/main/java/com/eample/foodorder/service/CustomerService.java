package com.eample.foodorder.service;

import com.eample.foodorder.model.Customer;
import com.eample.foodorder.model.FoodMenuModel;
import com.eample.foodorder.repository.CustomerRepository;
import com.eample.foodorder.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void saveOrUpdate(Customer customer) {
        customerRepository.save(customer);
    }

    @Autowired
    FoodRepository foodRepository;

    public String findUserByFoodName(String foodName) {
        FoodMenuModel foodName1 = foodRepository.findByFoodName(foodName);
        if (foodName1 == null) {
            return "not avilale";
        } else {
            return foodName1.getFoodName() + "   succesfully ordered";
        }

    }

    public List<FoodMenuModel> getFoodMenu() {
        return (List<FoodMenuModel>) foodRepository.findAll();

    }
}