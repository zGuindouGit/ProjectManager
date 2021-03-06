package com.zGuindou.ProjetManager.DAO.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Project implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String description;
	private Double budget;
	private String active;
	private Long typeId;

	@ManyToOne
	@JoinColumn(name = "typeId", referencedColumnName = "id", insertable = false, updatable = false)
	private Type type;

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(Long id, String title, String description, Double budget, String active) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.budget = budget;
		this.active = active;
	}
	
	
	
}
