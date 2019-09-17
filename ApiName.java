package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the api_names database table.
 * 
 */
@Entity
@Table(name="api_names")
public class ApiName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="API_NAME_ID")
	private int apiNameId;

	@Column(name="API_DESCRIPTION")
	private String apiDescription;

	@Column(name="API_NAME")
	private String apiName;

	//bi-directional many-to-one association to ApiRequestLog
	@OneToMany(mappedBy="apiName")
	private List<ApiRequestLog> apiRequestLogs;

	public ApiName() {
	}

	public int getApiNameId() {
		return this.apiNameId;
	}

	public void setApiNameId(int apiNameId) {
		this.apiNameId = apiNameId;
	}

	public String getApiDescription() {
		return this.apiDescription;
	}

	public void setApiDescription(String apiDescription) {
		this.apiDescription = apiDescription;
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public List<ApiRequestLog> getApiRequestLogs() {
		return this.apiRequestLogs;
	}

	public void setApiRequestLogs(List<ApiRequestLog> apiRequestLogs) {
		this.apiRequestLogs = apiRequestLogs;
	}

	public ApiRequestLog addApiRequestLog(ApiRequestLog apiRequestLog) {
		getApiRequestLogs().add(apiRequestLog);
		apiRequestLog.setApiName(this);

		return apiRequestLog;
	}

	public ApiRequestLog removeApiRequestLog(ApiRequestLog apiRequestLog) {
		getApiRequestLogs().remove(apiRequestLog);
		apiRequestLog.setApiName(null);

		return apiRequestLog;
	}

}