package com.employee.curd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "First name is required")
	@Size(min = 3, max = 13, message = "First name must be between 3 and 13 letters")
	@Pattern(regexp = "^[A-Za-z]+$",message = "First name contains only letters")
	private String firstName;

	@NotBlank(message = "Last name is required")
	@Size(min = 3, max = 13, message = "Last  name must be between 3 and 13 letters")
	@Pattern(regexp = "^[A-Za-z]+$",message = "Last name ontains only letters")
	private String lastName;

	@NotBlank(message = "Email is required")
	@Pattern(regexp =  "^[\\w.+\\-]+@gmail\\.com$", message = "Email must end with @gmail.com")
	private String email;

	@NotBlank(message = "Mobile number is required")
	@Size(min = 10, max = 10, message = "Mobile number must be exactly 10 digits")
	@Pattern(regexp = "^[0-9]{10}$", message = "Mobile number must contain only digits")
	private String mobileNo;

	@NotBlank(message = "City is required")
	@Pattern(regexp = "^[A-Za-z]+$", message = "City can contain only letters")
	@Column(name = "city")
	private String city;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNo=" + mobileNo + ", city=" + city + "]";
	}

}
