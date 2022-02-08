package com.effectivejava.scheduling.controller.model;

public class QueryModel {

	private int id;

	private String query;

	private int frequency;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "QueryModel [id=" + id + ", query=" + query + ", frequency=" + frequency + "]";
	}

	
}
