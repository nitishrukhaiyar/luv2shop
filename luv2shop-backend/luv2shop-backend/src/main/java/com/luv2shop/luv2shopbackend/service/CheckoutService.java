package com.luv2shop.luv2shopbackend.service;

import com.luv2shop.luv2shopbackend.dto.Purchase;
import com.luv2shop.luv2shopbackend.dto.PurchaseResponse;

public interface CheckoutService {
   PurchaseResponse placeOrder(Purchase purchase);
}
