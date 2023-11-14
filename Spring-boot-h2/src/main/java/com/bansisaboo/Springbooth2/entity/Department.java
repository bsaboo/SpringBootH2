package com.bansisaboo.Springbooth2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;

	@NotBlank(message = "Name is mandatory")
	private String departmentName;
	private String departAddress;
	private String departmentCode;

	// Removed boiler plating code by using Lombok plug in
	/*
	 * public long getDepartmentId() { return departmentId; }
	 * 
	 * public void setDepartmentId(long departmentId) { this.departmentId =
	 * departmentId; }
	 * 
	 * public String getDepartmentName() { return departmentName; }
	 * 
	 * public void setDepartmentName(String departmentName) { this.departmentName =
	 * departmentName; }
	 * 
	 * public String getDepartAddress() { return departAddress; }
	 * 
	 * public void setDepartAddress(String departAddress) { this.departAddress =
	 * departAddress; }
	 * 
	 * public String getDepartmentCode() { return departmentCode; }
	 * 
	 * public void setDepartmentCode(String departmentCode) { this.departmentCode =
	 * departmentCode; }
	 * 
	 * @Override public String toString() { return "Department [departmentId=" +
	 * departmentId + ", departmentName=" + departmentName + ", departAddress=" +
	 * departAddress + ", departmentCode=" + departmentCode + "]"; }
	 */

}
