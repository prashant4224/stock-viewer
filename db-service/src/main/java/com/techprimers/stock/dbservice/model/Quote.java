package com.techprimers.stock.dbservice.model;

import javax.persistence.*;

@Entity
@Table(name="qoutes", catalog="test")
public class Quote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "qoute")
	private String qoute;

	public Quote() {
	}
	
	public Quote(String username, String qoute) {
		this.userName = username;
		this.qoute = qoute;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}

	public String getQoute() {
		return qoute;
	}

	public void setQoute(String qoute) {
		this.qoute = qoute;
	}

	
}
