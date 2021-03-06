package com.om.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userid;
	private Om om;
	private String userName;
	private String userPassword;
	private Integer userLimit;
	private Float userBalance;
	private String userEmail;
	private Boolean userSex;
	private String userMoto;
	private String userHomtown;
	private String userPhotoUrl;
	private String userLocation;
	private String userJob;
	private Date userBirthday;
	private Short userAge;
	private Boolean deleteflag;
	private Timestamp userCreatetime;
	private Set purchases = new HashSet(0);
	private Set logs = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Om om, String userPassword, Integer userLimit,
			Float userBalance, Boolean deleteflag) {
		this.om = om;
		this.userPassword = userPassword;
		this.userLimit = userLimit;
		this.userBalance = userBalance;
		this.deleteflag = deleteflag;
	}

	/** full constructor */
	public User(Om om, String userName, String userPassword, Integer userLimit,
			Float userBalance, String userEmail, Boolean userSex,
			String userMoto, String userHomtown, String userPhotoUrl,
			String userLocation, String userJob, Date userBirthday,
			Short userAge, Boolean deleteflag, Timestamp userCreatetime,
			Set purchases, Set logs) {
		this.om = om;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userLimit = userLimit;
		this.userBalance = userBalance;
		this.userEmail = userEmail;
		this.userSex = userSex;
		this.userMoto = userMoto;
		this.userHomtown = userHomtown;
		this.userPhotoUrl = userPhotoUrl;
		this.userLocation = userLocation;
		this.userJob = userJob;
		this.userBirthday = userBirthday;
		this.userAge = userAge;
		this.deleteflag = deleteflag;
		this.userCreatetime = userCreatetime;
		this.purchases = purchases;
		this.logs = logs;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Om getOm() {
		return this.om;
	}

	public void setOm(Om om) {
		this.om = om;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserLimit() {
		return this.userLimit;
	}

	public void setUserLimit(Integer userLimit) {
		this.userLimit = userLimit;
	}

	public Float getUserBalance() {
		return this.userBalance;
	}

	public void setUserBalance(Float userBalance) {
		this.userBalance = userBalance;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Boolean getUserSex() {
		return this.userSex;
	}

	public void setUserSex(Boolean userSex) {
		this.userSex = userSex;
	}

	public String getUserMoto() {
		return this.userMoto;
	}

	public void setUserMoto(String userMoto) {
		this.userMoto = userMoto;
	}

	public String getUserHomtown() {
		return this.userHomtown;
	}

	public void setUserHomtown(String userHomtown) {
		this.userHomtown = userHomtown;
	}

	public String getUserPhotoUrl() {
		return this.userPhotoUrl;
	}

	public void setUserPhotoUrl(String userPhotoUrl) {
		this.userPhotoUrl = userPhotoUrl;
	}

	public String getUserLocation() {
		return this.userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getUserJob() {
		return this.userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}

	public Date getUserBirthday() {
		return this.userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public Short getUserAge() {
		return this.userAge;
	}

	public void setUserAge(Short userAge) {
		this.userAge = userAge;
	}

	public Boolean getDeleteflag() {
		return this.deleteflag;
	}

	public void setDeleteflag(Boolean deleteflag) {
		this.deleteflag = deleteflag;
	}

	public Timestamp getUserCreatetime() {
		return this.userCreatetime;
	}

	public void setUserCreatetime(Timestamp userCreatetime) {
		this.userCreatetime = userCreatetime;
	}

	public Set getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set purchases) {
		this.purchases = purchases;
	}

	public Set getLogs() {
		return this.logs;
	}

	public void setLogs(Set logs) {
		this.logs = logs;
	}

}