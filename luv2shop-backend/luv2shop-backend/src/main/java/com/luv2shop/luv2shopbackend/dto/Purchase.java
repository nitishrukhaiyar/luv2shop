package com.luv2shop.luv2shopbackend.dto;

import com.luv2shop.luv2shopbackend.entity.Address;
import com.luv2shop.luv2shopbackend.entity.Customer;
import com.luv2shop.luv2shopbackend.entity.Order;
import com.luv2shop.luv2shopbackend.entity.OrderItem;
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

