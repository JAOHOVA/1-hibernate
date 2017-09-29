package com.m2i.formation.dao.entity;

public class Formation {

	private int id;
	private String theme;

	// Constructeurs
	public Formation() {

	}

	public Formation(String theme) {

		this.theme = theme;
	}

	public Formation(int id) {

		this.id = id;
	}

	public Formation(int id, String theme) {

		this.id = id;
		this.theme = theme;
	}

	/*
	 * Getters
	 */
	public int getId() {
		return id;
	}

	public String getTheme() {
		return theme;
	}

	/*
	 * Setters
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
