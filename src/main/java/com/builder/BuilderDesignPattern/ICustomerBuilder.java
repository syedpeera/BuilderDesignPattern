package com.builder.BuilderDesignPattern;

public interface ICustomerBuilder {
	public ICustomerBuilder firstName(String firstName);
	public ICustomerBuilder middleName(String middleName);
	public ICustomerBuilder lastName(String lastName);
	public ICustomerBuilder primaryEmail(String primaryEmail);
	public ICustomerBuilder secondaryEmail(String secondaryEmail);
	public ICustomerBuilder primaryMobileNumber(String primaryMobileNumber);
	public ICustomerBuilder secondaryMobileNumber(String secondaryMobileNumber);
	public Customer build();
}
