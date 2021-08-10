package com.eample.foodorder.service;

import com.eample.foodorder.model.FoodMenuModel;
import com.eample.foodorder.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FoodServie {
    @Autowired
    FoodRepository foodRepository;

    public Iterable<FoodMenuModel> findAll() {
       // return foodRepository.findAll();
        Iterable<FoodMenuModel> al=foodRepository.findAll();
        System.out.println(al.toString());
        /*********************TreeMap***********************
        TreeMap<Integer, FoodMenuModel> map= new TreeMap<Integer, FoodMenuModel>();
        for (FoodMenuModel fm:al) {
            String price = fm.getFoodPrice();
            int priceint = Integer.parseInt(fm.getFoodPrice());
            map.put(priceint,fm);
            //System.out.println(foodMenuModelArrayList.size());
        }
        System.out.println(map);
        ArrayList<FoodMenuModel> foodMenuModelArrayList=new ArrayList<FoodMenuModel>();
        for (FoodMenuModel fm:map.values()) {
         foodMenuModelArrayList.add(fm);
        }
        //        Collections.sort(foodMenuModelArrayList);
        return foodMenuModelArrayList;
    }
/****************Linked List************************
LinkedList<FoodMenuModel> linkedList1=new LinkedList<FoodMenuModel>();
for (FoodMenuModel fmm:al){
    linkedList1.add(fmm);
    }
return linkedList1;
/*******************************hashSet**********************
        HashSet<FoodMenuModel>hashSet=new HashSet<FoodMenuModel>();
//        Iterator<FoodMenuModel>itr=al.iterator();
//        while (itr.hasNext())
//        {System.out.println(itr.next());
//        hashSet.add(itr.next());
//    }
//         return hashSet;
     for (FoodMenuModel fmm:al) {
           hashSet.add(fmm);
        }
        return hashSet;
     /*************************************************
        LinkedHashSet<FoodMenuModel>linkedHashSet=new LinkedHashSet<FoodMenuModel>();
        for (FoodMenuModel fmm:al) {
            linkedHashSet.add(fmm);
        }
        return linkedHashSet;
        /*********************************************************/
        TreeSet<FoodMenuModel>treeSet=new TreeSet<FoodMenuModel>();
        for (FoodMenuModel fmm:al) {
            treeSet.add(fmm);
        }
        return treeSet;
}}

