package com.example.purchase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.purchase.entities.PurchaseList;
import com.example.purchase.repository.PurchaseRepository;
import com.example.purchase.service.PurchaseService;

public class purchaseServiceImpl implements PurchaseService {

	@Autowired
	PurchaseRepository purchaseRepository;
	
	public PurchaseList getPurchaseByOrderId(PurchaseList purchaseList) {
		// TODO Auto-generated method stub
		return purchaseRepository.getReferenceById(purchaseList.getIdPurchase());
	}

}
