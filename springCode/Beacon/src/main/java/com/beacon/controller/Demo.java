package com.beacon.controller;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name="demos")
public class Demo {
 
    private String name;
   // private Date lastaudit;
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Employee employee;

	
    public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     
    public String toString(){
        return id+" | " + name+ " | ";
    }
     
}