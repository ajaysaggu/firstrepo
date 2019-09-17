package com.entity;

import 


/**
 * The persistent class for the accounts database table.
 * 
 */
@Entity
@Table(name="accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name="ACCOUNT_NAME")
	private String accountName;

	@Column(name="ACCOUNT_STATUS_VALUE_ID")
	private int accountStatusValueId;

	@Column(name="CONCURRENT_USERS")
	private String concurrentUsers;

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

	@Column(name="LICENSE_EXPIRY_DATE")
	private String licenseExpiryDate;

	@Column(name="LICENSE_START_DATE")
	private String licenseStartDate;

	@Column(name="NAMED_USERS")
	private String namedUsers;

	@Column(name="RECORD_TYPE")
	private String recordType;

	@Column(name="TRANSACTION_COUNT")
	private int transactionCount;

	@Column(name="USER_ACTIVITY_ID")
	private int userActivityId;

	//bi-directional many-to-one association to ApplicationParameter
	@OneToMany(mappedBy="account")
	private List<ApplicationParameter> applicationParameters;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="account")
	private List<Customer> customers;

	//bi-directional many-to-one association to FormScreen
	@OneToMany(mappedBy="account")
	private List<FormScreen> formScreens;

	//bi-directional many-to-one association to Group
	@OneToMany(mappedBy="account")
	private List<Group> groups;

	//bi-directional many-to-one association to Medication
	@OneToMany(mappedBy="account")
	private List<Medication> medications;

	//bi-directional many-to-one association to Menus
	@OneToMany(mappedBy="account")
	private List<Menus> menuses;

	//bi-directional many-to-one association to Screen
	@OneToMany(mappedBy="account")
	private List<Screen> screens;

	//bi-directional many-to-one association to Site
	@OneToMany(mappedBy="account")
	private List<Site> sites;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="account")
	private List<User> users;

	public Account() {
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountStatusValueId() {
		return this.accountStatusValueId;
	}

	public void setAccountStatusValueId(int accountStatusValueId) {
		this.accountStatusValueId = accountStatusValueId;
	}

	public String getConcurrentUsers() {
		return this.concurrentUsers;
	}

	public void setConcurrentUsers(String concurrentUsers) {
		this.concurrentUsers = concurrentUsers;
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

	public String getLicenseExpiryDate() {
		return this.licenseExpiryDate;
	}

	public void setLicenseExpiryDate(String licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public String getLicenseStartDate() {
		return this.licenseStartDate;
	}

	public void setLicenseStartDate(String licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}

	public String getNamedUsers() {
		return this.namedUsers;
	}

	public void setNamedUsers(String namedUsers) {
		this.namedUsers = namedUsers;
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

	public List<ApplicationParameter> getApplicationParameters() {
		return this.applicationParameters;
	}

	public void setApplicationParameters(List<ApplicationParameter> applicationParameters) {
		this.applicationParameters = applicationParameters;
	}

	public ApplicationParameter addApplicationParameter(ApplicationParameter applicationParameter) {
		getApplicationParameters().add(applicationParameter);
		applicationParameter.setAccount(this);

		return applicationParameter;
	}

	public ApplicationParameter removeApplicationParameter(ApplicationParameter applicationParameter) {
		getApplicationParameters().remove(applicationParameter);
		applicationParameter.setAccount(null);

		return applicationParameter;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setAccount(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setAccount(null);

		return customer;
	}

	public List<FormScreen> getFormScreens() {
		return this.formScreens;
	}

	public void setFormScreens(List<FormScreen> formScreens) {
		this.formScreens = formScreens;
	}

	public FormScreen addFormScreen(FormScreen formScreen) {
		getFormScreens().add(formScreen);
		formScreen.setAccount(this);

		return formScreen;
	}

	public FormScreen removeFormScreen(FormScreen formScreen) {
		getFormScreens().remove(formScreen);
		formScreen.setAccount(null);

		return formScreen;
	}

	public List<Group> getGroups() {
		return this.groups;
	}

	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	public Group addGroup(Group group) {
		getGroups().add(group);
		group.setAccount(this);

		return group;
	}

	public Group removeGroup(Group group) {
		getGroups().remove(group);
		group.setAccount(null);

		return group;
	}

	public List<Medication> getMedications() {
		return this.medications;
	}

	public void setMedications(List<Medication> medications) {
		this.medications = medications;
	}

	public Medication addMedication(Medication medication) {
		getMedications().add(medication);
		medication.setAccount(this);

		return medication;
	}

	public Medication removeMedication(Medication medication) {
		getMedications().remove(medication);
		medication.setAccount(null);

		return medication;
	}

	public List<Menus> getMenuses() {
		return this.menuses;
	}

	public void setMenuses(List<Menus> menuses) {
		this.menuses = menuses;
	}

	public Menus addMenus(Menus menus) {
		getMenuses().add(menus);
		menus.setAccount(this);

		return menus;
	}

	public Menus removeMenus(Menus menus) {
		getMenuses().remove(menus);
		menus.setAccount(null);

		return menus;
	}

	public List<Screen> getScreens() {
		return this.screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public Screen addScreen(Screen screen) {
		getScreens().add(screen);
		screen.setAccount(this);

		return screen;
	}

	public Screen removeScreen(Screen screen) {
		getScreens().remove(screen);
		screen.setAccount(null);

		return screen;
	}

	public List<Site> getSites() {
		return this.sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	public Site addSite(Site site) {
		getSites().add(site);
		site.setAccount(this);

		return site;
	}

	public Site removeSite(Site site) {
		getSites().remove(site);
		site.setAccount(null);

		return site;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setAccount(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setAccount(null);

		return user;
	}

}