package com.eample.foodorder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "foodmenu")
public class FoodMenuModel {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "food_name")
    private String foodName;
   @Column(name = "food_price")
    private String foodPrice;
    @Column(name = "Hotel_Name")
    private String hotelName;

//    @Override
//    public boolean equals(Object obj) {
////        if (this.getClass() == obj.getClass()){
//            FoodMenuModel other =(FoodMenuModel) obj;
//            if(this.foodName.equals(other.foodName) && this.foodPrice.equals(other.foodPrice)){
//                return true;
//            }
////        }
//        return false;
   // }
}
