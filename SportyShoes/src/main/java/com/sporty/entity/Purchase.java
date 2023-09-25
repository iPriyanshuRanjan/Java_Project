package com.sporty.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "purchases")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;

	@Column(name = "user_id")
	private long userId;

	@Column(name = "date")
	private Date date;

	@Column(name = "gross_total")
	private BigDecimal total;

	public long getID() {
		return this.ID;
	}

	public long getUserId() {
		return this.userId;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public Date getDate() {
		return this.date;
	}

	public void setID(long id) {
		this.ID = id;
	}

	public void setUserId(long value) {
		this.userId = value;
	}

	public void setTotal(BigDecimal value) {
		this.total = value;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
