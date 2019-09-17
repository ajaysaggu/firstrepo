package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the application_error_log database table.
 * 
 */
@Entity
@Table(name="application_error_log")
public class ApplicationErrorLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ERROR_LOG_ID")
	private int errorLogId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ERROR_DATE")
	private Date errorDate;

	@Column(name="ERROR_DESCRIPTION")
	private String errorDescription;

	@Column(name="ERROR_MESSAGE")
	private String errorMessage;

	@Column(name="ERROR_SQL")
	private String errorSql;

	@Column(name="GROUP_ID")
	private int groupId;

	@Column(name="IP_ADDRESS")
	private String ipAddress;

	@Column(name="NOTIFICATION_ID")
	private int notificationId;

	@Column(name="SCREEN_ID")
	private int screenId;

	@Column(name="USER_ID")
	private int userId;

	public ApplicationErrorLog() {
	}

	public int getErrorLogId() {
		return this.errorLogId;
	}

	public void setErrorLogId(int errorLogId) {
		this.errorLogId = errorLogId;
	}

	public Date getErrorDate() {
		return this.errorDate;
	}

	public void setErrorDate(Date errorDate) {
		this.errorDate = errorDate;
	}

	public String getErrorDescription() {
		return this.errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorSql() {
		return this.errorSql;
	}

	public void setErrorSql(String errorSql) {
		this.errorSql = errorSql;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public int getScreenId() {
		return this.screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}