package com.eample.foodorder.controller;
import com.eample.foodorder.model.Customer;
import com.eample.foodorder.model.FoodMenuModel;
import com.eample.foodorder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@RestController
@Controller
public class CustomerController {
    //autowired the StudentService class
    @Autowired
    CustomerService customerService;

    @RequestMapping(value="/save",method= RequestMethod.POST)
    public ModelAndView save(@ModelAttribute Customer customer)
    {
        //hi com
//        Customer customer1=new Customer();,fleji
//        customer1.setName("krishna");
//        customer1.setEmail("kr@mail.om");
        customerService.saveOrUpdate(customer);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("customer-data");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }//guygr

    //creating post mapping that post the customer detail in the database
//    @PostMapping("/customer")
    @RequestMapping(value="/customer",method= RequestMethod.POST)
    private ModelAndView saveCustomer(@RequestBody Customer customer)
    {
      customerService.saveOrUpdate(customer);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("customer-data");
        modelAndView.addObject("customer",customer);
        return modelAndView;
    }
    @GetMapping("/orderfood/{name}")
    private String orderFood(@PathVariable("name") String foodName){
        return customerService.findUserByFoodName(foodName);
    }
    @GetMapping("/getMenu")
    private List<FoodMenuModel> getFoodMenu(){
        return customerService.getFoodMenu();
    }

}
