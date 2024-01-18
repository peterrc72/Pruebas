/**
 * 
 */
package com.example.purchase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.purchase.entities.PurchaseList;

/**
 * 
 */
public interface PurchaseRepository extends JpaRepository<PurchaseList, Integer> {

}
