/**
 * 
 */
package com.example.purchase.entities;

import java.util.Date;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Entity
@Table(name = "tbl_purchase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PurchaseList {

	@Id()
	@Column(name = "Id_purchase")
	private Integer idPurchase;
	//private Long idCostumer;
		@Column(nullable = false, length = 50)
		private String name;
	@Column(name = "Register_Date", nullable = true)
	private Date registerDate;
	@Column(name = "LasUpd_Date", nullable = true)
	private Date LastUpdDate;
	@Column(nullable = false)
	private String status;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "Id_Cliente", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  @JsonIgnore
	  Cliente cliente;
}
