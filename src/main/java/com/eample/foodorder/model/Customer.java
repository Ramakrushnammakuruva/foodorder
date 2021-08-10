package com.eample.foodorder.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Customer {
@Id
@GeneratedValue
@Column
int id;
@Column
String name;
@Column
    String email;

}
