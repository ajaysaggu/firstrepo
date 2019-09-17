package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the application_parameter_lists database table.
 * 
 */
@Entity
@Table(name="application_parameter_lists")
public class ApplicationParameterList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PARAMETER_LIST_ID")
	private int parameterListId;

	@Column(name="CREATED_BY")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CUSTOM_VALUE_1")
	private String customValue1;

	@Column(name="CUSTOM_VALUE_2")
	private String customValue2;

	@Column(name="CUSTOM_VALUE_3")
	private String customValue3;

	@Column(name="CUSTOM_VALUE_4")
	private String customValue4;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFFECTIVE_FROM_DATE")
	private Date effectiveFromDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EFFECTIVE_TO_DATE")
	private Date effectiveToDate;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="LAST_MODIFIED_BY")
	private int lastModifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	@Column(name="PARAMETER_LIST_CODE")
	private String parameterListCode;

	@Column(name="PARAMETER_LIST_DESCRIPTION")
	private String parameterListDescription;

	@Column(name="PARAMETER_LIST_SEQUENCE")
	private int parameterListSequence;

	@Column(name="PARAMETER_LIST_STATUS_VALUE_ID")
	private int parameterListStatusValueId;

	@Column(name="PARAMETER_LIST_VALUE")
	private String parameterListValue;

	@Column(name="RECORD_TYPE")
	private String recordType;

	private String remarks;

	@Column(name="TRANSACTION_COUNT")
	private int transactionCount;

	@Column(name="USER_ACTIVITY_ID")
	private int userActivityId;

	//bi-directional many-to-one association to ApplicationParameter
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PARAMETER_ID")
	private ApplicationParameter applicationParameter;

	//bi-directional many-to-one association to ApplicationParameterValue
	@OneToMany(mappedBy="applicationParameterList")
	private List<ApplicationParameterValue> applicationParameterValues;

	//bi-directional many-to-one association to ServerRequestLog
	@OneToMany(mappedBy="applicationParameterList1")
	private List<ServerRequestLog> serverRequestLogs1;

	//bi-directional many-to-one association to ServerRequestLog
	@OneToMany(mappedBy="applicationParameterList2")
	private List<ServerRequestLog> serverRequestLogs2;

	public ApplicationParameterList() {
	}

	public int getParameterListId() {
		return this.parameterListId;
	}

	public void setParameterListId(int parameterListId) {
		this.parameterListId = parameterListId;
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

	public String getCustomValue1() {
		return this.customValue1;
	}

	public void setCustomValue1(String customValue1) {
		this.customValue1 = customValue1;
	}

	public String getCustomValue2() {
		return this.customValue2;
	}

	public void setCustomValue2(String customValue2) {
		this.customValue2 = customValue2;
	}

	public String getCustomValue3() {
		return this.customValue3;
	}

	public void setCustomValue3(String customValue3) {
		this.customValue3 = customValue3;
	}

	public String getCustomValue4() {
		return this.customValue4;
	}

	public void setCustomValue4(String customValue4) {
		this.customValue4 = customValue4;
	}

	public Date getEffectiveFromDate() {
		return this.effectiveFromDate;
	}

	public void setEffectiveFromDate(Date effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	public Date getEffectiveToDate() {
		return this.effectiveToDate;
	}

	public void setEffectiveToDate(Date effectiveToDate) {
		this.effectiveToDate = effectiveToDate;
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

	public String getParameterListCode() {
		return this.parameterListCode;
	}

	public void setParameterListCode(String parameterListCode) {
		this.parameterListCode = parameterListCode;
	}

	public String getParameterListDescription() {
		return this.parameterListDescription;
	}

	public void setParameterListDescription(String parameterListDescription) {
		this.parameterListDescription = parameterListDescription;
	}

	public int getParameterListSequence() {
		return this.parameterListSequence;
	}

	public void setParameterListSequence(int parameterListSequence) {
		this.parameterListSequence = parameterListSequence;
	}

	public int getParameterListStatusValueId() {
		return this.parameterListStatusValueId;
	}

	public void setParameterListStatusValueId(int parameterListStatusValueId) {
		this.parameterListStatusValueId = parameterListStatusValueId;
	}

	public String getParameterListValue() {
		return this.parameterListValue;
	}

	public void setParameterListValue(String parameterListValue) {
		this.parameterListValue = parameterListValue;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public List<ApplicationParameterValue> getApplicationParameterValues() {
		return this.applicationParameterValues;
	}

	public void setApplicationParameterValues(List<ApplicationParameterValue> applicationParameterValues) {
		this.applicationParameterValues = applicationParameterValues;
	}

	public ApplicationParameterValue addApplicationParameterValue(ApplicationParameterValue applicationParameterValue) {
		getApplicationParameterValues().add(applicationParameterValue);
		applicationParameterValue.setApplicationParameterList(this);

		return applicationParameterValue;
	}

	public ApplicationParameterValue removeApplicationParameterValue(ApplicationParameterValue applicationParameterValue) {
		getApplicationParameterValues().remove(applicationParameterValue);
		applicationParameterValue.setApplicationParameterList(null);

		return applicationParameterValue;
	}

	public List<ServerRequestLog> getServerRequestLogs1() {
		return this.serverRequestLogs1;
	}

	public void setServerRequestLogs1(List<ServerRequestLog> serverRequestLogs1) {
		this.serverRequestLogs1 = serverRequestLogs1;
	}

	public ServerRequestLog addServerRequestLogs1(ServerRequestLog serverRequestLogs1) {
		getServerRequestLogs1().add(serverRequestLogs1);
		serverRequestLogs1.setApplicationParameterList1(this);

		return serverRequestLogs1;
	}

	public ServerRequestLog removeServerRequestLogs1(ServerRequestLog serverRequestLogs1) {
		getServerRequestLogs1().remove(serverRequestLogs1);
		serverRequestLogs1.setApplicationParameterList1(null);

		return serverRequestLogs1;
	}

	public List<ServerRequestLog> getServerRequestLogs2() {
		return this.serverRequestLogs2;
	}

	public void setServerRequestLogs2(List<ServerRequestLog> serverRequestLogs2) {
		this.serverRequestLogs2 = serverRequestLogs2;
	}

	public ServerRequestLog addServerRequestLogs2(ServerRequestLog serverRequestLogs2) {
		getServerRequestLogs2().add(serverRequestLogs2);
		serverRequestLogs2.setApplicationParameterList2(this);

		return serverRequestLogs2;
	}

	public ServerRequestLog removeServerRequestLogs2(ServerRequestLog serverRequestLogs2) {
		getServerRequestLogs2().remove(serverRequestLogs2);
		serverRequestLogs2.setApplicationParameterList2(null);

		return serverRequestLogs2;
	}

}