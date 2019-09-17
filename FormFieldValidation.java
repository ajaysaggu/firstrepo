package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the form_field_validations database table.
 * 
 */
@Entity
@Table(name="form_field_validations")
public class FormFieldValidation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="FIELD_VALIDATION_ID")
	private int fieldValidationId;

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

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="SOURCE_FIELD_VALUE")
	private String sourceFieldValue;

	@Column(name="SOURCE_FIELD_VALUE_ID")
	private int sourceFieldValueId;

	@Column(name="TARGET_FIELD_DEFAULT_VALUE")
	private String targetFieldDefaultValue;

	@Column(name="TRANSACTION_COUNT")
	private int transactionCount;

	@Column(name="USER_ACTIVITY_ID")
	private int userActivityId;

	@Column(name="VALIDATION_ACTION")
	private String validationAction;

	@Column(name="VALIDATION_CONDITION_VALUE_ID")
	private int validationConditionValueId;

	@Column(name="VALIDATION_EVENT")
	private String validationEvent;

	@Column(name="VALIDATION_EXPRESSION")
	private String validationExpression;

	@Column(name="VALIDATION_MESSAGE")
	private String validationMessage;

	@Column(name="VALIDATION_SEQUENCE")
	private int validationSequence;

	@Column(name="VALIDATION_STATUS_VALUE_ID")
	private int validationStatusValueId;

	@Column(name="VALIDATION_TYPE_VALUE_ID")
	private int validationTypeValueId;

	//bi-directional many-to-one association to FormWidgetField
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="SOURCE_FIELD_ID")
	private FormWidgetField formWidgetField1;

	//bi-directional many-to-one association to FormWidgetField
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TARGET_FIELD_ID")
	private FormWidgetField formWidgetField2;

	public FormFieldValidation() {
	}

	public int getFieldValidationId() {
		return this.fieldValidationId;
	}

	public void setFieldValidationId(int fieldValidationId) {
		this.fieldValidationId = fieldValidationId;
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

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getSourceFieldValue() {
		return this.sourceFieldValue;
	}

	public void setSourceFieldValue(String sourceFieldValue) {
		this.sourceFieldValue = sourceFieldValue;
	}

	public int getSourceFieldValueId() {
		return this.sourceFieldValueId;
	}

	public void setSourceFieldValueId(int sourceFieldValueId) {
		this.sourceFieldValueId = sourceFieldValueId;
	}

	public String getTargetFieldDefaultValue() {
		return this.targetFieldDefaultValue;
	}

	public void setTargetFieldDefaultValue(String targetFieldDefaultValue) {
		this.targetFieldDefaultValue = targetFieldDefaultValue;
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

	public String getValidationAction() {
		return this.validationAction;
	}

	public void setValidationAction(String validationAction) {
		this.validationAction = validationAction;
	}

	public int getValidationConditionValueId() {
		return this.validationConditionValueId;
	}

	public void setValidationConditionValueId(int validationConditionValueId) {
		this.validationConditionValueId = validationConditionValueId;
	}

	public String getValidationEvent() {
		return this.validationEvent;
	}

	public void setValidationEvent(String validationEvent) {
		this.validationEvent = validationEvent;
	}

	public String getValidationExpression() {
		return this.validationExpression;
	}

	public void setValidationExpression(String validationExpression) {
		this.validationExpression = validationExpression;
	}

	public String getValidationMessage() {
		return this.validationMessage;
	}

	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	public int getValidationSequence() {
		return this.validationSequence;
	}

	public void setValidationSequence(int validationSequence) {
		this.validationSequence = validationSequence;
	}

	public int getValidationStatusValueId() {
		return this.validationStatusValueId;
	}

	public void setValidationStatusValueId(int validationStatusValueId) {
		this.validationStatusValueId = validationStatusValueId;
	}

	public int getValidationTypeValueId() {
		return this.validationTypeValueId;
	}

	public void setValidationTypeValueId(int validationTypeValueId) {
		this.validationTypeValueId = validationTypeValueId;
	}

	public FormWidgetField getFormWidgetField1() {
		return this.formWidgetField1;
	}

	public void setFormWidgetField1(FormWidgetField formWidgetField1) {
		this.formWidgetField1 = formWidgetField1;
	}

	public FormWidgetField getFormWidgetField2() {
		return this.formWidgetField2;
	}

	public void setFormWidgetField2(FormWidgetField formWidgetField2) {
		this.formWidgetField2 = formWidgetField2;
	}

}