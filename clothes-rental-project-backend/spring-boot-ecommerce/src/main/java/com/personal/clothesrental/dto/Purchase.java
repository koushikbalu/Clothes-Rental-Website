package com.personal.clothesrental.dto;

import com.personal.clothesrental.entity.Address;
import com.personal.clothesrental.entity.Customer;
import com.personal.clothesrental.entity.Order;
import com.personal.clothesrental.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}