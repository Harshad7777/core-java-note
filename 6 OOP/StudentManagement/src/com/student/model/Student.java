package com.student.model;

public class Student {
	private int id;
	private String name;
	private int percentage;
	private boolean isResult;

	public Student() {}

	public Student(int id, String name, int percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.isResult = percentage >= 35;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
		this.isResult = percentage >= 35;
	}

	public boolean isResult() {
		return isResult;
	}

	public void setResult(boolean isResult) {
		this.isResult = isResult;
	}
}
