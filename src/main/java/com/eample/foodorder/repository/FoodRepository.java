package com.eample.foodorder.repository;
import com.eample.foodorder.model.Customer;
import com.eample.foodorder.model.FoodMenuModel;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface FoodRepository extends CrudRepository<FoodMenuModel, String>{

    FoodMenuModel findByFoodName(String foodName);


}
