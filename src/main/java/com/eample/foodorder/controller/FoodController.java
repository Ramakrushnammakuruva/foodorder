package com.eample.foodorder.controller;
import com.eample.foodorder.model.FoodMenuModel;
import com.eample.foodorder.service.FoodServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    @GetMapping("/getfood")//vvsdss
    public  String getFood(){
        return "biryani";
    }
    @Autowired
   FoodServie foodService;

    @RequestMapping("/foodMenuList")
    @ResponseBody
    public Iterable<FoodMenuModel> findAll()
    {
        Iterable<FoodMenuModel> foodMenuModels = foodService.findAll();
        return foodMenuModels;
    }

}
