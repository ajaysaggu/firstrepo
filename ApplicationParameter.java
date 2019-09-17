package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the application_parameters database table.
 * 
 */
@Entity
@Table(name="application_parameters")
public class ApplicationParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PARAMETER_ID")
	private int parameterId;

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

	@Column(name="PARAMETER_CODE")
	private String parameterCode;

	@Column(name="PARAMETER_DATA_LENGTH")
	private int parameterDataLength;

	@Column(name="PARAMETER_DATA_TYPE_VALUE_ID")
	private int parameterDataTypeValueId;

	@Column(name="PARAMETER_DATE_FORMAT")
	private String parameterDateFormat;

	@Column(name="PARAMETER_DECIMAL_LENGTH")
	private int parameterDecimalLength;

	@Column(name="PARAMETER_DESCRIPTION")
	private String parameterDescription;

	@Column(name="PARAMETER_MAX_VALUE")
	private int parameterMaxValue;

	@Column(name="PARAMETER_MIN_VALUE")
	private int parameterMinValue;

	@Column(name="PARAMETER_NAME")
	private String parameterName;

	@Column(name="PARAMETER_STATUS_VALUE_ID")
	private int parameterStatusValueId;

	@Column(name="PARAMETER_TYPE_VALUE_ID")
	private int parameterTypeValueId;

	@Column(name="PARAMETER_VALUES_COUNT")
	private int parameterValuesCount;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="TRANSACTION_COUNT")
	private int transactionCount;

	@Column(name="USER_ACTIVITY_ID")
	private int userActivityId;

	//bi-directional many-to-one association to ApplicationParameterList
	@OneToMany(mappedBy="applicationParameter")
	private List<ApplicationParameterList> applicationParameterLists;

	//bi-directional many-to-one association to ApplicationParameterValue
	@OneToMany(mappedBy="applicationParameter")
	private List<ApplicationParameterValue> applicationParameterValues;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ACCOUNT_ID")
	private Account account;

	public ApplicationParameter() {
	}

	public int getParameterId() {
		return this.parameterId;
	}

	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
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

	public String getParameterCode() {
		return this.parameterCode;
	}

	public void setParameterCode(String parameterCode) {
		this.parameterCode = parameterCode;
	}

	public int getParameterDataLength() {
		return this.parameterDataLength;
	}

	public void setParameterDataLength(int parameterDataLength) {
		this.parameterDataLength = parameterDataLength;
	}

	public int getParameterDataTypeValueId() {
		return this.parameterDataTypeValueId;
	}

	public void setParameterDataTypeValueId(int parameterDataTypeValueId) {
		this.parameterDataTypeValueId = parameterDataTypeValueId;
	}

	public String getParameterDateFormat() {
		return this.parameterDateFormat;
	}

	public void setParameterDateFormat(String parameterDateFormat) {
		this.parameterDateFormat = parameterDateFormat;
	}

	public int getParameterDecimalLength() {
		return this.parameterDecimalLength;
	}

	public void setParameterDecimalLength(int parameterDecimalLength) {
		this.parameterDecimalLength = parameterDecimalLength;
	}

	public String getParameterDescription() {
		return this.parameterDescription;
	}

	public void setParameterDescription(String parameterDescription) {
		this.parameterDescription = parameterDescription;
	}

	public int getParameterMaxValue() {
		return this.parameterMaxValue;
	}

	public void setParameterMaxValue(int parameterMaxValue) {
		this.parameterMaxValue = parameterMaxValue;
	}

	public int getParameterMinValue() {
		return this.parameterMinValue;
	}

	public void setParameterMinValue(int parameterMinValue) {
		this.parameterMinValue = parameterMinValue;
	}

	public String getParameterName() {
		return this.parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public int getParameterStatusValueId() {
		return this.parameterStatusValueId;
	}

	public void setParameterStatusValueId(int parameterStatusValueId) {
		this.parameterStatusValueId = parameterStatusValueId;
	}

	public int getParameterTypeValueId() {
		return this.parameterTypeValueId;
	}

	public void setParameterTypeValueId(int parameterTypeValueId) {
		this.parameterTypeValueId = parameterTypeValueId;
	}

	public int getParameterValuesCount() {
		return this.parameterValuesCount;
	}

	public void setParameterValuesCount(int parameterValuesCount) {
		this.parameterValuesCount = parameterValuesCount;
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

	public List<ApplicationParameterList> getApplicationParameterLists() {
		return this.applicationParameterLists;
	}

	public void setApplicationParameterLists(List<ApplicationParameterList> applicationParameterLists) {
		this.applicationParameterLists = applicationParameterLists;
	}

	public ApplicationParameterList addApplicationParameterList(ApplicationParameterList applicationParameterList) {
		getApplicationParameterLists().add(applicationParameterList);
		applicationParameterList.setApplicationParameter(this);

		return applicationParameterList;
	}

	public ApplicationParameterList removeApplicationParameterList(ApplicationParameterList applicationParameterList) {
		getApplicationParameterLists().remove(applicationParameterList);
		applicationParameterList.setApplicationParameter(null);

		return applicationParameterList;
	}

	public List<ApplicationParameterValue> getApplicationParameterValues() {
		return this.applicationParameterValues;
	}

	public void setApplicationParameterValues(List<ApplicationParameterValue> applicationParameterValues) {
		this.applicationParameterValues = applicationParameterValues;
	}

	public ApplicationParameterValue addApplicationParameterValue(ApplicationParameterValue applicationParameterValue) {
		getApplicationParameterValues().add(applicationParameterValue);
		applicationParameterValue.setApplicationParameter(this);

		return applicationParameterValue;
	}

	public ApplicationParameterValue removeApplicationParameterValue(ApplicationParameterValue applicationParameterValue) {
		getApplicationParameterValues().remove(applicationParameterValue);
		applicationParameterValue.setApplicationParameter(null);

		return applicationParameterValue;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}