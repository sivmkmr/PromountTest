package com.promounttest.attempt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Table
@Entity
public class Attempt {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String output;
	private String input;
	
	@Column(columnDefinition = "TIMESTAMP")
	private Data dataTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public Data getDataTime() {
		return dataTime;
	}

	public void setDataTime(Data dataTime) {
		this.dataTime = dataTime;
	}
	
	
}
