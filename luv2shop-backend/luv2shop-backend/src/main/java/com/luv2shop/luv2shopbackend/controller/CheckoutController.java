package com.luv2shop.luv2shopbackend.controller;

import com.luv2shop.luv2shopbackend.dto.Purchase;
import com.luv2shop.luv2shopbackend.dto.PurchaseResponse;
import com.luv2shop.luv2shopbackend.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/checkout")
public class CheckoutController {
    @Autowired
    private CheckoutService checkoutService;

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {


        System.out.println(purchase);
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
