package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the application_notifications database table.
 * 
 */
@Entity
@Table(name="application_notifications")
public class ApplicationNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="NOTIFICATION_ID")
	private int notificationId;

	@Column(name="GROUP_ID")
	private int groupId;

	@Column(name="NOTIFICATION_BCC")
	private String notificationBcc;

	@Column(name="NOTIFICATION_BODY")
	private String notificationBody;

	@Column(name="NOTIFICATION_CC")
	private String notificationCc;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="NOTIFICATION_REQUEST_DATE")
	private Date notificationRequestDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="NOTIFICATION_SCHEDULE_DATE")
	private Date notificationScheduleDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="NOTIFICATION_SENT_DATE")
	private Date notificationSentDate;

	@Column(name="NOTIFICATION_STATUS_LIST_ID")
	private int notificationStatusListId;

	@Column(name="NOTIFICATION_SUBJECT")
	private String notificationSubject;

	@Column(name="NOTIFICATION_TO")
	private String notificationTo;

	@Column(name="NOTIFICATION_TYPE_LIST_ID")
	private int notificationTypeListId;

	@Column(name="NUMBER_OF_TRIES")
	private int numberOfTries;

	@Column(name="USER_ID")
	private int userId;

	public ApplicationNotification() {
	}

	public int getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getNotificationBcc() {
		return this.notificationBcc;
	}

	public void setNotificationBcc(String notificationBcc) {
		this.notificationBcc = notificationBcc;
	}

	public String getNotificationBody() {
		return this.notificationBody;
	}

	public void setNotificationBody(String notificationBody) {
		this.notificationBody = notificationBody;
	}

	public String getNotificationCc() {
		return this.notificationCc;
	}

	public void setNotificationCc(String notificationCc) {
		this.notificationCc = notificationCc;
	}

	public Date getNotificationRequestDate() {
		return this.notificationRequestDate;
	}

	public void setNotificationRequestDate(Date notificationRequestDate) {
		this.notificationRequestDate = notificationRequestDate;
	}

	public Date getNotificationScheduleDate() {
		return this.notificationScheduleDate;
	}

	public void setNotificationScheduleDate(Date notificationScheduleDate) {
		this.notificationScheduleDate = notificationScheduleDate;
	}

	public Date getNotificationSentDate() {
		return this.notificationSentDate;
	}

	public void setNotificationSentDate(Date notificationSentDate) {
		this.notificationSentDate = notificationSentDate;
	}

	public int getNotificationStatusListId() {
		return this.notificationStatusListId;
	}

	public void setNotificationStatusListId(int notificationStatusListId) {
		this.notificationStatusListId = notificationStatusListId;
	}

	public String getNotificationSubject() {
		return this.notificationSubject;
	}

	public void setNotificationSubject(String notificationSubject) {
		this.notificationSubject = notificationSubject;
	}

	public String getNotificationTo() {
		return this.notificationTo;
	}

	public void setNotificationTo(String notificationTo) {
		this.notificationTo = notificationTo;
	}

	public int getNotificationTypeListId() {
		return this.notificationTypeListId;
	}

	public void setNotificationTypeListId(int notificationTypeListId) {
		this.notificationTypeListId = notificationTypeListId;
	}

	public int getNumberOfTries() {
		return this.numberOfTries;
	}

	public void setNumberOfTries(int numberOfTries) {
		this.numberOfTries = numberOfTries;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}