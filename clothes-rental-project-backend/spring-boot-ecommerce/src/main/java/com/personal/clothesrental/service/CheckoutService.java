package com.personal.clothesrental.service;

import com.personal.clothesrental.dto.Purchase;
import com.personal.clothesrental.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

}
