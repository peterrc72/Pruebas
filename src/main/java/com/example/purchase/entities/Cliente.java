/**
 * 
 */
package com.example.purchase.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 */
@Entity
@Table(name = "Tbl_Cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {
	@Id
	@Column(name = "Id_Cliente")
	private Long idCLiente;
	@Column(nullable = false, length = 50)
	private String name;
	@Column(nullable = false)
	private String status;
}
