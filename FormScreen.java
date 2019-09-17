package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the form_screens database table.
 * 
 */
@Entity
@Table(name="form_screens")
public class FormScreen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SCREEN_ID")
	private int screenId;

	@Column(name="AUTO_SAVING_LIST_ID")
	private int autoSavingListId;

	@Column(name="AUTO_SAVING_TIME_MIN")
	private int autoSavingTimeMin;

	@Column(name="CALLOUT_POSITION_LIST_ID")
	private int calloutPositionListId;

	@Column(name="CALLOUT_TYPE_LIST_ID")
	private int calloutTypeListId;

	@Column(name="CREATED_BY")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="FORM_KEY")
	private String formKe;

	

	@Column(name="PARENT_SCREEN_ID")
	private int parentScreenId;


	@Column(name="SCREEN_TYPE_LIST_ID")
	private int screenTypeListId;

	@Column(name="SCREEN_VERSION")
	private String screenVersion;

	@Column(name="SECTIONDISPLAY_FORMAT_LIST_ID")
	private int sectiondisplayFormatListId;

	@Column(name="TRANSACTION_COUNT")
	private int transactionCount;

	@Column(name="USER_ACTIVITY_ID")
	private int userActivityId;

	@Column(name="WORKING_STATUS_LIST_ID")
	private int workingStatusListId;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ACCOUNT_ID")
	private Account account;

	//bi-directional many-to-one association to FormSection
	@OneToMany(mappedBy="formScreen")
	private List<FormSection> formSections;

	public FormScreen() {
	}

	public int getScreenId() {
		return this.screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getAutoSavingListId() {
		return this.autoSavingListId;
	}

	public void setAutoSavingListId(int autoSavingListId) {
		this.autoSavingListId = autoSavingListId;
	}

	public int getAutoSavingTimeMin() {
		return this.autoSavingTimeMin;
	}

	public void setAutoSavingTimeMin(int autoSavingTimeMin) {
		this.autoSavingTimeMin = autoSavingTimeMin;
	}

	public int getCalloutPositionListId() {
		return this.calloutPositionListId;
	}

	public void setCalloutPositionListId(int calloutPositionListId) {
		this.calloutPositionListId = calloutPositionListId;
	}

	public int getCalloutTypeListId() {
		return this.calloutTypeListId;
	}

	public void setCalloutTypeListId(int calloutTypeListId) {
		this.calloutTypeListId = calloutTypeListId;
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

	public String getFormKey() {
		return this.formKey;
	}

	public void setFormKey(String formKey) {
		this.formKey = formKey;
	}

	public String getFormUrl() {
		return this.formUrl;
	}

	public void setFormUrl(String formUrl) {
		this.formUrl = formUrl;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getIsAuthenticationListId() {
		return this.isAuthenticationListId;
	}

	public void setIsAuthenticationListId(int isAuthenticationListId) {
		this.isAuthenticationListId = isAuthenticationListId;
	}

	public int getIsEsignRequiredListId() {
		return this.isEsignRequiredListId;
	}

	public void setIsEsignRequiredListId(int isEsignRequiredListId) {
		this.isEsignRequiredListId = isEsignRequiredListId;
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

	public int getParentScreenId() {
		return this.parentScreenId;
	}

	public void setParentScreenId(int parentScreenId) {
		this.parentScreenId = parentScreenId;
	}

	public String getRecordType() {
		return this.recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public int getScreenCategoryListId() {
		return this.screenCategoryListId;
	}

	public void setScreenCategoryListId(int screenCategoryListId) {
		this.screenCategoryListId = screenCategoryListId;
	}

	public String getScreenDescription() {
		return this.screenDescription;
	}

	public void setScreenDescription(String screenDescription) {
		this.screenDescription = screenDescription;
	}

	public String getScreenName() {
		return this.screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getScreenStatusListId() {
		return this.screenStatusListId;
	}

	public void setScreenStatusListId(int screenStatusListId) {
		this.screenStatusListId = screenStatusListId;
	}

	public String getScreenTableName() {
		return this.screenTableName;
	}

	public void setScreenTableName(String screenTableName) {
		this.screenTableName = screenTableName;
	}

	public String getScreenTitle() {
		return this.screenTitle;
	}

	public void setScreenTitle(String screenTitle) {
		this.screenTitle = screenTitle;
	}

	public int getScreenTitleHidden() {
		return this.screenTitleHidden;
	}

	public void setScreenTitleHidden(int screenTitleHidden) {
		this.screenTitleHidden = screenTitleHidden;
	}

	public int getScreenTypeListId() {
		return this.screenTypeListId;
	}

	public void setScreenTypeListId(int screenTypeListId) {
		this.screenTypeListId = screenTypeListId;
	}

	public String getScreenVersion() {
		return this.screenVersion;
	}

	public void setScreenVersion(String screenVersion) {
		this.screenVersion = screenVersion;
	}

	public int getSectiondisplayFormatListId() {
		return this.sectiondisplayFormatListId;
	}

	public void setSectiondisplayFormatListId(int sectiondisplayFormatListId) {
		this.sectiondisplayFormatListId = sectiondisplayFormatListId;
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

	public int getWorkingStatusListId() {
		return this.workingStatusListId;
	}

	public void setWorkingStatusListId(int workingStatusListId) {
		this.workingStatusListId = workingStatusListId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<FormSection> getFormSections() {
		return this.formSections;
	}

	public void setFormSections(List<FormSection> formSections) {
		this.formSections = formSections;
	}

	public FormSection addFormSection(FormSection formSection) {
		getFormSections().add(formSection);
		formSection.setFormScreen(this);

		return formSection;
	}

	public FormSection removeFormSection(FormSection formSection) {
		getFormSections().remove(formSection);
		formSection.setFormScreen(null);

		return formSection;
	}

}
