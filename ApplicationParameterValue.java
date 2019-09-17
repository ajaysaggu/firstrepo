package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the application_parameter_values database table.
 * 
 */
@Entity
@Table(name="application_parameter_values")
public class ApplicationParameterValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PARAMETER_VALUE_ID")
	private int parameterValueId;

	@Column(name="CREATED_BY")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="LAST_MODIFIED_BY")
	private int lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	@Lob
	@Column(name="PARAMETER_BINARY_VALUE")
	private String parameterBinaryValue;

	@Column(name="PARAMETER_VALUE")
	private String parameterValue;

	@Column(name="PARAMETER_VALUE_DESCRIPTION")
	private String parameterValueDescription;

	@Column(name="PARAMETERVALUE_STATUS_VALUE_ID")
	private int parametervalueStatusValueId;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="TRANSACTION_COUNT")
	private int transactionCount;

	@Column(name="USER_ACTIVITY_ID")
	private int userActivityId;

	//bi-directional many-to-one association to ApplicationParameter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PARAMETER_ID")
	private ApplicationParameter applicationParameter;

	//bi-directional many-to-one association to ApplicationParameterList
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PARAMETER_LIST_ID")
	private ApplicationParameterList applicationParameterList;

	public ApplicationParameterValue() {
	}

	public int getParameterValueId() {
		return this.parameterValueId;
	}

	public void setParameterValueId(int parameterValueId) {
		this.parameterValueId = parameterValueId;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(int lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getParameterBinaryValue() {
		return this.parameterBinaryValue;
	}

	public void setParameterBinaryValue(String parameterBinaryValue) {
		this.parameterBinaryValue = parameterBinaryValue;
	}

	public String getParameterValue() {
		return this.parameterValue;
	}

	public void setParameterValue(String parameterValue) {
		this.parameterValue = parameterValue;
	}

	public String getParameterValueDescription() {
		return this.parameterValueDescription;
	}

	public void setParameterValueDescription(String parameterValueDescription) {
		this.parameterValueDescription = parameterValueDescription;
	}

	public int getParametervalueStatusValueId() {
		return this.parametervalueStatusValueId;
	}

	public void setParametervalueStatusValueId(int parametervalueStatusValueId) {
		this.parametervalueStatusValueId = parametervalueStatusValueId;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public int getTransactionCount() {
		return this.transactionCount;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	public int getUserActivityId() {
		return this.userActivityId;
	}

	public void setUserActivityId(int userActivityId) {
		this.userActivityId = userActivityId;
	}

	public ApplicationParameter getApplicationParameter() {
		return this.applicationParameter;
	}

	public void setApplicationParameter(ApplicationParameter applicationParameter) {
		this.applicationParameter = applicationParameter;
	}

	public ApplicationParameterList getApplicationParameterList() {
		return this.applicationParameterList;
	}

	public void setApplicationParameterList(ApplicationParameterList applicationParameterList) {
		this.applicationParameterList = applicationParameterList;
	}

}