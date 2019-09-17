package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the api_request_logs database table.
 * 
 */
@Entity
@Table(name="api_request_logs")
public class ApiRequestLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="API_REQUEST_LOG_ID")
	private int apiRequestLogId;

	@Column(name="PROCESSING_TIME")
	private int processingTime;

	private String remarks;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REQUEST_DATE")
	private Date requestDate;

	//bi-directional many-to-one association to Status
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="STATUS_ID")
	private Status status;

	//bi-directional many-to-one association to ApiName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="API_NAME_ID")
	private ApiName apiName;

	//bi-directional many-to-one association to CustomerUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_USER_ID")
	private CustomerUser customerUser;

	//bi-directional many-to-one association to Customer
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;

	//bi-directional many-to-one association to CustomerEnvironment
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CUSTOMER_ENVIRONMENT_ID")
	private CustomerEnvironment customerEnvironment;

	public ApiRequestLog() {
	}

	public int getApiRequestLogId() {
		return this.apiRequestLogId;
	}

	public void setApiRequestLogId(int apiRequestLogId) {
		this.apiRequestLogId = apiRequestLogId;
	}

	public int getProcessingTime() {
		return this.processingTime;
	}

	public void setProcessingTime(int processingTime) {
		this.processingTime = processingTime;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getRequestDate() {
		return this.requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ApiName getApiName() {
		return this.apiName;
	}

	public void setApiName(ApiName apiName) {
		this.apiName = apiName;
	}

	public CustomerUser getCustomerUser() {
		return this.customerUser;
	}

	public void setCustomerUser(CustomerUser customerUser) {
		this.customerUser = customerUser;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerEnvironment getCustomerEnvironment() {
		return this.customerEnvironment;
	}

	public void setCustomerEnvironment(CustomerEnvironment customerEnvironment) {
		this.customerEnvironment = customerEnvironment;
	}

}