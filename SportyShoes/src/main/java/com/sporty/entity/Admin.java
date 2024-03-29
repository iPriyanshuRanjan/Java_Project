package com.sporty.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;

	@Column(name = "admin_id")
	private String adminId;

	@Column(name = "admin_pwd")
	private String pwd;

	public long getID() {
		return this.ID;
	}

	public String getAdminId() {
		return this.adminId;
	}

	public String getAdminPwd() {
		return this.pwd;
	}

	public void setID(long id) {
		this.ID = id;
	}

	public void setAdminId(String value) {
		this.adminId = value;
	}

	public void setAdminPwd(String value) {
		this.pwd = value;
	}
}
